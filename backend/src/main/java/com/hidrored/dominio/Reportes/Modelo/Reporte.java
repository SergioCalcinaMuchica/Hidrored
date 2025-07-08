package com.hidrored.dominio.Reportes.Modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.hidrored.dominio.Usuarios.Modelo.ID;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Document(collection = "reportes")

public class Reporte {
    @Id
    private ID id;

    private ID usuarioId;
    private String titulo;
    private String descripcion;
    private Ubicacion ubicacion;
    private EstadoReporte estado;
    private TipoReporte tipo;
    private PrioridadReporte prioridad;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    // Colecciones de Value Objects y Entidades contenidas por el agregado
    private List<HistorialCambio> historialCambios;
    private List<ImagenAdjunta> imagenesAdjuntas;
    private List<Comentario> comentarios;

    // Constructor que inicializa el Reporte en un estado válido.
    // Es el único constructor público para controlar la creación.
    public Reporte(ID usuarioId, String titulo, String descripcion, Ubicacion ubicacion, TipoReporte tipo,
            PrioridadReporte prioridad) {
        if (usuarioId == null || titulo == null || titulo.trim().isEmpty() ||
                descripcion == null || descripcion.trim().isEmpty() || ubicacion == null ||
                tipo == null || prioridad == null) {
            throw new IllegalArgumentException("Todos los campos obligatorios de Reporte deben ser provistos.");
        }
        this.id = ID.generarNuevo(); // Generamos un nuevo ID único
        this.usuarioId = usuarioId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.estado = EstadoReporte.PENDIENTE; // Estado inicial por defecto
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
        // El historial se inicia con la creación del reporte
        this.historialCambios.add(new HistorialCambio(LocalDateTime.now(), "Reporte creado.", usuarioId));
    }

    private Reporte() {
    }

    // --- Métodos de comportamiento de Dominio ---

    public void actualizarEstado(EstadoReporte nuevoEstado, ID usuarioIdCambio, String motivo) {
        if (nuevoEstado == null) {
            throw new IllegalArgumentException("El nuevo estado no puede ser nulo.");
        }
        // Lógica de transición de estados si la hay (ej. no se puede pasar de RESUELTO
        // a PENDIENTE)
        if (this.estado.equals(EstadoReporte.CERRADO)) {
            throw new IllegalStateException("No se puede cambiar el estado de un reporte CERRADO.");
        }

        String descripcionCambio = String.format("Estado cambiado de %s a %s. Motivo: %s",
                this.estado.name(), nuevoEstado.name(), motivo);
        this.historialCambios.add(new HistorialCambio(LocalDateTime.now(), descripcionCambio, usuarioIdCambio));
        this.estado = nuevoEstado;
        this.fechaActualizacion = LocalDateTime.now();
    }

    public void actualizarDescripcion(String nuevaDescripcion, ID usuarioIdCambio) {
        if (nuevaDescripcion == null || nuevaDescripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La nueva descripción no puede ser nula o vacía.");
        }
        String descripcionCambio = String.format("Descripción actualizada. Anterior: '%s', Nueva: '%s'",
                this.descripcion, nuevaDescripcion);
        this.historialCambios.add(new HistorialCambio(LocalDateTime.now(), descripcionCambio, usuarioIdCambio));
        this.descripcion = nuevaDescripcion;
        this.fechaActualizacion = LocalDateTime.now();
    }

    public void agregarImagenAdjunta(ImagenAdjunta imagen) {
        if (imagen == null) {
            throw new IllegalArgumentException("La imagen adjunta no puede ser nula.");
        }
        this.imagenesAdjuntas.add(imagen);
        this.fechaActualizacion = LocalDateTime.now();
    }

    public void agregarComentario(ID usuarioId, String contenido) {
        Comentario nuevoComentario = Comentario.crearNuevo(usuarioId, contenido);
        this.comentarios.add(nuevoComentario);
        this.fechaActualizacion = LocalDateTime.now();
    }

    // --- Getters ---
    public ID getId() {
        return id;
    }

    public ID getUsuarioId() {
        return usuarioId;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public EstadoReporte getEstado() {
        return estado;
    }

    public TipoReporte getTipo() {
        return tipo;
    }

    public PrioridadReporte getPrioridad() {
        return prioridad;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    // Copias defensivas para evitar modificaciones externas directas a las
    // colecciones internas
    public List<HistorialCambio> getHistorialCambios() {
        return Collections.unmodifiableList(historialCambios);
    }

    public List<ImagenAdjunta> getImagenesAdjuntas() {
        return Collections.unmodifiableList(imagenesAdjuntas);
    }

    public List<Comentario> getComentarios() {
        return Collections.unmodifiableList(comentarios);
    }

    // --- Métodos equals y hashCode (basados en ID para entidades) ---
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reporte reporte = (Reporte) o;
        return Objects.equals(id, reporte.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}