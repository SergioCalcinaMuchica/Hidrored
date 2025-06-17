
package Dominio.Reportes.modelo;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGXWFfFxYs2jXc= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGXWFfFxYs2jXc= >>
// ----------- >>
public class Imagen {
  // ----------- << attribute.annotations@AAAAAAGXWFgUA4tgSig= >>
  // ----------- >>
  private String url;

  // ----------- << attribute.annotations@AAAAAAGXWFh8JItnGyI= >>
  // ----------- >>
  private String descripcion;

  // ----------- << attribute.annotations@AAAAAAGXWMjqxm4NDoA= >>
  // ----------- >>
  private Reporte reporte;

  public String getUrl() {
    return url;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public Reporte getReporte() {
    return reporte;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setReporte(Reporte reporte) {
    this.reporte = reporte;
  }

  public void linkReporte(Reporte _reporte) {
    if (_reporte != null) {
      _reporte.getImagenes().add(this);
    }

    unlinkReporte();
    setReporte(_reporte);
  }

  public void unlinkReporte() {
    if (getReporte() != null) {
      getReporte().getImagenes().remove(this);
      setReporte(null);
    }
  }

// ----------- << class.extras@AAAAAAGXWFfFxYs2jXc= >>
// ----------- >>
}