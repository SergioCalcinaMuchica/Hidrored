package Dominio.Reportes.Modelo;

import Dominio.Usuarios.Modelo.ID; // Importa ID de usuario
import java.time.LocalDateTime;
import java.util.Objects;

public class HistorialCambio {

    private LocalDateTime fechaCambio;
    private String descripcion;
    private ID usuarioIdCambio; // ID del usuario que realizó el cambio

    public HistorialCambio(LocalDateTime fechaCambio, String descripcion, ID usuarioIdCambio) {
        if (fechaCambio == null || descripcion == null || descripcion.trim().isEmpty() || usuarioIdCambio == null) {
            throw new IllegalArgumentException("Todos los campos de HistorialCambio son obligatorios.");
        }
        this.fechaCambio = fechaCambio;
        this.descripcion = descripcion;
        this.usuarioIdCambio = usuarioIdCambio;
    }

    public LocalDateTime getFechaCambio() {
        return fechaCambio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ID getUsuarioIdCambio() {
        return usuarioIdCambio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistorialCambio that = (HistorialCambio) o;
        return Objects.equals(fechaCambio, that.fechaCambio) &&
               Objects.equals(descripcion, that.descripcion) &&
               Objects.equals(usuarioIdCambio, that.usuarioIdCambio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaCambio, descripcion, usuarioIdCambio);
    }

    @Override
    public String toString() {
        return "HistorialCambio{" +
               "fechaCambio=" + fechaCambio +
               ", descripcion='" + descripcion + '\'' +
               ", usuarioIdCambio=" + usuarioIdCambio +
               '}';
    }
}