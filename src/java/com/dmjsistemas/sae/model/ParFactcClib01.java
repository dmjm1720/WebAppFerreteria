package com.dmjsistemas.sae.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAR_FACTC_CLIB01")
public class ParFactcClib01 implements java.io.Serializable {

    @Id
    @Column(name = "CLAVE_DOC", nullable = false, length = 20)
    private String claveDoc;

    @Column(name = "NUM_PART", nullable = false)
    private int numPart;

    @Column(name = "CAMPLIB1", length = 0)
    private String camplib1;

    @Column(name = "CAMPLIB2", length = 5)
    private String camplib2;

    public ParFactcClib01() {
    }

    public ParFactcClib01(String claveDoc, int numPart, String camplib1, String camplib2) {
        this.claveDoc = claveDoc;
        this.numPart = numPart;
        this.camplib1 = camplib1;
        this.camplib2 = camplib2;
    }

    public String getClaveDoc() {
        return claveDoc;
    }

    public void setClaveDoc(String claveDoc) {
        this.claveDoc = claveDoc;
    }

    public int getNumPart() {
        return numPart;
    }

    public void setNumPart(int numPart) {
        this.numPart = numPart;
    }

    public String getCamplib1() {
        return camplib1;
    }

    public void setCamplib1(String camplib1) {
        this.camplib1 = camplib1;
    }

    public String getCamplib2() {
        return camplib2;
    }

    public void setCamplib2(String camplib2) {
        this.camplib2 = camplib2;
    }

}
