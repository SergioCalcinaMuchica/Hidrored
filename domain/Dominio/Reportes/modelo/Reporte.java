
package Dominio.Reportes.modelo;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGXWE7wDIpqWBo= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGXWE7wDIpqWBo= >>
// ----------- >>
public class Reporte {
  // ----------- << attribute.annotations@AAAAAAGXWFBKJIqW4ps= >>
  // ----------- >>
  private UUID id;

  // ----------- << attribute.annotations@AAAAAAGXWFC+/IqdSXI= >>
  // ----------- >>
  private String descripcion;

  // ----------- << attribute.annotations@AAAAAAGXWFGacIqlRi8= >>
  // ----------- >>
  private List<Imagen> imagenes;

  // ----------- << attribute.annotations@AAAAAAGXdW0WS1Ulgco= >>
  // ----------- >>
  private DatosReporte datosReporte;

  // ----------- << attribute.annotations@AAAAAAGXWMjqxm4MH9g= >>
  // ----------- >>
  private Set<Imagen> imagenes = new HashSet<>();

  // ----------- << attribute.annotations@AAAAAAGXddDj5yrlg2c= >>
  // ----------- >>
  private Set<HistorialEstado> historial = new HashSet<>();

  private UUID getId() {
    return id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public List<Imagen> getImagenes() {
    return imagenes;
  }

  public DatosReporte getDatosReporte() {
    return datosReporte;
  }

  public Set<Imagen> getImagenes() {
    return imagenes;
  }

  public Set<HistorialEstado> getHistorial() {
    return historial;
  }

  private void setId(UUID id) {
    this.id = id;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setImagenes(List<Imagen> imagenes) {
    this.imagenes = imagenes;
  }

  public void setDatosReporte(DatosReporte datosReporte) {
    this.datosReporte = datosReporte;
  }

  public void linkDatosReporte(DatosReporte _datosReporte) {
    if (_datosReporte != null) {
      _datosReporte.unlinkReporte();
      _datosReporte.setReporte(this);
    }

    unlinkDatosReporte();
    setDatosReporte(_datosReporte);
  }

  public void linkImagenes(Imagen _imagenes) {
    if (_imagenes != null) {
      _imagenes.unlinkReporte();
      _imagenes.setReporte(this);
      getImagenes().add(_imagenes);
    }
  }

  public void linkHistorial(HistorialEstado _historial) {
    if (_historial != null) {
      _historial.unlinkReporte();
      _historial.setReporte(this);
      getHistorial().add(_historial);
    }
  }

  public void unlinkDatosReporte() {
    if (getDatosReporte() != null) {
      getDatosReporte().setReporte(null);
      setDatosReporte(null);
    }
  }

  public void unlinkImagenes(Imagen _imagenes) {
    if (_imagenes != null) {
      _imagenes.setReporte(null);
      getImagenes().remove(_imagenes);
    }
  }

  public void unlinkImagenes(Imagen _imagenes, Iterator<Imagen> it) {
    if (_imagenes != null) {
      _imagenes.setReporte(null);
      it.remove();
    }
  }

  public void unlinkHistorial(HistorialEstado _historial) {
    if (_historial != null) {
      _historial.setReporte(null);
      getHistorial().remove(_historial);
    }
  }

  public void unlinkHistorial(HistorialEstado _historial, Iterator<HistorialEstado> it) {
    if (_historial != null) {
      _historial.setReporte(null);
      it.remove();
    }
  }

  /**
  * @param nuevoEstado
  */

  // ----------- << method.annotations@AAAAAAGXWFPHQ4rBfnA= >>
  // ----------- >>
  public void cambiarEstado(EstadoReporte nuevoEstado) {
  // ----------- << method.body@AAAAAAGXWFPHQ4rBfnA= >>
  // ----------- >>
  }
  /**
  * @param imagen
  */

  // ----------- << method.annotations@AAAAAAGXWFP0N4rHLKQ= >>
  // ----------- >>
  public void adjuntarImagen(Imagen imagen) {
  // ----------- << method.body@AAAAAAGXWFP0N4rHLKQ= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXWE7wDIpqWBo= >>
// ----------- >>
}