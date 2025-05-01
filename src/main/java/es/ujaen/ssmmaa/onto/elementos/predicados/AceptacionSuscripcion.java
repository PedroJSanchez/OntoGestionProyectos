package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa la aceptación de una suscripción para monitoreo.
 * Se utiliza como respuesta AGREE en el protocolo FIPA-Subscribe para monitoreo de proyectos.
 */
public class AceptacionSuscripcion implements Predicate {
    private String idSuscripcion;
    private Instant fechaAceptacion;

    // Constructores, getters y setters
    public AceptacionSuscripcion() {
    }

    public AceptacionSuscripcion(String idSuscripcion, Instant fechaAceptacion) {
        this.idSuscripcion = idSuscripcion;
        this.fechaAceptacion = fechaAceptacion;
    }

    @Slot(mandatory = true, name = "idSuscripcion")
    public String getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(String idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    @Slot(mandatory = true, name = "fechaAceptacion")
    public Instant getFechaAceptacion() {
        return fechaAceptacion;
    }

    public void setFechaAceptacion(Instant fechaAceptacion) {
        this.fechaAceptacion = fechaAceptacion;
    }
}