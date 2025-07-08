package com.hidrored.presentacion.Usuarios;

import com.hidrored.aplicacion.Usuarios.UsuarioApplicationService;

import java.io.*;
import java.util.*;
import org.springframework.http.ResponseEntity;

/**
 * 
 */
public class UsuarioController {

    /**
     * Default constructor
     */
    public UsuarioController() {
    }

    /**
     * 
     */
    private UsuarioApplicationService usuarioApplicationService;

    /**
     * @param @RequestBody request 
     * @return
     */
    public UsuarioResponse registrarUsuario(RegistrarUsuarioRequest request) {
        // TODO implement here
        return null;
    }

    /**
     * @param @PathVariable id 
     * @return
     */
    public ResponseEntity<UsuarioResponse> obtenerUsuarioPorId(String id) {
        // TODO implement here
        return null;
    }

    /**
     * @param @RequestParam email 
     * @return
     */
    public ResponseEntity<UsuarioResponse> obtenerUsuarioPorEmail(String email) {
        // TODO implement here
        return null;
    }

}