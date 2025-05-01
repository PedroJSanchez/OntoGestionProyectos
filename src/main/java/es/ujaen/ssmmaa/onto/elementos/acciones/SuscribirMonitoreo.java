package es.ujaen.ssmmaa.onto.elementos.acciones;


import jade.content.AgentAction;
import jade.content.onto.annotations.Slot;


/**
 * Clase que representa la acción de suscribirse para recibir actualizaciones periódicas.
 * Se utiliza en el protocolo FIPA-Subscribe para el monitoreo de proyectos.
 */
public class SuscribirMonitoreo implements AgentAction {
    private String idSuscripcion;
    private String idProyecto;

    public SuscribirMonitoreo() {
    }

    public SuscribirMonitoreo(String idSuscripcion, String idProyecto) {
        this.idSuscripcion = idSuscripcion;
        this.idProyecto = idProyecto;
    }

    @Slot(mandatory = true, name = "idSuscripcion")
    public String getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(String idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }
}