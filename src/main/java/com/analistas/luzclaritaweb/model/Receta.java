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
public class Receta {
    private Long id;
    private String nombre_receta;
    private String descripcion;
    private String ingredientes;
    private String pasos;
    private String tiempo;
    private String imagen_link;
    private int id_curso;
}
