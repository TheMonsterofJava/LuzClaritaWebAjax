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
public class Factura {
    private int id;
    private String numero_factura;
    private Date fecha_pedido;
    private double precio_total;
    private String estado_pedido;
    private String metodo_pago;
    private int id_cliente;
    private int id_caja;
}
