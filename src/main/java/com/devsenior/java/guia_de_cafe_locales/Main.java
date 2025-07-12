package com.devsenior.java.guia_de_cafe_locales;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos una instancia de nuestro DAO para usar sus métodos.
        CafeteriaDAO cafeteriaDAO = new CafeteriaDAO();

        // --- PRIMERO, LEEMOS Y MOSTRAMOS LOS DATOS ACTUALES ---
        System.out.println("--- Reporte de Cafeterías (Antes de Insertar) ---");
        List<Cafeteria> cafeteriasActuales = cafeteriaDAO.obtenerTodas();
        for (Cafeteria cafeteria : cafeteriasActuales) {
            System.out.println(cafeteria);
        }
        System.out.println("-------------------------------------------------");
        System.out.println(); // Un poco de espacio

        // --- SEGUNDO, GUARDAMOS UNA NUEVA CAFETERÍA ---
        System.out.println("Guardando una nueva cafetería...");
        Cafeteria nuevaCafeteria = new Cafeteria(3, "Café de la Finca", "Vereda El Carmen", 5);
        cafeteriaDAO.guardar(nuevaCafeteria);
        System.out.println("¡Nueva cafetería guardada con éxito!");
        System.out.println();

        // --- TERCERO, VOLVEMOS A LEER PARA VERIFICAR ---
        System.out.println("--- Reporte de Cafeterías (Después de Insertar) ---");
        List<Cafeteria> cafeteriasActualizadas = cafeteriaDAO.obtenerTodas();
        for (Cafeteria cafeteria : cafeteriasActualizadas) {
            System.out.println(cafeteria);
        }
        System.out.println("--------------------------------------------------");
    }
}