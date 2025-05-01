package es.ujaen.ssmmaa.onto.elementos.acciones;


import es.ujaen.ssmmaa.onto.Vocabulario.Prioridad;
import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import es.ujaen.ssmmaa.onto.elementos.conceptos.SolicitudRecurso;
import jade.content.AgentAction;

import java.time.Instant;

import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

/**
 * Clase que representa la acción de solicitar recursos específicos.
 * Se utiliza en el protocolo FIPA-Request para la solicitud de recursos.
 */
public class SolicitarRecursos implements AgentAction {
    private String idSolicitud;
    private String idProyecto;
    private String idTarea;
    private List recursosSolicitados;
    private Prioridad prioridad;
    private Instant fechaInicio;
    private Instant fechaFin;

    public SolicitarRecursos() {
    }

    public SolicitarRecursos(String idSolicitud, String idProyecto, String idTarea, List recursosSolicitados,
                             Prioridad prioridad, Instant fechaInicio, Instant fechaFin) {
        this.idSolicitud = idSolicitud;
        this.idProyecto = idProyecto;
        this.idTarea = idTarea;
        this.recursosSolicitados = recursosSolicitados;
        this.prioridad = prioridad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Slot(mandatory = true, name = "idSolicitud")
    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Slot(mandatory = true, name = "idTarea")
    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    @AggregateSlot(cardMin=1, type= SolicitudRecurso.class)
    public List getRecursosSolicitados() {
        return recursosSolicitados;
    }

    public void setRecursosSolicitados(List recursosSolicitados) {
        this.recursosSolicitados = recursosSolicitados;
    }

    @Slot(mandatory = true, name = "prioridad")
    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Slot(mandatory = true, name = "fechaInicio")
    public Instant getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Instant fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Slot(mandatory = true, name = "fechaFin")
    public Instant getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Instant fechaFin) {
        this.fechaFin = fechaFin;
    }
}