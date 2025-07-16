package com.devsenior.java.guia_de_cafe_locales.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@ Table(name = "cafeterias") // dice que esta es la estructura en java para la tabla cafeterias haciendo referencia a ella 
public class Cafeteria {
    @Id // dice que este es la primaryKEy de la tabla 
    @Column(name = "id_cafeteria") // hace referencia a la columna id_cafeteria de la tabla cafeterias
    private int id_cafeteria;

    @Column(name = " nombre")
    private String nombre;

    @Column (name = "direccion")
    private String direccion;


    @Column (name="calificacion")
    private int calificacion;

    public Cafeteria(){

    }

    public Cafeteria(int id_cafeteria, String nombre, String direccion, int calificacion) {
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
