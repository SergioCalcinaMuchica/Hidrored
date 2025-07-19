package com.hidrored.aplicacion.Reportes;

import com.hidrored.dominio.Reportes.Modelo.HistorialCambio;
import lombok.Getter;
import java.time.format.DateTimeFormatter;

@Getter
public class HistorialCambioDTO {
  private final String fechaCambio;
  private final String descripcion;
  private final String usuarioIdCambio;

  private HistorialCambioDTO(HistorialCambio historial) {
    this.fechaCambio = historial.getFechaCambio().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    this.descripcion = historial.getDescripcion();
    this.usuarioIdCambio = historial.getUsuarioIdCambio();
  }

  public static HistorialCambioDTO fromDomain(HistorialCambio historial) {
    return new HistorialCambioDTO(historial);
  }
}
