/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.luzclaritaweb.model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author osval
 */
@Data
public class Compra {
    private int id;
    private Date fecha_compra;
    private String descripcion;
    private int cantidad;
    private int precio_unitario;
    private double total_compra;
    private int id_caja;
}
