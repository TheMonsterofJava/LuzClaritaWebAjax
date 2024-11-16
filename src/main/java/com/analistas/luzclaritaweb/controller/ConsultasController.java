/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.luzclaritaweb.controller;

import com.analistas.luzclaritaweb.model.Consulta;
import com.analistas.luzclaritaweb.repository.IConsultasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConsultasController {

    //Referencia a el Repositorio Model/Consulta
    //ConsultasRepository consultasRepo = new IConsultasRepository();
    
    @Autowired
    private IConsultasRepository ConsultasRepo;

    //Pagina Principal
    @GetMapping("/consulta")
    public String consulta(Model model) {

        model.addAttribute("consulta", new Consulta());
        return "consulta";

    }

    @PostMapping("/consulta")
    public String guardarConsultas(@ModelAttribute("consulta") Consulta consulta) {

       // Establecer valores por defecto para los campos no incluidos en el formulario
        consulta.setReseña("");  // O null, la receña se guarda de forma que no contine nada
        consulta.setActivo(0);   // O null, esta desactivada. 

        ConsultasRepo.guardar(consulta);
        return "redirect:/consulta";

    }

}
