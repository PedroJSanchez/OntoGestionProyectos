package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa la información de un recurso asignado.
 */
public class RecursoEntregado implements Concept {
    private RecursoDesarrollo tipoRecurso;
    private int cantidadAsignada;
    private Date fechaInicio;
    private Date fechaFin;

    public RecursoEntregado() {
    }

    public RecursoEntregado(RecursoDesarrollo tipoRecurso, int cantidadAsignada, Date fechaInicio, Date fechaFin) {
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
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Slot(mandatory = true, name = "fechaFin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "RecursoEntregado{" +
                "tipoRecurso=" + tipoRecurso +
                ", cantidadAsignada=" + cantidadAsignada +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}