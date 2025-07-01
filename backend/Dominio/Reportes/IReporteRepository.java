package Dominio.Reportes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import Dominio.Reportes.Modelo.Reporte;
import Dominio.Reportes.Modelo.EstadoReporte;
import Dominio.Usuarios.Modelo.ID;
import java.util.List;

@Repository // Le indica a Spring que esta es una interfaz de Repositorio
public interface IReporteRepository extends MongoRepository<Reporte, ID> {

    List<Reporte> findByUsuarioId(ID usuarioId);
    List<Reporte> findByEstado(EstadoReporte estado);

}