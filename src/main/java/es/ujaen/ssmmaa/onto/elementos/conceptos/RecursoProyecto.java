package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 * Clase que representa un recurso necesario para un proyecto.
 */
public class RecursoProyecto implements Concept {
    private RecursoDesarrollo tipoRecurso;
    private int cantidad;
    private int horasEstimadas;

    public RecursoProyecto() {
    }

    public RecursoProyecto(RecursoDesarrollo tipoRecurso, int cantidad, int horasEstimadas) {
        this.tipoRecurso = tipoRecurso;
        this.cantidad = cantidad;
        this.horasEstimadas = horasEstimadas;
    }

    @Slot(mandatory = true, name = "tipoRecurso")
    public RecursoDesarrollo getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(RecursoDesarrollo tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    @Slot(mandatory = true, name = "cantidad")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Slot(mandatory = true, name = "horasEstimadas")
    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        return "RecursoProyecto{" +
                "tipoRecurso=" + tipoRecurso +
                ", cantidad=" + cantidad +
                ", horasEstimadas=" + horasEstimadas +
                '}';
    }
}