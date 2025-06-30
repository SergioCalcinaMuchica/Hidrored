package Dominio.Reportes.Modelo;

import Dominio.Usuarios.Modelo.ID;
import java.time.LocalDateTime;
import java.util.Objects;

public class Comentario {

    private ID id; // Comentario tiene su propia identidad dentro del agregado
    private ID usuarioId; // Quién hizo el comentario
    private String contenido;
    private LocalDateTime fechaCreacion;

    public Comentario(ID id, ID usuarioId, String contenido, LocalDateTime fechaCreacion) {
        if (id == null || usuarioId == null || contenido == null || contenido.trim().isEmpty() || fechaCreacion == null) {
            throw new IllegalArgumentException("Todos los campos de Comentario son obligatorios y válidos.");
        }
        this.id = id;
        this.usuarioId = usuarioId;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
    }

    // Método para generar un nuevo ID para el comentario (útil al crear nuevos comentarios)
    public static Comentario crearNuevo(ID usuarioId, String contenido) {
        return new Comentario(ID.generarNuevo(), usuarioId, contenido, LocalDateTime.now());
    }

    public ID getId() {
        return id;
    }

    public ID getUsuarioId() {
        return usuarioId;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    // Comportamiento de dominio: un comentario puede ser actualizado
    public void actualizarContenido(String nuevoContenido) {
        if (nuevoContenido == null || nuevoContenido.trim().isEmpty()) {
            throw new IllegalArgumentException("El contenido del comentario no puede ser nulo o vacío.");
        }
        this.contenido = nuevoContenido;
        // Podrías añadir lógica para actualizar una fecha de modificación si fuera necesario
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentario that = (Comentario) o;
        return Objects.equals(id, that.id); // La igualdad de entidades se basa en su ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Comentario{" +
               "id=" + id +
               ", usuarioId=" + usuarioId +
               ", contenido='" + contenido + '\'' +
               "fechaCreacion=" + fechaCreacion +
               '}';
    }
}