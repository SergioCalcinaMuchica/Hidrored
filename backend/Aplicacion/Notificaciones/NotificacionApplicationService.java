package Aplicacion.Notificaciones;

import Dominio.Notificaciones.NotificacionService;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class NotificacionApplicationService {

    /**
     * Default constructor
     */
    public NotificacionApplicationService() {
    }

    /**
     * 
     */
    private NotificacionService notificacionService;

    /**
     * @param command 
     * @return
     */
    public NotificacionDTO crearNotificacion(CrearNotificacionCommand command) {
        // TODO implement here
        return null;
    }

    /**
     * @param command
     */
    public void marcarNotificacionComoLeida(MarcarNotificacionLeidaCommand command) {
        // TODO implement here
    }

    /**
     * @param usuarioId 
     * @return
     */
    public List<NotificacionDTO> obtenerNotificacionesPorUsuario(String usuarioId) {
        // TODO implement here
        return null;
    }

}