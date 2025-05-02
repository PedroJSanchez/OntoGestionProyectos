package es.ujaen.ssmmaa.onto.elementos.predicados;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa la cancelación de propuestas para una coalición.
 * Se utiliza como respuesta REJECT-PROPOSAL en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class CancelacionCoalicion implements Predicate {
    private String idCoalicion;
    private Date fechaCancelacion;
    private String razonCancelacion;


    // Constructores, getters y setters
    public CancelacionCoalicion() {
    }

    public CancelacionCoalicion(String idCoalicion, Date fechaCancelacion, String razonCancelacion) {
        this.idCoalicion = idCoalicion;
        this.fechaCancelacion = fechaCancelacion;
        this.razonCancelacion = razonCancelacion;
    }

    @Slot(mandatory = true, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "fechaCancelacion")
    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    @Slot(mandatory = true, name = "razonCancelacion")
    public String getRazonCancelacion() {
        return razonCancelacion;
    }

    public void setRazonCancelacion(String razonCancelacion) {
        this.razonCancelacion = razonCancelacion;
    }
}