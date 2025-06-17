
package Servcios;

import java.util.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

import Dominio.Reportes.modelo.DatosReporte;
import Dominio.Reportes.modelo.Reporte;
import Dominio.Reportes.modelo.Ubicacion;
// ----------- << imports@AAAAAAGXdgYxPlRfrZc= >>
// ----------- >>

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ReporteServicioImpl.class, name = "reporteServicioImpl")
})
// ----------- << class.annotations@AAAAAAGXdgYxPlRfrZc= >>
// ----------- >>
public class IReporteServicio {
  /**
  * @param datos 
  * @param descripcion 
  * @param imagenes
  */

  // ----------- << method.annotations@AAAAAAGXdgbiUXVcfhw= >>
  // ----------- >>
  public Reporte crearReporte(DatosReporte datos, String descripcion, List<Imagen> imagenes) {
  // ----------- << method.body@AAAAAAGXdgbiUXVcfhw= >>
  // ----------- >>
  }
  /**
  * @param usuarioId
  */

  // ----------- << method.annotations@AAAAAAGXdgcIvnxcISk= >>
  // ----------- >>
  public List<Reporte> verReportesPorUsuario(UUID usuarioId) {
  // ----------- << method.body@AAAAAAGXdgcIvnxcISk= >>
  // ----------- >>
  }
  /**
  * @param ubicacion
  */

  // ----------- << method.annotations@AAAAAAGXdgeOqH9P0rw= >>
  // ----------- >>
  public List<Reporte> verReportesPorUbicacion(Ubicacion ubicacion) {
  // ----------- << method.body@AAAAAAGXdgeOqH9P0rw= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXdgYxPlRfrZc= >>
// ----------- >>
}