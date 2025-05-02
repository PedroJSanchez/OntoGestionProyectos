package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.Vocabulario.RazonRechazo;
import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa el rechazo de una propuesta de proyecto.
 * Se utiliza como respuesta en el protocolo FIPA-Propose para nuevos proyectos.
 */
public class RechazoProyecto implements Predicate {
    private String idProyecto;
    private Date fechaRechazo;
    private RazonRechazo razonPrincipal;

    public RechazoProyecto() {
    }

    public RechazoProyecto(String idProyecto, Date fechaRechazo, RazonRechazo razonPrincipal) {
        this.idProyecto = idProyecto;
        this.fechaRechazo = fechaRechazo;
        this.razonPrincipal = razonPrincipal;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Slot(mandatory = true, name = "fechaRechazo")
    public Date getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Date fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    @Slot(mandatory = true, name = "razonPrincipal")
    public RazonRechazo getRazonPrincipal() {
        return razonPrincipal;
    }

    public void setRazonPrincipal(RazonRechazo razonPrincipal) {
        this.razonPrincipal = razonPrincipal;
    }
}