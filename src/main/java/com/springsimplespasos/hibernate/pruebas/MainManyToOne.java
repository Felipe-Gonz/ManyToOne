package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.manytoone.Persona;
import com.springsimplespasos.hibernate.entidades.manytoone.Telefono;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;


public class MainManyToOne {
    
    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        
        Persona juan = new Persona("Juan");
        Persona mariano = new Persona("Mariano");
        
        Telefono celularJuan = new Telefono("1111111111");
        Telefono lineaJuan = new Telefono("2222222222");
        
        celularJuan.setPersona(juan);
        lineaJuan.setPersona(juan);
        
        List<Telefono> telefonos = Arrays.asList(celularJuan, lineaJuan);
                
        juan.setTelefonos(telefonos);
        
        session.beginTransaction();
        
        session.save(juan);
        session.save(mariano);        
        
        //session.save(celularJuan);
        //session.save(lineaJuan);
        
        session.getTransaction().commit();
        
        session.close();
    }
}
