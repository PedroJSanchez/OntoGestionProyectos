package es.ujaen.ssmmaa.onto.elementos.predicados;

import es.ujaen.ssmmaa.onto.elementos.conceptos.RecursoEntregado;
import jade.content.Predicate;



import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la confirmación de una asignación de recursos.
 * Se utiliza como respuesta INFORM en el protocolo FIPA-Request para asignación de recursos.
 */
public class AceptacionAsignacionRecursos implements Predicate {
    private String idAsignacion;
    private String idProyecto;
    private Date fechaAsignacion;
    private List recursosAsignados;


    // Constructores, getters y setters
    public AceptacionAsignacionRecursos() {
    }

    public AceptacionAsignacionRecursos(String idAsignacion, String idProyecto, Date fechaAsignacion, List recursosAsignados) {
        this.idAsignacion = idAsignacion;
        this.idProyecto = idProyecto;
        this.fechaAsignacion = fechaAsignacion;
        this.recursosAsignados = recursosAsignados;
    }

    @Slot(mandatory = true, name = "idAsignacion")
    public String getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(String idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
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