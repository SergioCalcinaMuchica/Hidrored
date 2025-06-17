
package Dominio.Reportes.modelo;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGXWFpI74tz40Y= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGXWFpI74tz40Y= >>
// ----------- >>
public class DatosReporte {
  // ----------- << attribute.annotations@AAAAAAGXWF7QxIw+Zo8= >>
  // ----------- >>
  private Date fecha;

  // ----------- << attribute.annotations@AAAAAAGXWF7+ioxFX/Q= >>
  // ----------- >>
  private Time hora;

  // ----------- << attribute.annotations@AAAAAAGXdW0WS1UmgA0= >>
  // ----------- >>
  private Reporte reporte;

  // ----------- << attribute.annotations@AAAAAAGXdXWlPvrMnbQ= >>
  // ----------- >>
  private EstadoReporte estado;

  // ----------- << attribute.annotations@AAAAAAGXdXXPqv+uxxM= >>
  // ----------- >>
  private TipoReporte datos;

  // ----------- << attribute.annotations@AAAAAAGXdXYAPwXLP6s= >>
  // ----------- >>
  private Ubicacion ubicacion;

  public Date getFecha() {
    return fecha;
  }

  public Time getHora() {
    return hora;
  }

  public Reporte getReporte() {
    return reporte;
  }

  public EstadoReporte getEstado() {
    return estado;
  }

  public TipoReporte getDatos() {
    return datos;
  }

  public Ubicacion getUbicacion() {
    return ubicacion;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public void setHora(Time hora) {
    this.hora = hora;
  }

  public void setReporte(Reporte reporte) {
    this.reporte = reporte;
  }

  public void setEstado(EstadoReporte estado) {
    this.estado = estado;
  }

  public void setDatos(TipoReporte datos) {
    this.datos = datos;
  }

  public void setUbicacion(Ubicacion ubicacion) {
    this.ubicacion = ubicacion;
  }

  public void linkReporte(Reporte _reporte) {
    if (_reporte != null) {
      _reporte.unlinkDatosReporte();
      _reporte.setDatosReporte(this);
    }

    unlinkReporte();
    setReporte(_reporte);
  }

  public void linkEstado(EstadoReporte _estado) {
    if (_estado != null) {
      _estado.unlinkDatos();
      _estado.setDatos(this);
    }

    unlinkEstado();
    setEstado(_estado);
  }

  public void linkDatos(TipoReporte _datos) {
    if (_datos != null) {
      _datos.unlinkTipo();
      _datos.setTipo(this);
    }

    unlinkDatos();
    setDatos(_datos);
  }

  public void linkUbicacion(Ubicacion _ubicacion) {
    if (_ubicacion != null) {
      _ubicacion.unlinkDatos();
      _ubicacion.setDatos(this);
    }

    unlinkUbicacion();
    setUbicacion(_ubicacion);
  }

  public void unlinkReporte() {
    if (getReporte() != null) {
      getReporte().setDatosReporte(null);
      setReporte(null);
    }
  }

  public void unlinkEstado() {
    if (getEstado() != null) {
      getEstado().setDatos(null);
      setEstado(null);
    }
  }

  public void unlinkDatos() {
    if (getDatos() != null) {
      getDatos().setTipo(null);
      setDatos(null);
    }
  }

  public void unlinkUbicacion() {
    if (getUbicacion() != null) {
      getUbicacion().setDatos(null);
      setUbicacion(null);
    }
  }

// ----------- << class.extras@AAAAAAGXWFpI74tz40Y= >>
// ----------- >>
}