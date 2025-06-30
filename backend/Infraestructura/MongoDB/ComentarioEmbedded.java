package Infraestructura.MongoDB;

import Dominio.Reportes.Modelo.Comentario;

import java.io.*;
import java.util.*;

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