/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.luzclaritaweb.model;

import lombok.Data;

/**
 *
 * @author osval
 */

@Data
public class Curso {
    
    private int id;
    private String nombre_curso;
    private String descripcion;
    private double precio;
    private String link_video;
    private int id_cursos;
}
