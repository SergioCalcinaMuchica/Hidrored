package Dominio.Reportes;

import Dominio.Usuarios.IUsuarioRepository;
import Dominio.Reportes.Modelo.Reporte;
import Dominio.Usuarios.Modelo.ID;
import Dominio.Reportes.Modelo.Ubicacion;
import Dominio.Reportes.Modelo.TipoReporte;
import Dominio.Reportes.Modelo.PrioridadReporte;
import Dominio.Reportes.Modelo.EstadoReporte;
import Dominio.Reportes.Modelo.ImagenAdjunta;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ReporteService {

    /**
     * Default constructor
     */
    public ReporteService() {
    }

    /**
     * 
     */
    private IUsuarioRepository usuarioRepository;

    /**
     * 
     */
    public IReporteRepository reporteRepository;

    /**
     * @param usuarioId 
     * @param titulo 
     * @param descripcion 
     * @param ubicacion 
     * @param tipo 
     * @param prioridad 
     * @return
     */
    public Reporte crearNuevoReporte(ID usuarioId, String titulo, String descripcion, Ubicacion ubicacion, TipoReporte tipo, PrioridadReporte prioridad) {
        // TODO implement here
        return null;
    }

    /**
     * @param reporteId 
     * @param nuevoEstado 
     * @param usuarioIdCambio 
     * @param motivo 
     * @return
     */
    public Reporte procesarCambioEstadoReporte(ID reporteId, EstadoReporte nuevoEstado, ID usuarioIdCambio, String motivo) {
        // TODO implement here
        return null;
    }

    /**
     * @param reporteId 
     * @param usuarioId 
     * @param contenido 
     * @return
     */
    public Reporte agregarComentarioAReporte(ID reporteId, ID usuarioId, String contenido) {
        // TODO implement here
        return null;
    }

    /**
     * @param reporteId 
     * @param imagen 
     * @return
     */
    public Reporte agregarImagenAdjuntaAReporte(ID reporteId, ImagenAdjunta imagen) {
        // TODO implement here
        return null;
    }

}