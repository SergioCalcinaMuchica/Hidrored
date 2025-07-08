package com.hidrored.dominio.Reportes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.hidrored.dominio.Reportes.Modelo.Reporte;
import com.hidrored.dominio.Reportes.Modelo.EstadoReporte;
import com.hidrored.dominio.Usuarios.Modelo.ID;
import java.util.List;

@Repository // Le indica a Spring que esta es una interfaz de Repositorio
public interface IReporteRepository extends MongoRepository<Reporte, ID> {

    List<Reporte> findByUsuarioId(ID usuarioId);
    List<Reporte> findByEstado(EstadoReporte estado);

}