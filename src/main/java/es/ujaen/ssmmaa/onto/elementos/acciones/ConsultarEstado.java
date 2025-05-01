package es.ujaen.ssmmaa.onto.elementos.acciones;


import jade.content.AgentAction;

import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

/**
 * Clase que representa la acción de consultar el estado actual de tareas y proyectos.
 * Se utiliza en el protocolo adaptado FIPA-Request para la consulta de estados.
 */
public class ConsultarEstado implements AgentAction {
    private String idConsulta;
    private String idProyecto;
    private List idsTareas;

    public ConsultarEstado() {
    }

    public ConsultarEstado(String idConsulta, String idProyecto, List idsTareas) {
        this.idConsulta = idConsulta;
        this.idProyecto = idProyecto;
        this.idsTareas = idsTareas;
    }

    @Slot(mandatory = true, name = "idConsulta")
    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @AggregateSlot(cardMin=1, type=String.class)
    public List getIdsTareas() {
        return idsTareas;
    }

    public void setIdsTareas(List idsTareas) {
        this.idsTareas = idsTareas;
    }
}