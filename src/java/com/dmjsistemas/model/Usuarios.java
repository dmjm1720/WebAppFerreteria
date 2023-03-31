package com.dmjsistemas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")
public class Usuarios implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;
    @Column(name = "PERFIL", nullable = false, length = 25)
    private String perfil;
    @Column(name = "CLAVE", nullable = false, length = 250)
    private String clave;

    public Usuarios() {
    }

    public Usuarios(int id, String nombre, String perfil, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.perfil = perfil;
        this.clave = clave;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPerfil() {
        return this.perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
