/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.luzclaritaweb.controller;

import com.analistas.luzclaritaweb.database.ConexionJDBC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//Cargamos el formulario de inicio de sesion:
@Controller
@RestController
public class SesionController {

    @RequestMapping (path = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
        model.addAttribute("error", error != null);
        return "sesion";
    }

    @GetMapping("/sesion")
    public String sesion() {
        return "sesion";
    }

    private final ConexionJDBC ConexionJDBC;

    @Autowired
    public SesionController(ConexionJDBC conexionJDBC) {

        this.ConexionJDBC = conexionJDBC;

    }

    @PostMapping("/autenticar_sesion")
    @ResponseBody // Para devolver JSON
    public Map<String, Object> autenticarelUsuario(@RequestBody LoginRequest loginRequest) {
        Map<String, Object> response = new HashMap<>();

        try (Connection connection = ConexionJDBC.getConnection()) {
            String sql = "SELECT * FROM usuarios WHERE nombre = ? AND contraseña = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, loginRequest.getNombre());
            statement.setString(2, loginRequest.getContraseña());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                response.put("success", true);
                response.put("redirect", "/home");
            } else {
                response.put("success", false);
                response.put("error", "Usuario o contraseña inválidos");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.put("success", false);
            response.put("error", "Error al conectar con la base de datos");
        }

        return response;
    }
}

// Clase para recibir los datos del login
@Data //Implementa el lombok
@NoArgsConstructor //genera constructores sin argumentos 
@AllArgsConstructor //Genera los contonstructores con todos los argumentos 
class LoginRequest {

    private String nombre;
    private String contraseña;
}
