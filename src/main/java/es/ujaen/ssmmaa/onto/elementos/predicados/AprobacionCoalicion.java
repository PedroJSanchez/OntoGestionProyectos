package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa la aprobación de una coalición por el Agente de Decisión.
 * Se utiliza como respuesta PROPOSE en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class AprobacionCoalicion implements Predicate {
    private String idCoalicion;
    private Date fechaAprobacion;
    private Date fechaRevision;

    // Constructores, getters y setters
    public AprobacionCoalicion() {
    }

    public AprobacionCoalicion(String idCoalicion, Date fechaAprobacion, Date fechaRevision) {
        this.idCoalicion = idCoalicion;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaRevision = fechaRevision;
    }

    @Slot(mandatory = true, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "fechaAprobacion")
    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    @Slot(mandatory = true, name = "fechaRevision")
    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }
}