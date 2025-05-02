package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.util.Date;


/**
 * Clase que representa la confirmación de participación en una coalición.
 * Se utiliza como respuesta INFORM en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class ConfirmacionParticipacion implements Predicate {
    private String idCoalicion;
    private String idAgente;
    private Date fechaConfirmacion;


    // Constructores, getters y setters
    public ConfirmacionParticipacion() {
    }

    public ConfirmacionParticipacion(String idCoalicion, String idAgente, Date fechaConfirmacion) {
        this.idCoalicion = idCoalicion;
        this.idAgente = idAgente;
        this.fechaConfirmacion = fechaConfirmacion;
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

    @Slot(mandatory = true, name = "fechaConfirmacion")
    public Date getFechaConfirmacion() {
        return fechaConfirmacion;
    }

    public void setFechaConfirmacion(Date fechaConfirmacion) {
        this.fechaConfirmacion = fechaConfirmacion;
    }
}