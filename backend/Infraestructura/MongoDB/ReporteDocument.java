package Infraestructura.MongoDB;

import Dominio.Reportes.Modelo.Reporte;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ReporteDocument {

    /**
     * Default constructor
     */
    public ReporteDocument() {
    }

    /**
     * 
     */
    public String id;

    /**
     * 
     */
    public String usuarioId;

    /**
     * 
     */
    public String titulo;

    /**
     * 
     */
    public String descripcion;

    /**
     * 
     */
    public String estado;

    /**
     * 
     */
    public String tipo;

    /**
     * 
     */
    public String prioridad;

    /**
     * 
     */
    public LocalDateTime fechaCreacion;

    /**
     * 
     */
    public LocalDateTime fechaActualizacion;

    /**
     * 
     */
    public UbicacionEmbedded ubicacion;


    /**
     * 
     */
    public HistorialCambioEmbedded historialCambios;

    /**
     * 
     */
    public ComentarioEmbedded comentarios;

    /**
     * @return
     */
    public Reporte toDomain() {
        // TODO implement here
        return null;
    }

    /**
     * @param reporte
     */
    public void fromDomain(Reporte reporte) {
        // TODO implement here
    }

}