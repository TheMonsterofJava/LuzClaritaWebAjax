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
public class Producto {
    private Long id;
    private String descripcion;
    private String tamaño;
    private boolean precio;
    private String imagen;
    private String disponibilidad;
    private int id_producto;
}
