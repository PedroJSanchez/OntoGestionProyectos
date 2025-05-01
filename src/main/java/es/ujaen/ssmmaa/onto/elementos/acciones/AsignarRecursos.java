package es.ujaen.ssmmaa.onto.elementos.acciones;


import es.ujaen.ssmmaa.onto.Vocabulario.Prioridad;
import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import es.ujaen.ssmmaa.onto.elementos.conceptos.AsignacionRecurso;
import jade.content.AgentAction;
import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.core.AID;

import java.time.Instant;
import jade.util.leap.List;

/**
 * Clase que representa la acción de asignar recursos formalmente a los proyectos.
 * Se utiliza en el protocolo FIPA-Request para la asignación de recursos.
 */
public class AsignarRecursos implements AgentAction {
    private String idProyecto;
    private List recursosAsignar;
    private Prioridad prioridad;
    private Instant fechaAsignacion;
    private String idCoalicion;  // Si la asignación es para una coalición

    public AsignarRecursos() {
    }

    public AsignarRecursos(String idProyecto, List recursosAsignar, Prioridad prioridad, Instant fechaAsignacion,
                           String idCoalicion) {
        this.idProyecto = idProyecto;
        this.recursosAsignar = recursosAsignar;
        this.prioridad = prioridad;
        this.fechaAsignacion = fechaAsignacion;
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @AggregateSlot(cardMin=2, type= AsignacionRecurso.class)
    public List getRecursosAsignar() {
        return recursosAsignar;
    }

    public void setRecursosAsignar(List recursosAsignar) {
        this.recursosAsignar = recursosAsignar;
    }

    @Slot(mandatory = true, name = "prioridad")
    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Slot(mandatory = true, name = "fechaAsignacion")
    public Instant getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Instant fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Slot(mandatory = false, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }
}