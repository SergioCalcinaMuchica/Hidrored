package Dominio.Reportes.Modelo;

import Dominio.Usuarios.Modelo.ID;
import Dominio.Usuarios.Modelo.Usuario;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Reporte {

    /**
     * Default constructor
     */
    public Reporte() {
    }

    /**
     * 
     */
    private ID id;

    /**
     * 
     */
    private ID usuarioId;

    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private LocalDateTime fechaCreacion;

    /**
     * 
     */
    private LocalDateTime fechaActualizacion;

    /**
     * 
     */
    private PrioridadReporte prioridad;

    /**
     * 
     */
    public TipoReporte tipo;

    /**
     * 
     */
    public EstadoReporte estado;

    /**
     * 
     */
    public Comentario comentarios;

    /**
     * 
     */
    public HistorialCambio historialCambios;

    /**
     * 
     */
    public ImagenAdjunta imagenesAdjuntas;

    /**
     * 
     */
    public Usuario usuario;

    /**
     * @param id 
     * @param usuarioId 
     * @param titulo 
     * @param descripcion 
     * @param ubicacion 
     * @param tipo 
     * @param prioridad
     */
    public Reporte(ID id, ID usuarioId, String titulo, String descripcion, Ubicacion ubicacion, TipoReporte tipo, PrioridadReporte prioridad) {
        // TODO implement here
    }

    /**
     * @param nuevoEstado 
     * @param usuarioIdCambio 
     * @param motivo
     */
    public void actualizarEstado(EstadoReporte nuevoEstado, ID usuarioIdCambio, String motivo) {
        // TODO implement here
    }

    /**
     * @param nuevaDescripcion 
     * @param usuarioIdCambio
     */
    public void actualizarDescripcion(String nuevaDescripcion, ID usuarioIdCambio) {
        // TODO implement here
    }

    /**
     * @param imagen
     */
    public void agregarImagenAdjunta(ImagenAdjunta imagen) {
        // TODO implement here
    }

    /**
     * @param comentario
     */
    public void agregarComentario(Comentario comentario) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ID getId() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ID getUsuarioId() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getTitulo() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getDescripcion() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Ubicacion getUbicacion() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public EstadoReporte getEstado() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public TipoReporte getTipo() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public PrioridadReporte getPrioridad() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public LocalDateTime getFechaCreacion() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public LocalDateTime getFechaActualizacion() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void getHistorialCambios() {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<ImagenAdjunta> getImagenesAdjuntas() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Comentario> getComentarios() {
        // TODO implement here
        return null;
    }

}