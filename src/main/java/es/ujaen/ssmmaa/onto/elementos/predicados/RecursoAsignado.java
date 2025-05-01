package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.elementos.conceptos.RecursoEntregado;
import jade.content.Predicate;

import java.time.Instant;

import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

/**
 * Clase que representa la confirmación de recursos asignados.
 * Se utiliza como respuesta INFORM en el protocolo FIPA-Request para solicitud de recursos.
 */
public class RecursoAsignado implements Predicate {
    private String idSolicitud;
    private String idProyecto;
    private String idTarea;
    private Instant fechaAsignacion;
    private List recursosAsignados;


    // Constructores, getters y setters
    public RecursoAsignado() {
    }

    public RecursoAsignado(String idSolicitud, String idProyecto, String idTarea, Instant fechaAsignacion, List recursosAsignados) {
        this.idSolicitud = idSolicitud;
        this.idProyecto = idProyecto;
        this.idTarea = idTarea;
        this.fechaAsignacion = fechaAsignacion;
        this.recursosAsignados = recursosAsignados;
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

    @Slot(mandatory = true, name = "fechaAsignacion")
    public Instant getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Instant fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @AggregateSlot(cardMin=1, type= RecursoEntregado.class)
    public List getRecursosAsignados() {
        return recursosAsignados;
    }

    public void setRecursosAsignados(List recursosAsignados) {
        this.recursosAsignados = recursosAsignados;
    }
}