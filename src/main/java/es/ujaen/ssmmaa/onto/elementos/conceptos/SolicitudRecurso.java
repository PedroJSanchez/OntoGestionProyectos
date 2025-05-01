package es.ujaen.ssmmaa.onto.elementos.conceptos;


import es.ujaen.ssmmaa.onto.Vocabulario.RecursoDesarrollo;
import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 * Clase que representa una solicitud específica de un recurso.
 */
public class SolicitudRecurso implements Concept {
    private RecursoDesarrollo tipoRecurso;
    private int cantidad;

    public SolicitudRecurso() {
    }

    public SolicitudRecurso(RecursoDesarrollo tipoRecurso, int cantidad) {
        this.tipoRecurso = tipoRecurso;
        this.cantidad = cantidad;
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
}