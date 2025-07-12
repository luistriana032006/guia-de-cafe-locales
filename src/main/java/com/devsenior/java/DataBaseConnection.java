package com.devsenior.java;

public class DataBaseConnection {
  // Reemplaza estos valores con los de tu base de datos
    private static final String URL = "jdbc:postgresql://localhost:5432/guia_cafes_db";
    private static final String USER = "postgres"; // Tu usuario de PostgreSQL
    private static final String PASSWORD = "tu_contraseña"; // ¡CAMBIA ESTO!

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
