package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa una asignación específica de un recurso.
 */
public class AsignacionRecurso implements Concept {
    private RecursoDesarrollo tipoRecurso;
    private int cantidad;
    private Date fechaInicio;
    private Date fechaFin;
    private String idTarea;

    public AsignacionRecurso() {
    }

    public AsignacionRecurso(RecursoDesarrollo tipoRecurso, int cantidad, Date fechaInicio, Date fechaFin, String idTarea) {
        this.tipoRecurso = tipoRecurso;
        this.cantidad = cantidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idTarea = idTarea;
    }

    @Slot(mandatory = true, name = "tipoRecurso")
    public RecursoDesarrollo getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(RecursoDesarrollo tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    @Slot(mandatory = true, name = "cantidad")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    @Slot(mandatory = true, name = "idTarea")
    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    @Override
    public String toString() {
        return "AsignacionRecurso{" +
                "tipoRecurso=" + tipoRecurso +
                ", cantidad=" + cantidad +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", idTarea='" + idTarea + '\'' +
                '}';
    }
}