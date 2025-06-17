
package Dominio.Reportes;

import java.util.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;


// ----------- << imports@AAAAAAGXWRjz4UFxm8E= >>
// ----------- >>

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = HistorialRepositorioImpl.class, name = "historialRepositorioImpl")
})
// ----------- << class.annotations@AAAAAAGXWRjz4UFxm8E= >>
// ----------- >>
public class IHistorialRepositorio {
  /**
  * @param reporteId
  */

  // ----------- << method.annotations@AAAAAAGXWRl4a0S0e0E= >>
  // ----------- >>
  public List<HistorialEstado> obtenerHistorialPorReporte(UUID reporteId) {
  // ----------- << method.body@AAAAAAGXWRl4a0S0e0E= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXWRjz4UFxm8E= >>
// ----------- >>
}