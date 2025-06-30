package Dominio.Reportes.Modelo;

import Dominio.Usuarios.Modelo.ID;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Comentario {

    /**
     * Default constructor
     */
    public Comentario() {
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
    private String contenido;

    /**
     * 
     */
    private LocalDateTime fechaCreacion;

    /**
     * 
     */
    public Reporte reporte;

    /**
     * @param id 
     * @param usuarioId 
     * @param contenido 
     * @param fechaCreacion
     */
    public Comentario(ID id, ID usuarioId, String contenido, LocalDateTime fechaCreacion) {
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
    public String getContenido() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public LocalDateTime getFechaCreacion() {
        // TODO implement here
        return null;
    }

    /**
     * @param nuevoContenido
     */
    public void actualizarContenido(String nuevoContenido) {
        // TODO implement here
    }

}