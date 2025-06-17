
package Dominio.Usuarios;

import java.util.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;


// ----------- << imports@AAAAAAGXWEbFv4nUKAg= >>
// ----------- >>

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = UsuarioRepositorioImpl.class, name = "usuarioRepositorioImpl")
})
// ----------- << class.annotations@AAAAAAGXWEbFv4nUKAg= >>
// ----------- >>
public class IUsuarioRepositorio {
  /**
  * @param usuario
  */

  // ----------- << method.annotations@AAAAAAGXWEhVyIoLtHI= >>
  // ----------- >>
  public void guardar(Usuario usuario) {
  // ----------- << method.body@AAAAAAGXWEhVyIoLtHI= >>
  // ----------- >>
  }
  /**
  * @param email
  */

  // ----------- << method.annotations@AAAAAAGXWEiO/YoRIDk= >>
  // ----------- >>
  public Usuario buscarPorEmail(String email) {
  // ----------- << method.body@AAAAAAGXWEiO/YoRIDk= >>
  // ----------- >>
  }
  /**
  * @param id
  */

  // ----------- << method.annotations@AAAAAAGXdcswRpczLps= >>
  // ----------- >>
  public void eliminarUsuario(UUID id) {
  // ----------- << method.body@AAAAAAGXdcswRpczLps= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXWEbFv4nUKAg= >>
// ----------- >>
}