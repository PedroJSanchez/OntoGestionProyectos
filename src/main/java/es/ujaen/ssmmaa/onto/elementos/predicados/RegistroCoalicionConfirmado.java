package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;

/**
 * Clase que representa la confirmación del registro de una coalición.
 * Se utiliza como respuesta INFORM en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class RegistroCoalicionConfirmado implements Predicate {
    private String idCoalicion;
    private Instant fechaRegistro;


    // Constructores, getters y setters
    public RegistroCoalicionConfirmado() {
    }

    public RegistroCoalicionConfirmado(String idCoalicion, Instant fechaRegistro) {
        this.idCoalicion = idCoalicion;
        this.fechaRegistro = fechaRegistro;
    }

    @Slot(mandatory = true, name = "idCoalicion")
    public String getIdCoalicion() {
        return idCoalicion;
    }

    public void setIdCoalicion(String idCoalicion) {
        this.idCoalicion = idCoalicion;
    }

    @Slot(mandatory = true, name = "fechaRegistro")
    public Instant getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Instant fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}