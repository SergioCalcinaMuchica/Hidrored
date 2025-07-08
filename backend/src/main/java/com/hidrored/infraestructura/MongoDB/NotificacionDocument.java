package com.hidrored.infraestructura.MongoDB;

import com.hidrored.dominio.Notificaciones.Modelo.Notificacion;

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

/**
 * 
 */
public class NotificacionDocument {

    /**
     * Default constructor
     */
    public NotificacionDocument() {
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
    public String mensaje;

    /**
     * 
     */
    public LocalDateTime fechaCreacion;

    /**
     * 
     */
    public boolean leida;

    /**
     * @return
     */
    public Notificacion toDomain() {
        // TODO implement here
        return null;
    }

    /**
     * @param notificacion
     */
    public void fromDomain(Notificacion notificacion) {
        // TODO implement here
    }

}