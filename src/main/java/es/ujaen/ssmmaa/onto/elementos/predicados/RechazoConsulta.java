package es.ujaen.ssmmaa.onto.elementos.predicados;


import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

import java.time.Instant;


/**
 * Clase que representa el rechazo de una consulta de estado.
 * Se utiliza como respuesta REFUSE en el protocolo adaptado FIPA-Request para consulta de estados.
 */
public class RechazoConsulta implements Predicate {
    private String idConsulta;
    private Instant fechaRechazo;
    private String razonRechazo;


    // Constructores, getters y setters
    public RechazoConsulta() {
    }

    public RechazoConsulta(String idConsulta, Instant fechaRechazo, String razonRechazo) {
        this.idConsulta = idConsulta;
        this.fechaRechazo = fechaRechazo;
        this.razonRechazo = razonRechazo;
    }

    @Slot(mandatory = true, name = "idConsulta")
    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    @Slot(mandatory = true, name = "fechaRechazo")
    public Instant getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Instant fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    @Slot(mandatory = true, name = "razonRechazo")
    public String getRazonRechazo() {
        return razonRechazo;
    }

    public void setRazonRechazo(String razonRechazo) {
        this.razonRechazo = razonRechazo;
    }
}