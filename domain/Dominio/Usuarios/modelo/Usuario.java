
package Dominio.Usuarios.modelo;

import java.util.*;
import java.time.*;


import Dominio.Notificaciones.modelo.Notificacion;
import Dominio.Reportes.modelo.Reporte;
// ----------- << imports@AAAAAAGXWCqiQb/Fh3M= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGXWCqiQb/Fh3M= >>
// ----------- >>
public class Usuario {
  // ----------- << attribute.annotations@AAAAAAGXWCv/Ir/wDPk= >>
  // ----------- >>
  private UUID Id;

  // ----------- << attribute.annotations@AAAAAAGXWDpmRIlN7tY= >>
  // ----------- >>
  private String nombre;

  // ----------- << attribute.annotations@AAAAAAGXWDq80IlUdvo= >>
  // ----------- >>
  private String telefono;

  // ----------- << attribute.annotations@AAAAAAGXWD3MK4lbsY8= >>
  // ----------- >>
  private String email;

  // ----------- << attribute.annotations@AAAAAAGXWSytKRqCd4g= >>
  // ----------- >>
  private Set<Reporte> reportes = new HashSet<>();

  // ----------- << attribute.annotations@AAAAAAGXWffLKkmBdlA= >>
  // ----------- >>
  private Set<Notificacion> notificaciones = new HashSet<>();

  private UUID getId() {
    return Id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public String getEmail() {
    return email;
  }

  public Set<Reporte> getReportes() {
    return reportes;
  }

  public Set<Notificacion> getNotificaciones() {
    return notificaciones;
  }

  private void setId(UUID Id) {
    this.Id = Id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void linkReportes(Reporte _reportes) {
    if (_reportes != null) {
      getReportes().add(_reportes);
    }
  }

  public void linkNotificaciones(Notificacion _notificaciones) {
    if (_notificaciones != null) {
      getNotificaciones().add(_notificaciones);
    }
  }

  public void unlinkReportes(Reporte _reportes) {
    if (_reportes != null) {
      getReportes().remove(_reportes);
    }
  }

  public void unlinkReportes(Iterator<Reporte> it) {
    it.remove();
  }

  public void unlinkNotificaciones(Notificacion _notificaciones) {
    if (_notificaciones != null) {
      getNotificaciones().remove(_notificaciones);
    }
  }

  public void unlinkNotificaciones(Iterator<Notificacion> it) {
    it.remove();
  }

  // ----------- << method.annotations@AAAAAAGXWD4ZLolinQA= >>
  // ----------- >>
  public boolean validarEmail() {
  // ----------- << method.body@AAAAAAGXWD4ZLolinQA= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXWCqiQb/Fh3M= >>
// ----------- >>
}