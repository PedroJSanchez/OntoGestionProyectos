package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.Vocabulario.RazonRechazoTarea;
import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa el rechazo de una asignación de tarea.
 * Se utiliza como respuesta REJECT-PROPOSAL en el protocolo FIPA-Propose para asignación de tareas.
 */
public class RechazoTarea implements Predicate {
    private String idTarea;
    private Instant fechaRechazo;
    private RazonRechazoTarea razonPrincipal;


    // Constructores, getters y setters
    public RechazoTarea() {
    }

    public RechazoTarea(String idTarea, Instant fechaRechazo, RazonRechazoTarea razonPrincipal) {
        this.idTarea = idTarea;
        this.fechaRechazo = fechaRechazo;
        this.razonPrincipal = razonPrincipal;
    }

    @Slot(mandatory = true, name = "idTarea")
    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    @Slot(mandatory = true, name = "fechaRechazo")
    public Instant getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Instant fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    @Slot(mandatory = true, name = "razonPrincipal")
    public RazonRechazoTarea getRazonPrincipal() {
        return razonPrincipal;
    }

    public void setRazonPrincipal(RazonRechazoTarea razonPrincipal) {
        this.razonPrincipal = razonPrincipal;
    }
}