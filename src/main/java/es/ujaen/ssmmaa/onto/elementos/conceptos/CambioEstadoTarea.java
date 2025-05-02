package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.EstadoTarea;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa un cambio en el estado de una tarea.
 */
public class CambioEstadoTarea implements Concept {
    private String idTarea;
    private EstadoTarea estadoAnterior;
    private EstadoTarea estadoNuevo;
    private Date fechaCambio;
    private double progresoPorcentaje;

    public CambioEstadoTarea() {
    }

    public CambioEstadoTarea(String idTarea, EstadoTarea estadoAnterior, EstadoTarea estadoNuevo, Date fechaCambio, double progresoPorcentaje) {
        this.idTarea = idTarea;
        this.estadoAnterior = estadoAnterior;
        this.estadoNuevo = estadoNuevo;
        this.fechaCambio = fechaCambio;
        this.progresoPorcentaje = progresoPorcentaje;
    }

    @Slot(mandatory = true, name = "idTarea")
    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    @Slot(mandatory = true, name = "estadoAnterior")
    public EstadoTarea getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(EstadoTarea estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    @Slot(mandatory = true, name = "estadoNuevo")
    public EstadoTarea getEstadoNuevo() {
        return estadoNuevo;
    }

    public void setEstadoNuevo(EstadoTarea estadoNuevo) {
        this.estadoNuevo = estadoNuevo;
    }

    @Slot(mandatory = true, name = "fechaCambio")
    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    @Slot(mandatory = true, name = "progresoPorcentaje")
    public double getProgresoPorcentaje() {
        return progresoPorcentaje;
    }

    public void setProgresoPorcentaje(double progresoPorcentaje) {
        this.progresoPorcentaje = progresoPorcentaje;
    }

    @Override
    public String toString() {
        return "CambioEstadoTarea{" +
                "idTarea='" + idTarea + '\'' +
                ", estadoAnterior=" + estadoAnterior +
                ", estadoNuevo=" + estadoNuevo +
                ", fechaCambio=" + fechaCambio +
                ", progresoPorcentaje=" + progresoPorcentaje +
                '}';
    }
}