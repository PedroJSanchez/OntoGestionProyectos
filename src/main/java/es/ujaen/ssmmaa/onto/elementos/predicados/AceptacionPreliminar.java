package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa la aceptación preliminar de una solicitud.
 * Se utiliza como respuesta AGREE en protocolos FIPA-Request.
 */
public class AceptacionPreliminar implements Predicate {
    private String idSolicitud;
    private Date fechaAceptacionPreliminar;

    public AceptacionPreliminar() {
    }

    public AceptacionPreliminar(String idSolicitud, Date fechaAceptacionPreliminar) {
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
    public Date getFechaAceptacionPreliminar() {
        return fechaAceptacionPreliminar;
    }

    public void setFechaAceptacionPreliminar(Date fechaAceptacionPreliminar) {
        this.fechaAceptacionPreliminar = fechaAceptacionPreliminar;
    }
}