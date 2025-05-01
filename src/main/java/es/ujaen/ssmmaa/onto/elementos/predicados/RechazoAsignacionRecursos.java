package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.Vocabulario.RazonRechazo;
import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa el rechazo de una asignación de recursos.
 * Se utiliza como respuesta REFUSE en el protocolo FIPA-Request para asignación de recursos.
 */
public class RechazoAsignacionRecursos implements Predicate {
    private String idSolicitud;
    private Instant fechaRechazo;
    private RazonRechazo razonPrincipal;


    // Constructores, getters y setters
    public RechazoAsignacionRecursos() {
    }

    public RechazoAsignacionRecursos(String idSolicitud, Instant fechaRechazo, RazonRechazo razonPrincipal) {
        this.idSolicitud = idSolicitud;
        this.fechaRechazo = fechaRechazo;
        this.razonPrincipal = razonPrincipal;
    }

    @Slot(mandatory = true, name = "idSolicitud")
    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Slot(mandatory = true, name = "fechaRechazo")
    public Instant getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Instant fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    @Slot(mandatory = true, name = "razonPrincipal")
    public RazonRechazo getRazonPrincipal() {
        return razonPrincipal;
    }

    public void setRazonPrincipal(RazonRechazo razonPrincipal) {
        this.razonPrincipal = razonPrincipal;
    }
}
