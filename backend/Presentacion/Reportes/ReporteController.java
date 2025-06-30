package Presentacion.Reportes;

import Aplicacion.Reportes.ReporteApplicationService;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ReporteController {

    /**
     * Default constructor
     */
    public ReporteController() {
    }

    /**
     * 
     */
    private ReporteApplicationService reporteApplicationService;

    /**
     * 
     */
    private IServicioAlmacenamientoImagen servicioAlmacenamientoImagen;

    /**
     * @param @RequestHeader usuarioId 
     * @param @RequestBody request 
     * @return
     */
    public ReporteResponse crearReporte(String usuarioId, CrearReporteRequest  request) {
        // TODO implement here
        return null;
    }

    /**
     * @param @PathVariable id 
     * @param @RequestHeader usuarioIdCambio 
     * @param @RequestBody request 
     * @return
     */
    public ReporteResponse actualizarEstadoReporte(String id, String usuarioIdCambio, ActualizarEstadoReporteRequest request) {
        // TODO implement here
        return null;
    }

    /**
     * @param @PathVariable id 
     * @param @RequestHeader usuarioId 
     * @param @RequestBody request 
     * @return
     */
    public ReporteResponse agregarComentario(String id, String  usuarioId, AgregarComentarioRequest request) {
        // TODO implement here
        return null;
    }

    /**
     * @param @PathVariable id 
     * @param @RequestHeader usuarioId 
     * @param @ModelAttribute request 
     * @return
     */
    public ReporteResponse subirImagenAdjunta(String id, String usuarioId, SubirImagenAdjuntaRequest request) {
        // TODO implement here
        return null;
    }

    /**
     * @param @PathVariable usuarioId 
     * @return
     */
    public List<ReporteResponse> obtenerReportesPorUsuario(String usuarioId) {
        // TODO implement here
        return null;
    }

    /**
     * @param @PathVariable id 
     * @return
     */
    public ReporteResponse obtenerReportePorId(String id) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<ReporteResponse> obtenerReportesPendientes() {
        // TODO implement here
        return null;
    }

}