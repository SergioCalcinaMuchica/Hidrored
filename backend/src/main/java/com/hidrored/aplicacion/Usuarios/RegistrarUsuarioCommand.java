package com.hidrored.aplicacion.Usuarios;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RegistrarUsuarioCommand {

  private final String nombre;
  private final String email;
  private final String telefono;
  private final String password;

}
