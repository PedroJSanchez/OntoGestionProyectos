package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 * Clase que representa un recurso necesario para una coalición.
 */
public class RecursoCoalicion implements Concept {
    private RecursoDesarrollo tipoRecurso;
    private int cantidad;
    private int horasNecesarias;
    private boolean compartible;  // Si puede ser compartido entre participantes

    public RecursoCoalicion() {
    }

    public RecursoCoalicion(RecursoDesarrollo tipoRecurso, int cantidad, int horasNecesarias, boolean compartible) {
        this.tipoRecurso = tipoRecurso;
        this.cantidad = cantidad;
        this.horasNecesarias = horasNecesarias;
        this.compartible = compartible;
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

    @Slot(mandatory = true, name = "compartible")
    public boolean isCompartible() {
        return compartible;
    }

    public void setCompartible(boolean compartible) {
        this.compartible = compartible;
    }
}