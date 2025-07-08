package com.hidrored.infraestructura.MongoDB;

import com.hidrored.dominio.Notificaciones.Modelo.Notificacion;
import com.hidrored.dominio.Usuarios.Modelo.ID;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class NotificacionRepositoryImpl {

    /**
     * Default constructor
     */
    public NotificacionRepositoryImpl() {
    }

    /**
     * 
     */
    private INotificacionMongoRepository mongoRepository;

    /**
     * @param notificacion 
     * @return
     */
    public Notificacion guardar(Notificacion notificacion) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Notificacion> buscarNotificacionesPendientes() {
        // TODO implement here
        return null;
    }

    /**
     * @param usuarioId 
     * @return
     */
    public List<Notificacion> buscarNotificacionesPorUsuario(ID usuarioId) {
        // TODO implement here
        return null;
    }

}