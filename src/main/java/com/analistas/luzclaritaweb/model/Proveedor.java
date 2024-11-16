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
public class Proveedor {
    private Long id;
    private String nombre; 
    private String contacto;
    private int telefono;
    private String direccion;
    private String email;
    private int id_proveedores;
}
