package com.talentotech.energia.controller;
import com.talentotech.energia.model.User;
import com.talentotech.energia.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import java.util.List;
import com.talentotech.energia.dto.LoginRequest;

@RestController
@RequestMapping("/api/users")


public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.crearUsuario(user));
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    
    }
    // Endpoint para obtener un usuario por su ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
    }

    // Endpoint para actualizar un usuario por su ID
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        String response = userService.login(request);
        return ResponseEntity.ok(response);
    }
}
