package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa el rechazo de participación en una coalición.
 * Se utiliza como respuesta REFUSE en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class RechazoCoalicion implements Predicate {
    private String idCoalicion;
    private String idAgente;
    private Date fechaRechazo;
    private String razonPrincipal;


    // Constructores, getters y setters
    public RechazoCoalicion() {
    }

    public RechazoCoalicion(String idCoalicion, String idAgente, Date fechaRechazo, String razonPrincipal) {
        this.idCoalicion = idCoalicion;
        this.idAgente = idAgente;
        this.fechaRechazo = fechaRechazo;
        this.razonPrincipal = razonPrincipal;
    }

    @Slot(mandatory = true, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "idAgente")
    public String getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(String idAgente) {
        this.idAgente = idAgente;
    }

    @Slot(mandatory = true, name = "fechaRechazo")
    public Date getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Date fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    @Slot(mandatory = true, name = "razonPrincipal")
    public String getRazonPrincipal() {
        return razonPrincipal;
    }

    public void setRazonPrincipal(String razonPrincipal) {
        this.razonPrincipal = razonPrincipal;
    }
}