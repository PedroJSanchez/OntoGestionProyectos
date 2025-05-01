package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.Vocabulario.ErrorAsignacionRecurso;
import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa un error en la asignación de recursos.
 * Se utiliza como respuesta FAILURE en el protocolo FIPA-Request para asignación de recursos.
 */
public class ErrorAsignacion implements Predicate {
    private String idSolicitud;
    private Instant fechaError;
    private ErrorAsignacionRecurso tipoError;


    // Constructores, getters y setters
    public ErrorAsignacion() {
    }

    public ErrorAsignacion(String idSolicitud, Instant fechaError, ErrorAsignacionRecurso tipoError) {
        this.idSolicitud = idSolicitud;
        this.fechaError = fechaError;
        this.tipoError = tipoError;
    }

    @Slot(mandatory = true, name = "idSolicitud")
    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Slot(mandatory = true, name = "fechaError")
    public Instant getFechaError() {
        return fechaError;
    }

    public void setFechaError(Instant fechaError) {
        this.fechaError = fechaError;
    }

    @Slot(mandatory = true, name = "tipoError")
    public ErrorAsignacionRecurso getTipoError() {
        return tipoError;
    }

    public void setTipoError(ErrorAsignacionRecurso tipoError) {
        this.tipoError = tipoError;
    }
}