
package com.springsimplespasos.hibernate.entidades.manytoone;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefonos")
public class Telefono implements Serializable   {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Column(unique = true, nullable = false, length = 10)   
    private String numero;
    @ManyToOne(optional = false)
    @JoinColumn(name = "persona_id", foreignKey = @ForeignKey(name = "FK_PERSONA_ID"))
    private Persona persona;
    
    
    public Telefono() {
    }

    public Telefono(int codigo, String numero) {
        this.codigo = codigo;
        this.numero = numero;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
