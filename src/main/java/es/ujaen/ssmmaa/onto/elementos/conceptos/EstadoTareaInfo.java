package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.EstadoTarea;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa la información detallada del estado de una tarea.
 */
public class EstadoTareaInfo implements Concept {
    private String idTarea;
    private EstadoTarea estadoActual;
    private double progresoPorcentaje;
    private Instant ultimaActualizacion;
    private int horasInvertidas;
    private int horasRestimadas;

    public EstadoTareaInfo() {
    }

    public EstadoTareaInfo(String idTarea, EstadoTarea estadoActual, double progresoPorcentaje, Instant ultimaActualizacion,
                           int horasInvertidas, int horasRestimadas) {
        this.idTarea = idTarea;
        this.estadoActual = estadoActual;
        this.progresoPorcentaje = progresoPorcentaje;
        this.ultimaActualizacion = ultimaActualizacion;
        this.horasInvertidas = horasInvertidas;
        this.horasRestimadas = horasRestimadas;
    }

    @Slot(mandatory = true, name = "idTarea")
    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    @Slot(mandatory = true, name = "estadoActual")
    public EstadoTarea getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoTarea estadoActual) {
        this.estadoActual = estadoActual;
    }

    @Slot(mandatory = true, name = "progresoPorcentaje")
    public double getProgresoPorcentaje() {
        return progresoPorcentaje;
    }

    public void setProgresoPorcentaje(double progresoPorcentaje) {
        this.progresoPorcentaje = progresoPorcentaje;
    }

    @Slot(mandatory = true, name = "ultimaActualizacion")
    public Instant getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(Instant ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    @Slot(mandatory = true, name = "horasInvertidas")
    public int getHorasInvertidas() {
        return horasInvertidas;
    }

    public void setHorasInvertidas(int horasInvertidas) {
        this.horasInvertidas = horasInvertidas;
    }

    @Slot(mandatory = true, name = "horasRestimadas")
    public int getHorasRestimadas() {
        return horasRestimadas;
    }

    public void setHorasRestimadas(int horasRestimadas) {
        this.horasRestimadas = horasRestimadas;
    }
}