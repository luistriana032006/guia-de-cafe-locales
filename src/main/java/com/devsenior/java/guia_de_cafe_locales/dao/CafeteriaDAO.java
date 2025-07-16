package com.devsenior.java.guia_de_cafe_locales.dao; // Define el paquete al que pertenece la clase

import java.sql.Connection;         // Importa la clase para manejar conexiones a la base de datos
import java.sql.PreparedStatement;  // Permite ejecutar sentencias SQL parametrizadas
import java.sql.ResultSet;          // Permite manejar los resultados de una consulta SQL
import java.sql.SQLException;       // Maneja excepciones relacionadas con SQL
import java.sql.Statement;          // Permite ejecutar sentencias SQL simples
import java.util.ArrayList;         // Implementación de la interfaz List
import java.util.List;              // Interfaz para listas

import com.devsenior.java.guia_de_cafe_locales.model.Cafeteria;
import com.devsenior.java.guia_de_cafe_locales.util.DataBaseConnection;

public class CafeteriaDAO { // Clase DAO (Data Access Object) para manejar operaciones con la tabla cafeterias

    /**
     * Este método se conecta a la base de datos y obtiene todas las cafeterías.
     * @return una lista de objetos Cafeteria
     */
    public List<Cafeteria> obtenerTodas() {
        List<Cafeteria> cafeterias = new ArrayList<>(); // Lista donde se guardarán las cafeterías obtenidas
        String sql = "SELECT * FROM cafeterias";        // Consulta SQL para obtener todas las filas
        try (Connection conn = DataBaseConnection.getConnection(); // Abre conexión a la base de datos
             Statement stmt = conn.createStatement();              // Crea un Statement para ejecutar la consulta
             ResultSet rs = stmt.executeQuery(sql);) {             // Ejecuta la consulta y obtiene los resultados

            while (rs.next()) { // Itera sobre cada fila del resultado
                int id = rs.getInt("id_cafeteria");           // Obtiene el id de la cafetería
                String nombre = rs.getString("nombre");       // Obtiene el nombre
                String direcccion = rs.getString("direccion"); // Obtiene la dirección 
                int calificacion = rs.getInt("calificacion"); // Obtiene la calificación

                Cafeteria cafeteria = new Cafeteria(id, nombre, direcccion, calificacion); // Crea objeto Cafeteria
                cafeterias.add(cafeteria); // Lo agrega a la lista
            }

        } catch (SQLException e) { // Si ocurre un error de SQL
            e.printStackTrace();   // Imprime el error
        }
        return cafeterias; // Devuelve la lista de cafeterías
    }

    /**
     * Este método guarda una nueva cafetería en la base de datos.
     * @param cafeteria el objeto Cafeteria a guardar
     */
    public void guardar(Cafeteria cafeteria) {
        String sql = "INSERT INTO cafeterias(id_cafeteria, nombre, direccion, calificacion) VALUES (?, ?, ?, ?)"; // Consulta SQL para insertar
        try (Connection conn = DataBaseConnection.getConnection(); // Abre conexión
             PreparedStatement pstmt = conn.prepareStatement(sql)) { // Prepara la sentencia SQL

            pstmt.setInt(1, cafeteria.getId_cafeteria());     // Asigna el id
            pstmt.setString(2, cafeteria.getNombre());        // Asigna el nombre
            pstmt.setString(3, cafeteria.getDireccion());     // Asigna la dirección
            pstmt.setInt(4, cafeteria.getCalificacion());     // Asigna la calificación

            pstmt.executeUpdate(); // ejecuta la creacion de la nueva entidad de la tabla cafeteria 

        } catch (SQLException e) { // Si ocurre un error
            e.printStackTrace();   // Imprime el error
        }
    }
}
