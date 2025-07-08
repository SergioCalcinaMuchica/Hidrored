
package com.hidrored.dominio.Usuarios.Modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Objects;

@Document(collection = "usuarios")
public class Usuario {

    @Id
    private ID id;

    private String nombre;

    @Indexed(unique = true) // Asegura que no haya dos usuarios con el mismo email
    private String email;

    private String telefono;

    // En DDD, no se deben mantener referencias directas a otros agregados.
    // Las relaciones se manejan a través de IDs.
    // Por lo tanto, eliminamos los campos 'notificaciones' y 'reportes'.

    /**
     * Constructor para crear un nuevo usuario.
     * @param nombre El nombre del usuario.
     * @param email El correo electrónico del usuario.
     * @param telefono El teléfono del usuario.
     */
    public Usuario(String nombre, String email, String telefono) {
        if (nombre == null || nombre.trim().isEmpty() || email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre y el email son obligatorios.");
        }
        this.id = ID.generarNuevo();
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Constructor vacío para uso de Spring Data.
     */
    private Usuario() {}

    // --- Métodos de Comportamiento ---

    public void actualizarDatos(String nuevoNombre, String nuevoTelefono) {
        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            this.nombre = nuevoNombre;
        }
        if (nuevoTelefono != null) {
            this.telefono = nuevoTelefono;
        }
    }

    // --- Getters ---

    public ID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    // --- equals y hashCode ---

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
