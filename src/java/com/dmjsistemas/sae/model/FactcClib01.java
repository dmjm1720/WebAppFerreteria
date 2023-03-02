package com.dmjsistemas.sae.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "FACTC_CLIB01")
public class FactcClib01 implements java.io.Serializable {

    @Id
    @Column(name = "CLAVE_DOC", unique = true, nullable = false, length = 20)
    private String claveDoc;

    @Column(name = "CAMPLIB1", length = 0)
    private String camplib1;

    @Column(name = "CAMPLIB2", length = 150)
    private String camplib2;

    @Column(name = "CAMPLIB3", length = 100)
    private String camplib3;

    public FactcClib01() {
    }

    public FactcClib01(String claveDoc) {
        this.claveDoc = claveDoc;
    }

    public FactcClib01(String claveDoc, String camplib1, String camplib2, String camplib3) {
        this.claveDoc = claveDoc;
        this.camplib1 = camplib1;
        this.camplib2 = camplib2;
        this.camplib3 = camplib3;
    }

    public String getClaveDoc() {
        return this.claveDoc;
    }

    public void setClaveDoc(String claveDoc) {
        this.claveDoc = claveDoc;
    }

    public String getCamplib1() {
        return this.camplib1;
    }

    public void setCamplib1(String camplib1) {
        this.camplib1 = camplib1;
    }

    public String getCamplib2() {
        return this.camplib2;
    }

    public void setCamplib2(String camplib2) {
        this.camplib2 = camplib2;
    }

    public String getCamplib3() {
        return this.camplib3;
    }

    public void setCamplib3(String camplib3) {
        this.camplib3 = camplib3;
    }

}
