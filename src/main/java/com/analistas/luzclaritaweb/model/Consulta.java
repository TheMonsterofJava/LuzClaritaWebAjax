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
public class Consulta {

    private int id;
    private String nom_ape;
    private String correo;
    private String celular;
    private String mensaje;
    private String reseña;
    private int activo;
}
