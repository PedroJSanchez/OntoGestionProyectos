package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;

import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la confirmación final de una coalición.
 * Se utiliza como respuesta ACCEPT-PROPOSAL en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class ConfirmacionCoalicion implements Predicate {
    private String idCoalicion;
    private Date fechaConfirmacion;
    private Date fechaInicioCoalicion;
    private Date fechaFinCoalicion;
    private List participantesConfirmados;


    // Constructores, getters y setters
    public ConfirmacionCoalicion() {
    }

    public ConfirmacionCoalicion(String idCoalicion, Date fechaConfirmacion, Date fechaInicioCoalicion,
                                 Date fechaFinCoalicion, List participantesConfirmados) {
        this.idCoalicion = idCoalicion;
        this.fechaConfirmacion = fechaConfirmacion;
        this.fechaInicioCoalicion = fechaInicioCoalicion;
        this.fechaFinCoalicion = fechaFinCoalicion;
        this.participantesConfirmados = participantesConfirmados;
    }

    @Slot(mandatory = true, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "fechaConfirmacion")
    public Date getFechaConfirmacion() {
        return fechaConfirmacion;
    }

    public void setFechaConfirmacion(Date fechaConfirmacion) {
        this.fechaConfirmacion = fechaConfirmacion;
    }

    @Slot(mandatory = true, name = "fechaInicioCoalicion")
    public Date getFechaInicioCoalicion() {
        return fechaInicioCoalicion;
    }

    public void setFechaInicioCoalicion(Date fechaInicioCoalicion) {
        this.fechaInicioCoalicion = fechaInicioCoalicion;
    }

    @Slot(mandatory = true, name = "fechaFinCoalicion")
    public Date getFechaFinCoalicion() {
        return fechaFinCoalicion;
    }

    public void setFechaFinCoalicion(Date fechaFinCoalicion) {
        this.fechaFinCoalicion = fechaFinCoalicion;
    }

    @AggregateSlot(cardMin=3, type=String.class)
    public List getParticipantesConfirmados() {
        return participantesConfirmados;
    }

    public void setParticipantesConfirmados(List participantesConfirmados) {
        this.participantesConfirmados = participantesConfirmados;
    }
}