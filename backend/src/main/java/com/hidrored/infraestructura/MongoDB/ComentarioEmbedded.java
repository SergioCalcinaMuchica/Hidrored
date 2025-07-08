package com.hidrored.infraestructura.MongoDB;

import com.hidrored.dominio.Reportes.Modelo.Comentario;

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

/**
 * 
 */
public class ComentarioEmbedded {

    /**
     * Default constructor
     */
    public ComentarioEmbedded() {
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
    public String contenido;

    /**
     * 
     */
    public LocalDateTime fechaCreacion;


    /**
     * @return
     */
    public Comentario toDomain() {
        // TODO implement here
        return null;
    }

    /**
     * @param comentario
     */
    public void fromDomain(Comentario comentario) {
        // TODO implement here
    }

}