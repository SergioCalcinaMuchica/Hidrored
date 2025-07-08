package com.hidrored.infraestructura.MongoDB;

import com.hidrored.dominio.Reportes.Modelo.Reporte;

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

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