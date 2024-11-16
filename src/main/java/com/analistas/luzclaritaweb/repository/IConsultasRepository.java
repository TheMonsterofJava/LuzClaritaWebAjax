/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.luzclaritaweb.repository;

import com.analistas.luzclaritaweb.database.ConexionJDBC;
import com.analistas.luzclaritaweb.model.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.springframework.stereotype.Repository;

@Repository  
public class IConsultasRepository implements ICrudReposisory {
    
    @Override
    public void guardar(Object objeto) {
        Connection cn = null;
        PreparedStatement ps = null;
        
        try {
            Consulta consulta = (Consulta) objeto;
            cn = new ConexionJDBC().getConnection();
            
            if (consulta.getId() > 0) {
                // Corregir la sintaxis SQL del UPDATE
                String sql = "UPDATE consultas_usu SET " +
                           "nom_ape = ?, " +
                           "correo = ?, " +
                           "celular = ?, " +
                           "mensaje = ? " +
                           "WHERE id = ?";
                           
                ps = cn.prepareStatement(sql);
                ps.setString(1, consulta.getNom_ape());
                ps.setString(2, consulta.getCorreo());
                ps.setString(3, consulta.getCelular());
                ps.setString(4, consulta.getMensaje());
                ps.setInt(5, consulta.getId());
            } else {
                // SQL para INSERT
                String sql = "INSERT INTO consultas_usu (nom_ape, correo, celular, mensaje) VALUES (?, ?, ?, ?)";
                ps = cn.prepareStatement(sql);
                ps.setString(1, consulta.getNom_ape());
                ps.setString(2, consulta.getCorreo());
                ps.setString(3, consulta.getCelular());
                ps.setString(4, consulta.getMensaje());
            }
            
            ps.executeUpdate();  // Usar executeUpdate() en lugar de execute()
            
        } catch (Exception e) {
            System.err.println("Error al guardar consulta: " + e.getMessage());
            e.printStackTrace();  // Agregar stack trace para mejor debugging
        } finally {
            try {
                // Cerrar recursos en orden inverso
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.err.println("Error al cerrar conexiones: " + e.getMessage());
            }
        }
    }
}
