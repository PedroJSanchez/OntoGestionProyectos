package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;

/**
 * Clase que representa la aceptación preliminar de una solicitud.
 * Se utiliza como respuesta AGREE en protocolos FIPA-Request.
 */
public class AceptacionPreliminar implements Predicate {
    private String idSolicitud;
    private Instant fechaAceptacionPreliminar;

    public AceptacionPreliminar() {
    }

    public AceptacionPreliminar(String idSolicitud, Instant fechaAceptacionPreliminar) {
        this.idSolicitud = idSolicitud;
        this.fechaAceptacionPreliminar = fechaAceptacionPreliminar;
    }

    @Slot(mandatory = true, name = "idSolicitud")
    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Slot(mandatory = true, name = "fechaAceptacionPreliminar")
    public Instant getFechaAceptacionPreliminar() {
        return fechaAceptacionPreliminar;
    }

    public void setFechaAceptacionPreliminar(Instant fechaAceptacionPreliminar) {
        this.fechaAceptacionPreliminar = fechaAceptacionPreliminar;
    }
}