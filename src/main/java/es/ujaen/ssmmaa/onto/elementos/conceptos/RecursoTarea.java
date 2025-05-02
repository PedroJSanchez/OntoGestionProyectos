package es.ujaen.ssmmaa.onto.elementos.conceptos;

import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 * Clase que representa un recurso necesario para una tarea.
 */
public class RecursoTarea implements Concept {
    private RecursoDesarrollo tipoRecurso;
    private int cantidad;
    private int horasNecesarias;

    public RecursoTarea() {
    }

    public RecursoTarea(RecursoDesarrollo tipoRecurso, int cantidad, int horasNecesarias) {
        this.tipoRecurso = tipoRecurso;
        this.cantidad = cantidad;
        this.horasNecesarias = horasNecesarias;
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

    @Slot(mandatory = true, name = "horasNecesarias")
    public int getHorasNecesarias() {
        return horasNecesarias;
    }

    public void setHorasNecesarias(int horasNecesarias) {
        this.horasNecesarias = horasNecesarias;
    }

    @Override
    public String toString() {
        return "RecursoTarea{" +
                "tipoRecurso=" + tipoRecurso +
                ", cantidad=" + cantidad +
                ", horasNecesarias=" + horasNecesarias +
                '}';
    }
}