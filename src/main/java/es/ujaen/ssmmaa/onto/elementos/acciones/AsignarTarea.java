package es.ujaen.ssmmaa.onto.elementos.acciones;


import es.ujaen.ssmmaa.onto.Vocabulario.LineasDesarrollo;
import es.ujaen.ssmmaa.onto.Vocabulario.Prioridad;
import jade.content.AgentAction;


import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la acción de asignar tareas específicas a los Agentes de Tarea.
 * Se utiliza en el protocolo FIPA-Propose para la asignación de tareas.
 */
public class AsignarTarea implements AgentAction {
    private String idTarea;
    private String idProyecto;
    private List habilidadesRequeridas;
    private Date fechaInicio;
    private Date fechaFin;
    private Prioridad prioridad;

    public AsignarTarea() {
    }

    public AsignarTarea(String idTarea, String idProyecto, List habilidadesRequeridas, Date fechaInicio,
                        Date fechaFin, Prioridad prioridad) {
        this.idTarea = idTarea;
        this.idProyecto = idProyecto;
        this.habilidadesRequeridas = habilidadesRequeridas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.prioridad = prioridad;
    }

    @Slot(mandatory = true, name = "idTarea")
    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @AggregateSlot(cardMin=1, type=LineasDesarrollo.class)
    public List getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    public void setHabilidadesRequeridas(List habilidadesRequeridas) {
        this.habilidadesRequeridas = habilidadesRequeridas;
    }

    @Slot(mandatory = true, name = "fechaInicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Slot(mandatory = true, name = "fechaFin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Slot(mandatory = true, name = "prioridad")
    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
}