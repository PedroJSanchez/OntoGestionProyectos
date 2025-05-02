package es.ujaen.ssmmaa.onto.elementos.conceptos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;


import java.util.Date;

/**
 * Clase que representa una fase de un proyecto.
 */
public class FaseProyecto implements Concept {
    private String idFase;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;

    public FaseProyecto() {
    }

    public FaseProyecto(String idFase, String nombre, Date fechaInicio, Date fechaFin) {
        this.idFase = idFase;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Slot(mandatory = true, name = "idFase")
    public String getIdFase() {
        return idFase;
    }

    public void setIdFase(String idFase) {
        this.idFase = idFase;
    }

    @Slot(mandatory = true, name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "FaseProyecto{" +
                "idFase='" + idFase + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}