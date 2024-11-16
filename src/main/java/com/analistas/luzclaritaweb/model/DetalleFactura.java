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
public class DetalleFactura {
    private int id;
    private int cantidad;
    private double precio_unitario;
    private int id_factura;
}
