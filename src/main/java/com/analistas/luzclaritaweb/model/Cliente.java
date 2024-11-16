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
public class Cliente {
    private int id;
    private String nombre_ape;
    private int celular;
    private String correo;
    private String direccion;
    private int contraseña;
    private int id_usuario;
}
