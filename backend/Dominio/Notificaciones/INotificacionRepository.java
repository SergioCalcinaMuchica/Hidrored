package Dominio.Notificaciones;

import Dominio.Notificaciones.Modelo.Notificacion;
import Dominio.Usuarios.Modelo.ID;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class INotificacionRepository {

    /**
     * Default constructor
     */
    public INotificacionRepository() {
    }

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