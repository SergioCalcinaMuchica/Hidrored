
package Servcios;

import java.util.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;


// ----------- << imports@AAAAAAGXdgWB00NrXCA= >>
// ----------- >>

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotificacionServicioAppImpl.class, name = "notificacionServicioAppImpl")
})
// ----------- << class.annotations@AAAAAAGXdgWB00NrXCA= >>
// ----------- >>
public class INotificacionServicioApp {
  /**
  * @param idUsuario 
  * @param mensaje
  */

  // ----------- << method.annotations@AAAAAAGXdgWuiUZN6qM= >>
  // ----------- >>
  public void enviarNotificacion(UUID idUsuario, String mensaje) {
  // ----------- << method.body@AAAAAAGXdgWuiUZN6qM= >>
  // ----------- >>
  }
  /**
  * @param idUsuario
  */

  // ----------- << method.annotations@AAAAAAGXdgXSckmiHI4= >>
  // ----------- >>
  public List<Notificacion> listarNotificaciones(UUID idUsuario) {
  // ----------- << method.body@AAAAAAGXdgXSckmiHI4= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXdgWB00NrXCA= >>
// ----------- >>
}