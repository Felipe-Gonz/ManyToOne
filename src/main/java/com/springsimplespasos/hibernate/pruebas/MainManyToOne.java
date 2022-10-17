package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.manytoone.Persona;
import com.springsimplespasos.hibernate.entidades.manytoone.Telefono;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import java.util.Arrays;
import org.hibernate.Session;


public class MainManyToOne {
    
    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        
        Persona juan = new Persona(1, "Juan");
        Persona mariano = new Persona(2, "Mariano");
        
        Telefono celularJuan = new Telefono(1, "1111111111");
        Telefono lineaJuan = new Telefono(2, "2222222222");
        
        celularJuan.setPersona(juan);
        lineaJuan.setPersona(juan);
        
        juan.setTelefonos(Arrays.asList(celularJuan, lineaJuan));
        
        session.beginTransaction();
        
        session.save(juan);
        session.save(mariano);
        
        
        session.save(celularJuan);
        session.save(lineaJuan);
        
        session.getTransaction().commit();
        
        session.close();
    }
}
