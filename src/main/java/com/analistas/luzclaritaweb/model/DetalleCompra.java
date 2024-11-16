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
public class DetalleCompra {
    private int id;
    private int cantidad;
    private double precio_unitario;
    private double sub_total;
    private int id_detalle_compra;
    
}
