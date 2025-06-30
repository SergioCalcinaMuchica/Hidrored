package Aplicacion.Reportes;

import Dominio.Reportes.ReporteService;
import Dominio.Usuarios.UsuarioService;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ReporteApplicationService {

    /**
     * Default constructor
     */
    public ReporteApplicationService() {
    }

    /**
     * 
     */
    private ReporteService reporteService;

    /**
     * 
     */
    private UsuarioService usuarioService;

    /**
     * @param command 
     * @return
     */
    public ReporteDTO crearReporte(CrearReporteCommand command) {
        // TODO implement here
        return null;
    }

    /**
     * @param command 
     * @return
     */
    public ReporteDTO actualizarEstadoReporte(ActualizarEstadoReporteCommand command) {
        // TODO implement here
        return null;
    }

    /**
     * @param command 
     * @return
     */
    public ReporteDTO agregarComentarioAReporte(AgregarComentarioCommand command) {
        // TODO implement here
        return null;
    }

    /**
     * @param command 
     * @return
     */
    public ReporteDTO subirImagenAdjuntaAReporte(SubirImagenAdjuntaCommand command) {
        // TODO implement here
        return null;
    }

    /**
     * @param usuarioId 
     * @return
     */
    public List<ReporteDTO> obtenerReportesPorUsuario(String usuarioId) {
        // TODO implement here
        return null;
    }

    /**
     * @param reporteId 
     * @return
     */
    public ReporteDTO obtenerReportePorId(String reporteId) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<ReporteDTO> obtenerReportesPendientes() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void Operation1() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Operation2() {
        // TODO implement here
    }

}