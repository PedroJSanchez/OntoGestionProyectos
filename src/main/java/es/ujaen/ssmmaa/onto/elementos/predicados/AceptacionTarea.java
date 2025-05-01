package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;

/**
 * Clase que representa la aceptación de una asignación de tarea.
 * Se utiliza como respuesta ACCEPT-PROPOSAL en el protocolo FIPA-Propose para asignación de tareas.
 */
public class AceptacionTarea implements Predicate {
    private String idTarea;
    private Instant fechaAceptacion;
    private Instant fechaInicioReal;
    private Instant fechaFinEstimada;

    // Constructores, getters y setters
    public AceptacionTarea() {
    }

    public AceptacionTarea(String idTarea, Instant fechaAceptacion, Instant fechaInicioReal, Instant fechaFinEstimada) {
        this.idTarea = idTarea;
        this.fechaAceptacion = fechaAceptacion;
        this.fechaInicioReal = fechaInicioReal;
        this.fechaFinEstimada = fechaFinEstimada;
    }

    @Slot(mandatory = true, name = "idTarea")
    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    @Slot(mandatory = true, name = "fechaAceptacion")
    public Instant getFechaAceptacion() {
        return fechaAceptacion;
    }

    public void setFechaAceptacion(Instant fechaAceptacion) {
        this.fechaAceptacion = fechaAceptacion;
    }

    @Slot(mandatory = true, name = "fechaInicioReal")
    public Instant getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(Instant fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    @Slot(mandatory = true, name = "fechaFinEstimada")
    public Instant getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(Instant fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }
}