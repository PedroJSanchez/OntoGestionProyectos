package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.elementos.conceptos.RecursoEntregado;
import jade.content.Predicate;



import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la confirmación de recursos asignados.
 * Se utiliza como respuesta INFORM en el protocolo FIPA-Request para solicitud de recursos.
 */
public class RecursoAsignado implements Predicate {
    private String idSolicitud;
    private String idProyecto;
    private String idTarea;
    private Date fechaAsignacion;
    private List recursosAsignados;


    // Constructores, getters y setters
    public RecursoAsignado() {
    }

    public RecursoAsignado(String idSolicitud, String idProyecto, String idTarea, Date fechaAsignacion, List recursosAsignados) {
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
    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
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