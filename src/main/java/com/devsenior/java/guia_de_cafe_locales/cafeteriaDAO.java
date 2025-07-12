package com.devsenior.java.guia_de_cafe_locales;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class cafeteriaDAO {
    /**
     * este metodo se conecta a la db y obtiene todas las cafeterias 
     * @return una lista de objetos cafeteria 
     */

     public List<cafeteria> obtenerTodas(){
        List<cafeteria> cafeterias = new ArrayList<>();
        String sql = " SELECT * FROM cafeterias";
        try(Connection conn = DataBaseConnection.getConnection();
        
    ) {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
     }
    }
