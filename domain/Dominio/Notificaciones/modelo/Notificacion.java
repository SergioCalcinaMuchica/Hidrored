
package Dominio.Notificaciones.modelo;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGXWP2QXBYtmmI= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGXWP2QXBYtmmI= >>
// ----------- >>
public class Notificacion {
  // ----------- << attribute.annotations@AAAAAAGXWP3WJhrwirk= >>
  // ----------- >>
  private UUID id;

  // ----------- << attribute.annotations@AAAAAAGXWP6r7DHMkTY= >>
  // ----------- >>
  private String mensaje;

  // ----------- << attribute.annotations@AAAAAAGXWP9EUTNi88E= >>
  // ----------- >>
  private DateTime fecha;

  // ----------- << attribute.annotations@AAAAAAGXWQAS1zgW/tM= >>
  // ----------- >>
  private Boolean leida;

  public UUID getId() {
    return id;
  }

  public String getMensaje() {
    return mensaje;
  }

  public DateTime getFecha() {
    return fecha;
  }

  public Boolean getLeida() {
    return leida;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public void setFecha(DateTime fecha) {
    this.fecha = fecha;
  }

  public void setLeida(Boolean leida) {
    this.leida = leida;
  }

// ----------- << class.extras@AAAAAAGXWP2QXBYtmmI= >>
// ----------- >>
}