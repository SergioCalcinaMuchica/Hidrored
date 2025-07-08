package com.hidrored.dominio.Notificaciones;

import com.hidrored.dominio.Notificaciones.Modelo.Notificacion;
import com.hidrored.dominio.Usuarios.Modelo.ID;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class NotificacionService {

    /**
     * Default constructor
     */
    public NotificacionService() {
    }

    /**
     * 
     */
    private INotificacionRepository notificacionRepository;

    /**
     * @param usuarioId 
     * @param mensaje 
     * @return
     */
    public Notificacion crearNotificacion(ID usuarioId, String mensaje) {
        // TODO implement here
        return null;
    }

    /**
     * @param notificacionId
     */
    public void marcarNotificacionComoLeida(ID notificacionId) {
        // TODO implement here
    }

    /**
     * @param notificacion
     */
    public void enviarNotificacion(Notificacion notificacion) {
        // TODO implement here
    }

}