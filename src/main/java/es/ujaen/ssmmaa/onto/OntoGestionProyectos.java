package es.ujaen.ssmmaa.onto;

import jade.content.onto.BeanOntology;
import jade.content.onto.BeanOntologyException;
import jade.content.onto.Ontology;
import jade.content.onto.BasicOntology;
import jade.util.Logger;

/**
 * Ontología para el sistema multiagente de gestión colaborativa de proyectos de software.
 * Esta ontología contiene todos los conceptos, acciones y predicados necesarios para
 * la comunicación entre los diferentes tipos de agentes (Coordinador, Tarea, Recursos y Decisión).
 *
 * Implementa el patrón singleton para garantizar una única instancia de la ontología.
 * Utiliza BeanOntology para facilitar el registro de clases Java como elementos de la ontología
 * mediante introspección, sin necesidad de definir manualmente cada esquema.
 */
public class OntoGestionProyectos extends BeanOntology {

    // Logger para registrar errores durante la inicialización de la ontología
    private static final Logger LOGGER = Logger.getJADELogger(OntoGestionProyectos.class.getName());

    // Instancia única de la ontología (patrón singleton)
    private static Ontology theInstance = new OntoGestionProyectos();

    /**
     * Obtiene la instancia única de la ontología.
     *
     * @return Instancia de la ontología OntoGestionProyectos.
     */
    public static Ontology getInstance() {
        return theInstance;
    }

    /**
     * Constructor privado que inicializa la ontología.
     * Registra todos los paquetes que contienen elementos de la ontología (concepts, agent actions, predicates).
     * Extiende la ontología básica de JADE para incluir tipos primitivos y vocabulario estándar.
     */
    private OntoGestionProyectos() {
        // Llamamos al constructor de la superclase con el nombre de la ontología y la ontología básica
        super(Vocabulario.ONTOLOGY_NAME, BasicOntology.getInstance());

        try {
            // Registramos los paquetes que contienen los elementos de la ontología

            // Conceptos básicos (Agente, Proyecto, Tarea, etc.)
            add("es.ujaen.ssmmaa.gestion.elementos.conceptos");

            // Acciones de los agentes (ProponerProyecto, AsignarRecursos, etc.)
            add("es.ujaen.ssmmaa.gestion.elementos.acciones");

            // Predicados para las respuestas (AceptacionProyecto, RechazoTarea, etc.)
            add("es.ujaen.ssmmaa.gestion.elementos.predicados");

        } catch (BeanOntologyException boe) {
            // Registramos el error pero permitimos que la aplicación continúe
            LOGGER.severe("Error al inicializar la ontología de gestión de proyectos: " + boe.getMessage());
            // Podríamos lanzar una RuntimeException si queremos que la aplicación falle rápido
            // throw new RuntimeException("Error al inicializar la ontología", boe);
        }
    }

    /**
     * Método para reiniciar la ontología (útil principalmente para pruebas).
     * Crea una nueva instancia de la ontología, reemplazando la existente.
     *
     * Nota: Este método debe usarse con precaución y solo en contextos de prueba.
     */
    public static void reset() {
        theInstance = new OntoGestionProyectos();
    }
}