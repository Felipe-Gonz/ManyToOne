
package com.springsimplespasos.hibernate.entidades.onetoone;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "socios")
public class Socio implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int codigo;
    @Column(length = 40)
    private String nombre;
    @Column(unique = true, length = 12)
    private String documento;

    @OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
    private Carnet carnet;
    
    public Socio() {
    }

    public Socio(int codigo, String nombre, String documento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.documento = documento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Carnet getCarnet() {
        return carnet;
    }

    public void setCarnet(Carnet carnet) {
        this.carnet = carnet;
    }
    
    
            
}
