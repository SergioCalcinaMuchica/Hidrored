package com.hidrored.dominio.Usuarios.Modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "usuarios")
@Getter
public class Usuario {

  @Id
  private String id;

  private String nombre;

  @Indexed(unique = true)
  private String email;

  private String telefono;

  private String password;

  // Constructor privado, uso del 
  private Usuario(String id, String nombre, String email, String telefono, String password) {
    this.id = id;
    this.nombre = nombre;
    this.email = email;
    this.telefono = telefono;
    this.password = password;
  }

  private Usuario() {
    // Requerido por Spring Data
  }

  public static Usuario crearConDatos(String nombre, String email, String telefono, String password) {
    String idGenerado = UUID.randomUUID().toString();
    return new Usuario(idGenerado, nombre, email, telefono, password);
  }

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
