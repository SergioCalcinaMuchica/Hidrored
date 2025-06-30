package Dominio.Usuarios.Modelo;

import Dominio.Notificaciones.Modelo.Notificacion;
import Dominio.Reportes.Modelo.Reporte;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Usuario {

    /**
     * Default constructor
     */
    public Usuario() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String telefono;

    /**
     * 
     */
    public ID id;

    /**
     * 
     */
    public Notificacion notificaciones;

    /**
     * 
     */
    public Reporte reportes;

    /**
     * @param id 
     * @param nombre 
     * @param email 
     * @param telefono
     */
    public Usuario(ID id, String nombre, String email, String telefono) {
        // TODO implement here
    }

    /**
     * @param nuevoNombre
     */
    public void actualizarNombre(String nuevoNombre) {
        // TODO implement here
    }

    /**
     * @param nuevoEmail
     */
    public void cambiarEmail(String nuevoEmail) {
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
    public String getEmail() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getTelefono() {
        // TODO implement here
        return "";
    }

}