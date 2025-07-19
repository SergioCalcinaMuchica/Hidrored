package com.hidrored.dominio.Reportes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.hidrored.dominio.Reportes.Modelo.Reporte;
import com.hidrored.dominio.Reportes.Modelo.EstadoReporte;
import java.util.List;

@Repository
public interface IReporteRepository extends MongoRepository<Reporte, String> {

  List<Reporte> findByUsuarioId(String usuarioId);

  List<Reporte> findByEstado(EstadoReporte estado);

}
