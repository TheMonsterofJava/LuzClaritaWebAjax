package com.analistas.luzclaritaweb.database;

import java.sql.Connection;
import java.sql.DriverManager;
import org.springframework.stereotype.Repository;

@Repository //Manejod de accseso a la base de datos 
public class ConexionJDBC {

    public Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/luzclarita_bd2", "root", "PepaSql");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return null;
        }
    }
}
