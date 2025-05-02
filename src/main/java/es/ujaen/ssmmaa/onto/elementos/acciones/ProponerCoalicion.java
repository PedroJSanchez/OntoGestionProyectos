package es.ujaen.ssmmaa.onto.elementos.acciones;


import es.ujaen.ssmmaa.onto.Vocabulario.LineasDesarrollo;
import es.ujaen.ssmmaa.onto.Vocabulario.Prioridad;
import jade.content.AgentAction;
import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;



import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la acción de proponer la formación de una coalición.
 * Se utiliza en el protocolo FIPA-Contract-Net para la formación de coaliciones.
 */
public class ProponerCoalicion implements AgentAction {
    private String idCoalicion;
    private String idProyecto;
    private Prioridad prioridad;
    private List habilidadesRequeridas;
    private Date fechaInicio;
    private Date fechaFin;

    public ProponerCoalicion() {
    }

    public ProponerCoalicion(String idCoalicion, String idProyecto, Prioridad prioridad, List habilidadesRequeridas,
                             Date fechaInicio, Date fechaFin) {
        this.idCoalicion = idCoalicion;
        this.idProyecto = idProyecto;
        this.prioridad = prioridad;
        this.habilidadesRequeridas = habilidadesRequeridas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Slot(mandatory = true, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Slot(mandatory = true, name = "prioridad")
    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @AggregateSlot(cardMin=3, type=LineasDesarrollo.class)
    public List getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    public void setHabilidadesRequeridas(List habilidadesRequeridas) {
        this.habilidadesRequeridas = habilidadesRequeridas;
    }

    @Slot(mandatory = true, name = "fechaInicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Slot(mandatory = true, name = "fechaFin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}