package com.devsenior.java.guia_de_cafe_locales.dao;

import java.util.List;

import com.devsenior.java.guia_de_cafe_locales.model.Cafeteria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CafeteriaDAO_JPA {
    private EntityManagerFactory emf;

    public CafeteriaDAO_JPA() {
        this.emf = Persistence.createEntityManagerFactory("guia-cafes-pu");

    }

    /*
     * guardar una nueva cafeteria usando JPA
     * 
     */
    public void guardar(Cafeteria cafeteria) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cafeteria);
            em.getTransaction().commit();
        } finally {
            // TODO: handle exception
            em.close();
        }
    }

    /*
     * obtiene todas las cafeterias usando el JPA
     *
     */
    public List<Cafeteria> obtenerTodas() {
        EntityManager em = emf.createEntityManager();
        try {
            // usa JPQL (JAVA PERSISTENCE QUERY LANGUAGE) para consultar la entidad NO la
            // tabla
            String jpql = "SELECT c From Cafeteria c";
            return em.createQuery(jpql, Cafeteria.class).getResultList();
        } finally {
            em.close();
        }
    }
}
