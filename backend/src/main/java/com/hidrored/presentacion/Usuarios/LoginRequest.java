package com.hidrored.presentacion.Usuarios;

import lombok.Data;

@Data
public class LoginRequest {
  private String email;
  private String password;
}
