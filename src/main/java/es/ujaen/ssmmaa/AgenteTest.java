package es.ujaen.ssmmaa;

import es.ujaen.ssmmaa.onto.OntoGestionProyectos;
import es.ujaen.ssmmaa.onto.Vocabulario;
import es.ujaen.ssmmaa.onto.elementos.acciones.ProponerProyecto;
import es.ujaen.ssmmaa.onto.elementos.conceptos.RecursoProyecto;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.BeanOntologyException;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.onto.basic.Action;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.util.leap.ArrayList;

import java.time.LocalDateTime;
import java.util.Date;

public class AgenteTest extends Agent {
    // Para trabajar con la ontología
    private final ContentManager manager = getContentManager();

    // El lenguaje utilizado por el agente para la comunicación es SL
    private final Codec codec = new SLCodec();

    // La ontología que utilizará el agente
    private Ontology ontology;



    @Override
    protected void setup() {
        //Registro de la Ontología
        try {
            ontology = OntoGestionProyectos.getInstance();
        } catch (BeanOntologyException ex) {
            System.err.println("Error al cargar la ontología: " + ex.getMessage());
        }
        manager.registerLanguage(codec);
        manager.registerOntology(ontology);

        System.out.println("Hola, soy el agente " + getLocalName());
        // Aquí puedes agregar más lógica para tu agente

        ACLMessage mensaje = crearProponerProyecto();

        System.out.println("Enviando mensaje:\n " + mensaje);

        tratarMensaje(mensaje);
    }

    @Override
    protected void takeDown() {
        System.out.println("Adiós, soy el agente " + getLocalName());
        // Aquí puedes agregar más lógica para la finalización del agente
    }

    private ACLMessage crearProponerProyecto() {
        ArrayList habilidadesRequeridas = new ArrayList();
        ArrayList recursosEstimados = new ArrayList();
        ProponerProyecto nuevoProyecto;
        Action ac;

        ACLMessage mensaje = new ACLMessage(ACLMessage.PROPOSE);
        mensaje.setOntology(ontology.getName());
        mensaje.setLanguage(codec.getName());
        mensaje.addReceiver(getAID("AgenteCoordinador"));

        habilidadesRequeridas.add(Vocabulario.LineasDesarrollo.CLOUD);
        habilidadesRequeridas.add(Vocabulario.LineasDesarrollo.MOBILE);
        recursosEstimados.add(new RecursoProyecto(Vocabulario.RecursoDesarrollo.CONSULTOR_SEGURIDAD, 1, 1));
        recursosEstimados.add(new RecursoProyecto(Vocabulario.RecursoDesarrollo.DISPOSITIVOS_IOT, 1, 1));

        nuevoProyecto = new ProponerProyecto("idProyecto1", "Proyecto de Seguridad en IoT",
                new Date(), new Date(), Vocabulario.Prioridad.ALTA, habilidadesRequeridas, recursosEstimados, 10000);

        ac = new Action(this.getAID(), nuevoProyecto);

        try {
            manager.fillContent(mensaje,ac);
        } catch (Codec.CodecException | OntologyException e) {
            throw new RuntimeException(e);
        }

        return mensaje;
    }

    private void tratarMensaje(ACLMessage mensaje) {
        try {
            Action ac = (Action) manager.extractContent(mensaje);
            ProponerProyecto proponerProyecto = (ProponerProyecto) ac.getAction();

            System.out.println("Mensaje recibido: " + mensaje.getContent());
            System.out.println("ID Proyecto: " + proponerProyecto.getIdProyecto());
            System.out.println("Nombre Proyecto: " + proponerProyecto.getNombreProyecto());
            System.out.println("Fecha Inicio: " + proponerProyecto.getFechaInicio());
            System.out.println("Fecha Fin: " + proponerProyecto.getFechaFin());
            System.out.println("Prioridad: " + proponerProyecto.getPrioridad());
            System.out.println("Habilidades Requeridas: " + proponerProyecto.getHabilidadesRequeridas());
            System.out.println("Recursos Estimados: " + proponerProyecto.getRecursosEstimados());
            System.out.println("Presupuesto: " + proponerProyecto.getPresupuesto());

        } catch (Codec.CodecException | OntologyException e) {
            throw new RuntimeException(e);
        }
    }
}
