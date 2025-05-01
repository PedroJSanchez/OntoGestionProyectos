package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;
import java.util.Date;


/**
 * Clase que representa la aceptación de una propuesta de proyecto.
 * Se utiliza como respuesta en el protocolo FIPA-Propose para nuevos proyectos.
 */
public class AceptacionProyecto implements Predicate {
    private String idProyecto;
    private Instant fechaAceptacion;

    public AceptacionProyecto() {
    }

    public AceptacionProyecto(String idProyecto, Instant fechaAceptacion) {
        this.idProyecto = idProyecto;
        this.fechaAceptacion = fechaAceptacion;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Slot(mandatory = true, name = "fechaAceptacion")
    public Instant getFechaAceptacion() {
        return fechaAceptacion;
    }

    public void setFechaAceptacion(Instant fechaAceptacion) {
        this.fechaAceptacion = fechaAceptacion;
    }
}