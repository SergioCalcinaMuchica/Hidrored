package Dominio.Reportes;

import Dominio.Reportes.Modelo.Reporte;
import Dominio.Usuarios.Modelo.ID;

import java.util.List;
import java.util.Optional;

public interface IReporteRepository {

    Reporte guardar(Reporte reporte);

    Optional<Reporte> buscarPorId(ID id);

    List<Reporte> buscarReportesPorUsuario(ID usuarioId);

    List<Reporte> buscarReportesPendientes();
}