package Infraestructura.MongoDB;

import Dominio.Reportes.Modelo.HistorialCambio;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class HistorialCambioEmbedded {

    /**
     * Default constructor
     */
    public HistorialCambioEmbedded() {
    }

    /**
     * 
     */
    public LocalDateTime fechaCambio;

    /**
     * 
     */
    public String descripcion;

    /**
     * 
     */
    public String usuarioIdCambio;


    /**
     * @return
     */
    public HistorialCambio toDomain() {
        // TODO implement here
        return null;
    }

    /**
     * @param historial
     */
    public void fromDomain(HistorialCambio historial) {
        // TODO implement here
    }

}