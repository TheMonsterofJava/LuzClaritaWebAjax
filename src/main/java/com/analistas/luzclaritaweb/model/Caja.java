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
public class Caja {
    private int id;
    private Date fecha;
    private double monto_total;
    private int id_caja;
    private int id_compras;
}

