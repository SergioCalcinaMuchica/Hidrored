
package Dominio.Reportes;

import java.util.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

import Dominio.Reportes.modelo.Reporte;
import Dominio.Reportes.modelo.Ubicacion;
// ----------- << imports@AAAAAAGXWG0ptIzuVQU= >>
// ----------- >>

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ReporteRepositorioImpl.class, name = "reporteRepositorioImpl")
})
// ----------- << class.annotations@AAAAAAGXWG0ptIzuVQU= >>
// ----------- >>
public class IReporteRepositorio {
  /**
  * @param reporte
  */

  // ----------- << method.annotations@AAAAAAGXWG8pco0qpTI= >>
  // ----------- >>
  public void guardar(Reporte reporte) {
  // ----------- << method.body@AAAAAAGXWG8pco0qpTI= >>
  // ----------- >>
  }
  /**
  * @param id
  */

  // ----------- << method.annotations@AAAAAAGXWG9Cz4011RU= >>
  // ----------- >>
  public Reporte obtenerPorId(UUID id) {
  // ----------- << method.body@AAAAAAGXWG9Cz4011RU= >>
  // ----------- >>
  }
  /**
  * @param estado
  */

  // ----------- << method.annotations@AAAAAAGXWG9K5I07tfw= >>
  // ----------- >>
  public List<Reporte> obtenerPorEstado(Estado estado) {
  // ----------- << method.body@AAAAAAGXWG9K5I07tfw= >>
  // ----------- >>
  }
  /**
  * @param id
  */

  // ----------- << method.annotations@AAAAAAGXWG+DKI1G5Ms= >>
  // ----------- >>
  public void eliminar(UUID id) {
  // ----------- << method.body@AAAAAAGXWG+DKI1G5Ms= >>
  // ----------- >>
  }
  /**
  * @param ubicacion
  */

  // ----------- << method.annotations@AAAAAAGXWG+MjI1Rn98= >>
  // ----------- >>
  public List<Reporte> obtenerCercanos(Ubicacion ubicacion) {
  // ----------- << method.body@AAAAAAGXWG+MjI1Rn98= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXWG0ptIzuVQU= >>
// ----------- >>
}