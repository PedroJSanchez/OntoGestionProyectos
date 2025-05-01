package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa la información de un recurso asignado.
 */
public class RecursoEntregado implements Concept {
    private RecursoDesarrollo tipoRecurso;
    private int cantidadAsignada;
    private Instant fechaInicio;
    private Instant fechaFin;

    public RecursoEntregado() {
    }

    public RecursoEntregado(RecursoDesarrollo tipoRecurso, int cantidadAsignada, Instant fechaInicio, Instant fechaFin) {
        this.tipoRecurso = tipoRecurso;
        this.cantidadAsignada = cantidadAsignada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Slot(mandatory = true, name = "tipoRecurso")
    public RecursoDesarrollo getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(RecursoDesarrollo tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    @Slot(mandatory = true, name = "cantidadAsignada")
    public int getCantidadAsignada() {
        return cantidadAsignada;
    }

    public void setCantidadAsignada(int cantidadAsignada) {
        this.cantidadAsignada = cantidadAsignada;
    }

    @Slot(mandatory = true, name = "fechaInicio")
    public Instant getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Instant fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Slot(mandatory = true, name = "fechaFin")
    public Instant getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Instant fechaFin) {
        this.fechaFin = fechaFin;
    }
}