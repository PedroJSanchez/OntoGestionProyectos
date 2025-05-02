package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa la aceptación de una propuesta de proyecto.
 * Se utiliza como respuesta en el protocolo FIPA-Propose para nuevos proyectos.
 */
public class AceptacionProyecto implements Predicate {
    private String idProyecto;
    private Date fechaAceptacion;

    public AceptacionProyecto() {
    }

    public AceptacionProyecto(String idProyecto, Date fechaAceptacion) {
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
    public Date getFechaAceptacion() {
        return fechaAceptacion;
    }

    public void setFechaAceptacion(Date fechaAceptacion) {
        this.fechaAceptacion = fechaAceptacion;
    }
}