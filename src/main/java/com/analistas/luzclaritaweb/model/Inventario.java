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
public class Inventario {

    private int id;
    private String nombre_ingrediente;
    private double precio;
    private int cantidad;
    private String unidad_medida;
    private Date fecha_ingreso;
    private Date fecha_vencimiento;
    private int id_inventario;
}
