package com.hidrored.aplicacion.Reportes;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ReporteDTO {

    /**
     * Default constructor
     */
    public ReporteDTO() {
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
    public String fechaCreacion;

    /**
     * 
     */
    public String fechaActualizacion;

    /**
     * 
     */
    public UbicacionDTO ubicacion;

    /**
     * 
     */
    public HistorialCambioDTO historialCambios;

    /**
     * 
     */
    public ImagenAdjuntaDTO imagenesAdjuntas;

    /**
     * 
     */
    public ComentarioDTO comentarios;

}