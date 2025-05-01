package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;


/**
 * Clase que representa un recurso disponible para una coalición.
 */
public class Recurso implements Concept {
    private RecursoDesarrollo tipoRecurso;
    private int cantidadDisponible;

    public Recurso() {
    }

    public Recurso(RecursoDesarrollo tipoRecurso, int cantidadDisponible) {
        this.tipoRecurso = tipoRecurso;
        this.cantidadDisponible = cantidadDisponible;
    }

    @Slot(mandatory = true, name = "tipoRecurso")
    public RecursoDesarrollo getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(RecursoDesarrollo tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    @Slot(mandatory = true, name = "cantidadDisponible")
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}