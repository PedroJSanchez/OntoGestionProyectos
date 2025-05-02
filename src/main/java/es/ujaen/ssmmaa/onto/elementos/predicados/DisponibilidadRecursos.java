package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.elementos.conceptos.RecursoEntregado;
import jade.content.Predicate;


import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la disponibilidad de recursos para una coalición.
 * Se utiliza como respuesta PROPOSE en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class DisponibilidadRecursos implements Predicate {
    private String idCoalicion;
    private Date fechaDisponibilidad;
    private List recursosDisponibles;
    private Date periodoValidez;

    // Constructores, getters y setters
    public DisponibilidadRecursos() {
    }

    public DisponibilidadRecursos(String idCoalicion, Date fechaDisponibilidad, List recursosDisponibles, Date periodoValidez) {
        this.idCoalicion = idCoalicion;
        this.fechaDisponibilidad = fechaDisponibilidad;
        this.recursosDisponibles = recursosDisponibles;
        this.periodoValidez = periodoValidez;
    }

    @Slot(mandatory = true, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "fechaDisponibilidad")
    public Date getFechaDisponibilidad() {
        return fechaDisponibilidad;
    }

    public void setFechaDisponibilidad(Date fechaDisponibilidad) {
        this.fechaDisponibilidad = fechaDisponibilidad;
    }

    @AggregateSlot(cardMin=1, type= RecursoEntregado.class)
    public List getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(List recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    @Slot(mandatory = true, name = "periodoValidez")
    public Date getPeriodoValidez() {
        return periodoValidez;
    }

    public void setPeriodoValidez(Date periodoValidez) {
        this.periodoValidez = periodoValidez;
    }
}