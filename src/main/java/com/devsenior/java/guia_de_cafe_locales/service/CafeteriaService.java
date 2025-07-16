package com.devsenior.java.guia_de_cafe_locales.service;

import com.devsenior.java.guia_de_cafe_locales.dao.CafeteriaDAO_JDBC;
import com.devsenior.java.guia_de_cafe_locales.model.Cafeteria;

public class CafeteriaService {

    private CafeteriaDAO_JDBC cafeteriaDAO = new CafeteriaDAO_JDBC();

    public void crearNuevaCafeteria(String nombre, String direccion, int calificacion) {
        // 1. LÓGICA DE VALIDACIÓN (AQUÍ)
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return; // Detiene la operación
        }
        if (calificacion < 1 || calificacion > 5) {
            System.out.println("Error: La calificación debe estar entre 1 y 5.");
            return; // Detiene la operación
        }

        // 2. Si todo es válido, llama al DAO para guardar
        // Nota: El ID debería ser generado por la BD, aquí lo ponemos como ejemplo.
        Cafeteria nueva = new Cafeteria(4, nombre, direccion, calificacion); 
        cafeteriaDAO.guardar(nueva);
        System.out.println("Cafetería guardada con éxito por el servicio.");
    }
}

