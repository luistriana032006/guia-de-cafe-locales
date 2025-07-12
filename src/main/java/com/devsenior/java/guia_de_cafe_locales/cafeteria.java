package com.devsenior.java;

public class cafeteria {

    private int id_cafeteria;
    private String nombre;
    private String direccion;
    private int calificacion;

    public cafeteria(int id_cafeteria, String nombre, String direccion, int calificacion) {
        this.id_cafeteria = id_cafeteria;
        this.nombre = nombre;
        this.direccion = direccion;
        this.calificacion = calificacion;
    }

    public int getId_cafeteria() {
        return id_cafeteria;
    }

    public void setId_cafeteria(int id_cafeteria) {
        this.id_cafeteria = id_cafeteria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "cafeteria{" +
                "id_cafeteria=" + id_cafeteria +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}
