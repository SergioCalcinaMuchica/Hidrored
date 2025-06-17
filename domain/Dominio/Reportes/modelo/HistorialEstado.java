
package Dominio.Reportes.modelo;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGXWGOb8Yx1rFc= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGXWGOb8Yx1rFc= >>
// ----------- >>
public class HistorialEstado {
  // ----------- << attribute.annotations@AAAAAAGXWQuA70obonQ= >>
  // ----------- >>
  private UUID id;

  // ----------- << attribute.annotations@AAAAAAGXWQuY5kt4q6Q= >>
  // ----------- >>
  private UUID reporteId;

  // ----------- << attribute.annotations@AAAAAAGXWGOpR4yfUJ8= >>
  // ----------- >>
  private Estado estadoAnterior;

  // ----------- << attribute.annotations@AAAAAAGXWGO+zIym1fk= >>
  // ----------- >>
  private Estado estadoNuevo;

  // ----------- << attribute.annotations@AAAAAAGXWGPPyIysfck= >>
  // ----------- >>
  private DateTime fechaCambio;

  // ----------- << attribute.annotations@AAAAAAGXddDj5yrm8dE= >>
  // ----------- >>
  private Reporte reporte;

  public UUID getId() {
    return id;
  }

  public UUID getReporteId() {
    return reporteId;
  }

  public Estado getEstadoAnterior() {
    return estadoAnterior;
  }

  public Estado getEstadoNuevo() {
    return estadoNuevo;
  }

  public DateTime getFechaCambio() {
    return fechaCambio;
  }

  public Reporte getReporte() {
    return reporte;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setReporteId(UUID reporteId) {
    this.reporteId = reporteId;
  }

  public void setEstadoAnterior(Estado estadoAnterior) {
    this.estadoAnterior = estadoAnterior;
  }

  public void setEstadoNuevo(Estado estadoNuevo) {
    this.estadoNuevo = estadoNuevo;
  }

  public void setFechaCambio(DateTime fechaCambio) {
    this.fechaCambio = fechaCambio;
  }

  public void setReporte(Reporte reporte) {
    this.reporte = reporte;
  }

  public void linkReporte(Reporte _reporte) {
    if (_reporte != null) {
      _reporte.getHistorial().add(this);
    }

    unlinkReporte();
    setReporte(_reporte);
  }

  public void unlinkReporte() {
    if (getReporte() != null) {
      getReporte().getHistorial().remove(this);
      setReporte(null);
    }
  }

// ----------- << class.extras@AAAAAAGXWGOb8Yx1rFc= >>
// ----------- >>
}