package com.hidrored.infraestructura.MongoDB;

import com.hidrored.dominio.Reportes.Modelo.ImagenAdjunta;

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

/**
 * 
 */
public class ImagenAdjuntaEmbedded {

    /**
     * Default constructor
     */
    public ImagenAdjuntaEmbedded() {
    }

    /**
     * 
     */
    public String url;

    /**
     * 
     */
    public String nombreArchivo;

    /**
     * 
     */
    public String tipoMime;

    /**
     * 
     */
    public Long tamanioBytes;

    /**
     * 
     */
    public LocalDateTime fechaSubida;


    /**
     * @return
     */
    public ImagenAdjunta toDomain() {
        // TODO implement here
        return null;
    }

    /**
     * @param imagen
     */
    public void fromDomain(ImagenAdjunta imagen) {
        // TODO implement here
    }

}