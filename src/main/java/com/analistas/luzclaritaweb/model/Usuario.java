package com.analistas.luzclaritaweb.model;

import java.util.Date;
import lombok.Data;
/**
 *
 * @author osval
 */
@Data
public class Usuario {
    private Long id;
    private String nombre;
    private String contraseña;
    private Date fecha_creacion;
    private boolean estado;
    private int id_permiso;
}
