package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa la confirmación de cancelación de una suscripción.
 * Se utiliza como respuesta INFORM en el protocolo FIPA-Subscribe para monitoreo de proyectos.
 */
public class ConfirmacionCancelacion implements Predicate {
    private String idSuscripcion;
    private Instant fechaCancelacion;
    private String mensajeConfirmacion;

    // Constructores, getters y setters
    public ConfirmacionCancelacion() {
    }

    public ConfirmacionCancelacion(String idSuscripcion, Instant fechaCancelacion, String mensajeConfirmacion) {
        this.idSuscripcion = idSuscripcion;
        this.fechaCancelacion = fechaCancelacion;
        this.mensajeConfirmacion = mensajeConfirmacion;
    }

    @Slot(mandatory = true, name = "idSuscripcion")
    public String getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(String idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    @Slot(mandatory = true, name = "fechaCancelacion")
    public Instant getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Instant fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    @Slot(mandatory = true, name = "mensajeConfirmacion")
    public String getMensajeConfirmacion() {
        return mensajeConfirmacion;
    }

    public void setMensajeConfirmacion(String mensajeConfirmacion) {
        this.mensajeConfirmacion = mensajeConfirmacion;
    }
}