package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.SimpleEntity;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class HibernateMain {

    public static void main(String[] args) { 
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();
        
        //INSERT
        /*SimpleEntity entity = new SimpleEntity();
        entity.setNombre("Prueba de creacion");
        session.save(entity);*/
        
        //Update
        /*SimpleEntity entityUpdate = new SimpleEntity();
        entityUpdate.setId_persona(1);
        entityUpdate.setNombre("Prueba de creacion - Prueba de update");
        session.update(entityUpdate);*/
        
        //DELETE
        /*SimpleEntity entityDelete = new SimpleEntity();
        entityDelete.setId_persona(2);
        session.delete(entityDelete); */
        
        //READ
        /*SimpleEntity entityRead = session.get(SimpleEntity.class, 1);
        System.out.println(entityRead.getNombre()); */
            
        
                
        session.getTransaction().commit();
        session.close();
    }

}
