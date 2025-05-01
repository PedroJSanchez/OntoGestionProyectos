package es.ujaen.ssmmaa.onto.elementos.acciones;


import jade.content.AgentAction;
import jade.content.onto.annotations.Slot;

/**
 * Clase que representa la acción de cancelar una suscripción existente.
 * Se utiliza en el protocolo FIPA-Subscribe para el monitoreo de proyectos.
 */
public class CancelacionSuscripcion implements AgentAction {
    private String idSuscripcion;


    // Constructores, getters y setters
    public CancelacionSuscripcion() {
    }

    public CancelacionSuscripcion(String idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    @Slot(mandatory = true, name = "idSuscripcion")
    public String getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(String idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }
}