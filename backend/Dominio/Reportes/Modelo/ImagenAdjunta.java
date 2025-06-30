package Dominio.Reportes.Modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ImagenAdjunta {

    /**
     * Default constructor
     */
    public ImagenAdjunta() {
    }

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String nombreArchivo;

    /**
     * 
     */
    private String tipoMime;

    /**
     * 
     */
    private Long tamanioBytes;

    /**
     * 
     */
    private LocalDateTime fechaSubida;


    /**
     * @param url 
     * @param nombreArchivo 
     * @param tipoMime 
     * @param tamanioBytes 
     * @param fechaSubida
     */
    public ImagenAdjunta(String url, String nombreArchivo, String tipoMime, Long tamanioBytes, LocalDateTime fechaSubida) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getUrl() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getNombreArchivo() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getTipoMime() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Long getTamanioBytes() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public LocalDateTime getFechaSubida() {
        // TODO implement here
        return null;
    }

    /**
     * @param other 
     * @return
     */
    public boolean equals(ImagenAdjunta other) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}