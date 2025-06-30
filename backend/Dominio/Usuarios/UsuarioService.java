package Dominio.Usuarios;

import Dominio.Usuarios.Modelo.Usuario;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class UsuarioService {

    /**
     * Default constructor
     */
    public UsuarioService() {
    }

    /**
     * 
     */
    public IUsuarioRepository repositorio;

    /**
     * @param nombre 
     * @param email 
     * @param telefono 
     * @return
     */
    public Usuario registrarNuevoUsuario(String nombre, String email, String telefono) {
        // TODO implement here
        return null;
    }

    /**
     * @param email 
     * @param password 
     * @return
     */
    public Usuario autenticarUsuario(String email, String password) {
        // TODO implement here
        return null;
    }

}