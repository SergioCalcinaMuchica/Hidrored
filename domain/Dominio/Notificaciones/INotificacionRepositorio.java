
package Dominio.Notificaciones;

import java.util.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;


// ----------- << imports@AAAAAAGXWQCcTlSXsJ4= >>
// ----------- >>

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotificacionRepositorioImpl.class, name = "notificacionRepositorioImpl")
})
// ----------- << class.annotations@AAAAAAGXWQCcTlSXsJ4= >>
// ----------- >>
public class INotificacionRepositorio {
  /**
  * @param usuarioId
  */

  // ----------- << method.annotations@AAAAAAGXWQE2PFehjzk= >>
  // ----------- >>
  public List<Notificacion> listarPorUsuario(UUID usuarioId) {
  // ----------- << method.body@AAAAAAGXWQE2PFehjzk= >>
  // ----------- >>
  }
  /**
  * @param notificacionId
  */

  // ----------- << method.annotations@AAAAAAGXWQFFNVnjfTw= >>
  // ----------- >>
  public void marcarComoLeida(UUID notificacionId) {
  // ----------- << method.body@AAAAAAGXWQFFNVnjfTw= >>
  // ----------- >>
  }
  /**
  * @param notificacionId
  */

  // ----------- << method.annotations@AAAAAAGXdcm7+zQQNvk= >>
  // ----------- >>
  public void eliminarNotificacion(UUID notificacionId) {
  // ----------- << method.body@AAAAAAGXdcm7+zQQNvk= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXWQCcTlSXsJ4= >>
// ----------- >>
}