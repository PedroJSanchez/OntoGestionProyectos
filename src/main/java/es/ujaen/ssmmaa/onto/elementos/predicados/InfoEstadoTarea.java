package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.elementos.conceptos.EstadoTareaInfo;
import es.ujaen.ssmmaa.onto.elementos.conceptos.RecursoEntregado;
import jade.content.Predicate;



import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la información detallada del estado de tareas.
 * Se utiliza como respuesta INFORM en el protocolo adaptado FIPA-Request para consulta de estados.
 */
public class InfoEstadoTarea implements Predicate {
    private String idConsulta;
    private String idProyecto;
    private List estadosTareas;
    private double progresoGlobalPorcentaje;
    private List recursosAsignados;
    private Date fechaActualizacion;

    // Constructores, getters y setters
    public InfoEstadoTarea() {
    }

    public InfoEstadoTarea(String idConsulta, String idProyecto, List estadosTareas, double progresoGlobalPorcentaje,
                           List recursosAsignados, Date fechaActualizacion) {
        this.idConsulta = idConsulta;
        this.idProyecto = idProyecto;
        this.estadosTareas = estadosTareas;
        this.progresoGlobalPorcentaje = progresoGlobalPorcentaje;
        this.recursosAsignados = recursosAsignados;
        this.fechaActualizacion = fechaActualizacion;
    }

    @Slot(mandatory = true, name = "idConsulta")
    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @AggregateSlot(cardMin=1, type= EstadoTareaInfo.class)
    public List getEstadosTareas() {
        return estadosTareas;
    }

    public void setEstadosTareas(List estadosTareas) {
        this.estadosTareas = estadosTareas;
    }

    @Slot(mandatory = true, name = "progresoGlobalPorcentaje")
    public double getProgresoGlobalPorcentaje() {
        return progresoGlobalPorcentaje;
    }

    public void setProgresoGlobalPorcentaje(double progresoGlobalPorcentaje) {
        this.progresoGlobalPorcentaje = progresoGlobalPorcentaje;
    }

    @AggregateSlot(cardMin=1, type= RecursoEntregado.class)
    public List getRecursosAsignados() {
        return recursosAsignados;
    }

    public void setRecursosAsignados(List recursosAsignados) {
        this.recursosAsignados = recursosAsignados;
    }

    @Slot(mandatory = true, name = "fechaActualizacion")
    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}