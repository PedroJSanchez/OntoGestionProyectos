package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa la confirmación de reserva de recursos para una coalición.
 * Se utiliza como respuesta INFORM en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class ReservaRecursosConfirmada implements Predicate {
    private String idCoalicion;
    private Date fechaConfirmacion;

    public ReservaRecursosConfirmada() {
    }

    public ReservaRecursosConfirmada(String idCoalicion, Date fechaConfirmacion) {
        this.idCoalicion = idCoalicion;
        this.fechaConfirmacion = fechaConfirmacion;
    }

    @Slot(mandatory = true, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "fechaConfirmacion")
    public Date getFechaConfirmacion() {
        return fechaConfirmacion;
    }

    public void setFechaConfirmacion(Date fechaConfirmacion) {
        this.fechaConfirmacion = fechaConfirmacion;
    }
}