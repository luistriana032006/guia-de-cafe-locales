package com.devsenior.java.guia_de_cafe_locales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class cafeteriaDAO {
    /**
     * este metodo se conecta a la db y obtiene todas las cafeterias
     * 
     * @return una lista de objetos cafeteria
     */

    public List<Cafeteria> obtenerTodas() {
        List<Cafeteria> cafeterias = new ArrayList<>();
        String sql = " SELECT * FROM cafeterias";
        try (Connection conn = DataBaseConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
          while (rs.next()){
            // para cada fila crear un objeto cafeteria 
            int id = rs.getInt("id_cafeteria");
            String nombre = rs.getString("nombre");
            String direcccion = rs.getString("direcccion");
            int calificacion = rs.getInt("calificacion");

            Cafeteria cafeteria = new Cafeteria(id, nombre, direcccion, calificacion);
            cafeterias.add(cafeteria);
          }          

        } catch (SQLException e) {
         
            e.printStackTrace();
        }
        return cafeterias;
    }

        /**
         * este metodo guarda una nueva cafeteria en la db
         * 
          @param cafeteria el objeto cafeteria a guardar 
         */

         public void guardar(Cafeteria cafeteria){
            String sql = "INSERT INTO cafeteria(id_cafeteria, nombre, direccion, calificacion)";
            try (Connection conn = DataBaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, cafeteria.getId_cafeteria());
                pstmt.setString(2, cafeteria.getNombre());
                pstmt.setString(3, cafeteria.getDireccion());
                pstmt.setInt(4, cafeteria.getCalificacion());
                
            } catch (SQLException e) {
               e.printStackTrace();
            }
         
    }
}
