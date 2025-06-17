
package Servcios;

import java.util.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;


// ----------- << imports@AAAAAAGXdhK0i+RTmkg= >>
// ----------- >>

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = HistorialServicioImpl.class, name = "historialServicioImpl")
})
// ----------- << class.annotations@AAAAAAGXdhK0i+RTmkg= >>
// ----------- >>
public class IHistorialServicio {
  /**
  * @param idReporte
  */

  // ----------- << method.annotations@AAAAAAGXdhLXdOc1FGw= >>
  // ----------- >>
  public List<HistorialEstado> verHistorialPorReporte(UUID idReporte) {
  // ----------- << method.body@AAAAAAGXdhLXdOc1FGw= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXdhK0i+RTmkg= >>
// ----------- >>
}