package Infraestructura.MongoDB;

import Dominio.Reportes.Modelo.Reporte;
import Dominio.Usuarios.Modelo.ID;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ReporteRepositoryImpl {

    /**
     * Default constructor
     */
    public ReporteRepositoryImpl() {
    }

    /**
     * 
     */
    private IReporteMongoRepository mongoRepository;

    /**
     * @param reporte 
     * @return
     */
    public Reporte guardar(Reporte reporte) {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @return
     */
    public Reporte buscarPorId(ID id) {
        // TODO implement here
        return null;
    }

    /**
     * @param usuarioId 
     * @return
     */
    public List<Reporte> buscarReportesPorUsuario(ID usuarioId) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Reporte> buscarReportesPendientes() {
        // TODO implement here
        return null;
    }

}