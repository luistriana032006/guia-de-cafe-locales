package com.devsenior.java.guia_de_cafe_locales;

import java.util.List;
import java.util.Scanner;

import com.devsenior.java.guia_de_cafe_locales.dao.CafeteriaDAO;
import com.devsenior.java.guia_de_cafe_locales.model.Cafeteria;

public class MainJDBC {
    public static void main(String[] args) {
        CafeteriaDAO cafeteriaDAO = new CafeteriaDAO();
        Scanner scanner = new Scanner(System.in);

        // --- PRIMERO, LEEMOS Y MOSTRAMOS LOS DATOS ACTUALES ---
        System.out.println("--- Reporte de Cafeterías (Antes de Insertar) ---");
        List<Cafeteria> cafeteriasActuales = cafeteriaDAO.obtenerTodas();
        for (Cafeteria cafeteria : cafeteriasActuales) {
            System.out.println(cafeteria);
        }
        System.out.println("-------------------------------------------------");
        System.out.println();

        // --- SEGUNDO, PEDIMOS DATOS AL USUARIO ---
        System.out.println("Ingrese los datos de la nueva cafetería:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Calificación (1-5): ");
        int calificacion = scanner.nextInt();

        Cafeteria nuevaCafeteria = new Cafeteria(id, nombre, direccion, calificacion);
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

        scanner.close();
    }
}