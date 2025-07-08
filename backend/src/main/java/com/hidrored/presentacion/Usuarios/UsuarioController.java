package com.hidrored.presentacion.Usuarios;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:5173")
public class UsuarioController {

  @PostMapping("/registro")
  public ResponseEntity<UsuarioResponse> registrarUsuario(@RequestBody RegistrarUsuarioRequest request) {

    System.out.println(">>> Solicitud de registro recibida:");
    System.out.println("Nombre: " + request.getNombre());
    System.out.println("Email: " + request.getEmail());
    System.out.println("Teléfono: " + request.getTelefono());
    System.out.println("Password: " + request.getPassword());

    UsuarioResponse response = new UsuarioResponse();
    response.setId(UUID.randomUUID().toString());
    response.setNombre(request.getNombre());
    response.setEmail(request.getEmail());
    response.setTelefono(request.getTelefono());

    return ResponseEntity.ok(response);
  }
}
