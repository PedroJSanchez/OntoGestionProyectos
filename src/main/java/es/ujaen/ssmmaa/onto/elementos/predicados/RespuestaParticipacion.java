package es.ujaen.ssmmaa.onto.elementos.predicados;


import es.ujaen.ssmmaa.onto.Vocabulario.LineasDesarrollo;
import jade.content.Predicate;



import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la respuesta de participación en una coalición.
 * Se utiliza como respuesta PROPOSE en el protocolo FIPA-Contract-Net para formación de coaliciones.
 */
public class RespuestaParticipacion implements Predicate {
    private String idCoalicion;
    private String idAgente;
    private List habilidadesOfrecidas;
    private int horasDisponibles;
    private Date fechaInicioDisponibilidad;
    private Date fechaFinDisponibilidad;

    // Constructores, getters y setters
    public RespuestaParticipacion() {
    }

    public RespuestaParticipacion(String idCoalicion, String idAgente, List habilidadesOfrecidas, int horasDisponibles,
                                   Date fechaInicioDisponibilidad, Date fechaFinDisponibilidad) {
        this.idCoalicion = idCoalicion;
        this.idAgente = idAgente;
        this.habilidadesOfrecidas = habilidadesOfrecidas;
        this.horasDisponibles = horasDisponibles;
        this.fechaInicioDisponibilidad = fechaInicioDisponibilidad;
        this.fechaFinDisponibilidad = fechaFinDisponibilidad;
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

    @AggregateSlot(cardMin=1, type=LineasDesarrollo.class)
    public List getHabilidadesOfrecidas() {
        return habilidadesOfrecidas;
    }

    public void setHabilidadesOfrecidas(List habilidadesOfrecidas) {
        this.habilidadesOfrecidas = habilidadesOfrecidas;
    }

    @Slot(mandatory = true, name = "horasDisponibles")
    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    @Slot(mandatory = true, name = "fechaInicioDisponibilidad")
    public Date getFechaInicioDisponibilidad() {
        return fechaInicioDisponibilidad;
    }

    public void setFechaInicioDisponibilidad(Date fechaInicioDisponibilidad) {
        this.fechaInicioDisponibilidad = fechaInicioDisponibilidad;
    }

    @Slot(mandatory = true, name = "fechaFinDisponibilidad")
    public Date getFechaFinDisponibilidad() {
        return fechaFinDisponibilidad;
    }

    public void setFechaFinDisponibilidad(Date fechaFinDisponibilidad) {
        this.fechaFinDisponibilidad = fechaFinDisponibilidad;
    }
}