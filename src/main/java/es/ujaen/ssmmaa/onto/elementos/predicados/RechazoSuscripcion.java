package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.Vocabulario.MotivoRechazoSuscripcion;
import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa el rechazo de una suscripción para monitoreo.
 * Se utiliza como respuesta REFUSE en el protocolo FIPA-Subscribe para monitoreo de proyectos.
 */
public class RechazoSuscripcion implements Predicate {
    private String idSuscripcion;
    private Instant fechaRechazo;
    private MotivoRechazoSuscripcion motivo;


    // Constructores, getters y setters
    public RechazoSuscripcion() {
    }

    public RechazoSuscripcion(String idSuscripcion, Instant fechaRechazo, MotivoRechazoSuscripcion motivo) {
        this.idSuscripcion = idSuscripcion;
        this.fechaRechazo = fechaRechazo;
        this.motivo = motivo;
    }

    @Slot(mandatory = true, name = "idSuscripcion")
    public String getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(String idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    @Slot(mandatory = true, name = "fechaRechazo")
    public Instant getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Instant fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    @Slot(mandatory = true, name = "motivo")
    public MotivoRechazoSuscripcion getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoRechazoSuscripcion motivo) {
        this.motivo = motivo;
    }
}