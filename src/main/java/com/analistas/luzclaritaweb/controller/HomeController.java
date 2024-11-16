/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.luzclaritaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
    
/**
 *
 * @author osval
 */



@RequestMapping(path = {"/", "/home"}, method = RequestMethod.GET)
@Controller
public class HomeController {
    
    @GetMapping("/home")  
    public String home(Model model) {
        //Cambiamos el nombre del url contactos a consultas
        model.addAttribute("urlconsultas", "/consulta"); 
        return "home"; 
    }
    
}
