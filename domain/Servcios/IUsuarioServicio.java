
package Servcios;

import java.util.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

import Dominio.Usuarios.modelo.Usuario;
// ----------- << imports@AAAAAAGXdgPn2ApvvhI= >>
// ----------- >>

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = UsuarioServicioImpl.class, name = "usuarioServicioImpl")
})
// ----------- << class.annotations@AAAAAAGXdgPn2ApvvhI= >>
// ----------- >>
public class IUsuarioServicio {
  /**
  * @param nombre 
  * @param telefono 
  * @param email
  */

  // ----------- << method.annotations@AAAAAAGXdgQR+A1RBZg= >>
  // ----------- >>
  public Usuario registrarUsuario(String nombre, String telefono, String email) {
  // ----------- << method.body@AAAAAAGXdgQR+A1RBZg= >>
  // ----------- >>
  }
  /**
  * @param idUsuario 
  * @param nuevosDatos
  */

  // ----------- << method.annotations@AAAAAAGXdgRGUhMY2L8= >>
  // ----------- >>
  public void editarPerfil(UUID idUsuario, ... nuevosDatos) {
  // ----------- << method.body@AAAAAAGXdgRGUhMY2L8= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXdgPn2ApvvhI= >>
// ----------- >>
}