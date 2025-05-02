package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa la aceptación de una asignación de tarea.
 * Se utiliza como respuesta ACCEPT-PROPOSAL en el protocolo FIPA-Propose para asignación de tareas.
 */
public class AceptacionTarea implements Predicate {
    private String idTarea;
    private Date fechaAceptacion;
    private Date fechaInicioReal;
    private Date fechaFinEstimada;

    // Constructores, getters y setters
    public AceptacionTarea() {
    }

    public AceptacionTarea(String idTarea, Date fechaAceptacion, Date fechaInicioReal, Date fechaFinEstimada) {
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
    public Date getFechaAceptacion() {
        return fechaAceptacion;
    }

    public void setFechaAceptacion(Date fechaAceptacion) {
        this.fechaAceptacion = fechaAceptacion;
    }

    @Slot(mandatory = true, name = "fechaInicioReal")
    public Date getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(Date fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    @Slot(mandatory = true, name = "fechaFinEstimada")
    public Date getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(Date fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }
}