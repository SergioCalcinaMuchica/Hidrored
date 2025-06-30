package Infraestructura.MongoDB;

import Dominio.Usuarios.Modelo.Usuario;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class UsuarioDocument {

    /**
     * Default constructor
     */
    public UsuarioDocument() {
    }

    /**
     * 
     */
    public String id;

    /**
     * 
     */
    public String nombre;

    /**
     * 
     */
    public String email;

    /**
     * 
     */
    public String telefono;

    /**
     * @return
     */
    public Usuario toDomain() {
        // TODO implement here
        return null;
    }

    /**
     * @param usuario
     */
    public void fromDomain(Usuario usuario) {
        // TODO implement here
    }

}