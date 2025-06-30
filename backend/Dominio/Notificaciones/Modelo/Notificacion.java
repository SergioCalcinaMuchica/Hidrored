package Dominio.Notificaciones.Modelo;

import Dominio.Usuarios.Modelo.ID;
import Dominio.Usuarios.Modelo.Usuario;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Notificacion {

    /**
     * Default constructor
     */
    public Notificacion() {
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
    private String mensaje;

    /**
     * 
     */
    private LocalDateTime fechaCreacion;

    /**
     * 
     */
    private boolean leida;

    /**
     * 
     */
    public Usuario usuario;

    /**
     * @param id 
     * @param usuarioId 
     * @param mensaje
     */
    public Notificacion(ID id, ID usuarioId, String mensaje) {
        // TODO implement here
    }

    /**
     * 
     */
    public void marcarComoLeida() {
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
    public String getMensaje() {
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
     * @return
     */
    public boolean estaLeida() {
        // TODO implement here
        return false;
    }

}