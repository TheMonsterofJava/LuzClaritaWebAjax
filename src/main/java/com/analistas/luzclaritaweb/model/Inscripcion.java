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
public class Inscripcion {
    private int id;
    private Date fecha_inscripcion;
    private int id_cliente;
    private int id_curso;
}
