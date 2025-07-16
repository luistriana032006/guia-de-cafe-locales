package com.devsenior.java.guia_de_cafe_locales;

import java.util.List;

import com.devsenior.java.guia_de_cafe_locales.dao.CafeteriaDAO_JPA;
import com.devsenior.java.guia_de_cafe_locales.model.Cafeteria;

public class mainJPA {
 public static void main(String[] args) {
        // La única diferencia: ¡Ahora creamos una instancia del DAO de JPA!
        CafeteriaDAO_JPA cafeteriaDAO = new CafeteriaDAO_JPA();

        // --- PRIMERO, LEEMOS Y MOSTRAMOS LOS DATOS ACTUALES ---
        System.out.println("--- Reporte de Cafeterías con JPA (Antes de Insertar) ---");
        List<Cafeteria> cafeteriasActuales = cafeteriaDAO.obtenerTodas();
        for (Cafeteria cafeteria : cafeteriasActuales) {
            System.out.println(cafeteria);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // --- SEGUNDO, GUARDAMOS UNA NUEVA CAFETERÍA ---
        System.out.println("Guardando una nueva cafetería con JPA...");
        // Usamos un ID diferente para no chocar con los anteriores
        Cafeteria nuevaCafeteria = new Cafeteria(4, "El Taller del Café", "Carrera 8 # 45-10", 4);
        cafeteriaDAO.guardar(nuevaCafeteria);
        System.out.println("¡Nueva cafetería guardada con éxito!");
        System.out.println();

        // --- TERCERO, VOLVEMOS A LEER PARA VERIFICAR ---
        System.out.println("--- Reporte de Cafeterías con JPA (Después de Insertar) ---");
        List<Cafeteria> cafeteriasActualizadas = cafeteriaDAO.obtenerTodas();
        for (Cafeteria cafeteria : cafeteriasActualizadas) {
            System.out.println(cafeteria);
        }
        System.out.println("--------------------------------------------------------");
    }
}
