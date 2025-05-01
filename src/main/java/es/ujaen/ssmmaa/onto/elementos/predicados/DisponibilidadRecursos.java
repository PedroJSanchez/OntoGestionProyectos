package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.elementos.conceptos.RecursoEntregado;
import jade.content.Predicate;

import java.time.Instant;

import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

/**
 * Clase que representa la disponibilidad de recursos para una coalición.
 * Se utiliza como respuesta PROPOSE en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class DisponibilidadRecursos implements Predicate {
    private String idCoalicion;
    private Instant fechaDisponibilidad;
    private List recursosDisponibles;
    private Instant periodoValidez;

    // Constructores, getters y setters
    public DisponibilidadRecursos() {
    }

    public DisponibilidadRecursos(String idCoalicion, Instant fechaDisponibilidad, List recursosDisponibles, Instant periodoValidez) {
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
    public Instant getFechaDisponibilidad() {
        return fechaDisponibilidad;
    }

    public void setFechaDisponibilidad(Instant fechaDisponibilidad) {
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
    public Instant getPeriodoValidez() {
        return periodoValidez;
    }

    public void setPeriodoValidez(Instant periodoValidez) {
        this.periodoValidez = periodoValidez;
    }
}