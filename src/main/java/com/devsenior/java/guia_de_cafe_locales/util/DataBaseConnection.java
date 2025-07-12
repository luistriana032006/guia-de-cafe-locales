package com.devsenior.java.guia_de_cafe_locales.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
  // Reemplaza estos valores con los de tu base de datos
    private static final String URL = "jdbc:postgresql://localhost:5432/guia_cafes_db";
    private static final String USER = "postgres"; // Tu usuario de PostgreSQL
    private static final String PASSWORD = "admin123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
