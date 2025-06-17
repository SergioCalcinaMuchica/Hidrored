
package Dominio.Reportes.modelo;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGXWFU2/IrdDtc= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGXWFU2/IrdDtc= >>
// ----------- >>
public class Ubicacion {
  // ----------- << attribute.annotations@AAAAAAGXWFWYQIsHq8s= >>
  // ----------- >>
  private Double latitud;

  // ----------- << attribute.annotations@AAAAAAGXWFXJcIsOtsE= >>
  // ----------- >>
  private Double longitud;

  // ----------- << attribute.annotations@AAAAAAGXWGH5c4xuOF0= >>
  // ----------- >>
  private String referencia;

  // ----------- << attribute.annotations@AAAAAAGXdXYAPwXKnwc= >>
  // ----------- >>
  private DatosReporte datos;

  // ----------- << attribute.annotations@AAAAAAGXWgufMBDPPpY= >>
  // ----------- >>
  private DatosReporte ubicacion;

  public Double getLatitud() {
    return latitud;
  }

  public Double getLongitud() {
    return longitud;
  }

  public String getReferencia() {
    return referencia;
  }

  public DatosReporte getDatos() {
    return datos;
  }

  public DatosReporte getUbicacion() {
    return ubicacion;
  }

  public void setLatitud(Double latitud) {
    this.latitud = latitud;
  }

  public void setLongitud(Double longitud) {
    this.longitud = longitud;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  public void setDatos(DatosReporte datos) {
    this.datos = datos;
  }

  public void setUbicacion(DatosReporte ubicacion) {
    this.ubicacion = ubicacion;
  }

  public void linkDatos(DatosReporte _datos) {
    if (_datos != null) {
      _datos.unlinkUbicacion();
      _datos.setUbicacion(this);
    }

    unlinkDatos();
    setDatos(_datos);
  }

  public void linkUbicacion(DatosReporte _ubicacion) {
    setUbicacion(_ubicacion);
  }

  public void unlinkDatos() {
    if (getDatos() != null) {
      getDatos().setUbicacion(null);
      setDatos(null);
    }
  }

  public void unlinkUbicacion() {
    setUbicacion(null);
  }

  /**
  * @param lat 
  * @param lon 
  * @param radioKm
  */

  // ----------- << method.annotations@AAAAAAGXWFX0gYsUBQk= >>
  // ----------- >>
  public boolean estaDentroDeRadio(Double lat, Double lon, Double radioKm) {
  // ----------- << method.body@AAAAAAGXWFX0gYsUBQk= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAGXWFU2/IrdDtc= >>
// ----------- >>
}