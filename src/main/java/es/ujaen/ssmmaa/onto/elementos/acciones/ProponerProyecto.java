package es.ujaen.ssmmaa.onto.elementos.acciones;

import es.ujaen.ssmmaa.onto.Vocabulario.Prioridad;
import es.ujaen.ssmmaa.onto.Vocabulario.LineasDesarrollo;
import es.ujaen.ssmmaa.onto.elementos.conceptos.RecursoProyecto;
import jade.content.AgentAction;

import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;

import java.util.Date;

/**
 * Clase que representa la acción de proponer un nuevo proyecto al Agente Coordinador.
 * Se utiliza en el protocolo FIPA-Propose para la propuesta de nuevos proyectos.
 */
public class ProponerProyecto implements AgentAction {
    private String idProyecto;
    private String nombreProyecto;
    private Date fechaInicio;
    private Date fechaFin;
    private Prioridad prioridad;
    private List habilidadesRequeridas;
    private List recursosEstimados;
    private double presupuesto;

    public ProponerProyecto() {
    }

    public ProponerProyecto(String idProyecto, String nombreProyecto, Date fechaInicio, Date fechaFin,
                            Prioridad prioridad, List habilidadesRequeridas, List recursosEstimados, double presupuesto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.prioridad = prioridad;
        this.habilidadesRequeridas = habilidadesRequeridas;
        this.recursosEstimados = recursosEstimados;
        this.presupuesto = presupuesto;
    }

    @Slot(mandatory = true, name = "idProyecto")
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Slot(mandatory = true, name = "nombreProyecto")
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
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

    @AggregateSlot(cardMin=2, type=LineasDesarrollo.class)
    public List getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    public void setHabilidadesRequeridas(List habilidadesRequeridas) {
        this.habilidadesRequeridas = habilidadesRequeridas;
    }

    @AggregateSlot(cardMin=2, type=RecursoProyecto.class)
    public List getRecursosEstimados() {
        return recursosEstimados;
    }

    public void setRecursosEstimados(List recursosEstimados) {
        this.recursosEstimados = recursosEstimados;
    }

    @Slot(mandatory = true, name = "presupuesto")
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}