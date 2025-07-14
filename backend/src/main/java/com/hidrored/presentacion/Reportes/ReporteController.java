package com.hidrored.presentacion.Reportes;

import com.hidrored.aplicacion.Reportes.CrearReporteCommand;
import com.hidrored.aplicacion.Reportes.ReporteApplicationService;
import com.hidrored.aplicacion.Reportes.ReporteDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

  private final ReporteApplicationService reporteService;

  public ReporteController(ReporteApplicationService reporteService) {
    this.reporteService = reporteService;
  }

  @PostMapping
  public ResponseEntity<ReporteDTO> crearReporte(
      @RequestHeader("usuarioId") String usuarioId,
      @RequestParam("titulo") String titulo,
      @RequestParam("descripcion") String descripcion,
      @RequestParam("tipo") String tipo,
      @RequestParam("prioridad") String prioridad,
      @RequestParam("latitud") Double latitud,
      @RequestParam("longitud") Double longitud,
      @RequestParam("direccion") String direccion,
      // La imagen es opcional, por eso 'required = false'
      @RequestPart(value = "imagenFile", required = false) MultipartFile imagenFile) {

    CrearReporteCommand command = new CrearReporteCommand(
        usuarioId,
        titulo,
        descripcion,
        latitud,
        longitud,
        direccion,
        tipo,
        prioridad);

    ReporteDTO nuevoReporte = reporteService.crearReporte(command);

    return ResponseEntity.ok(nuevoReporte);
  }
}
