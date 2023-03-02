package com.dmjsistemas.sae.model;

import java.util.Date;

public class Infenvio01 implements java.io.Serializable {

    private int cveInfo;
    private String cveCons;
    private String nombre;
    private String calle;
    private String numint;
    private String numext;
    private String cruzamientos;
    private String cruzamientos2;
    private String pob;
    private String curp;
    private String referdir;
    private String cveZona;
    private int cveObs;
    private String strnoguia;
    private String strmodoenv;
    private String fechaEnv;
    private String nombreRecep;
    private String noRecep;
    private String fechaRecep;
    private String colonia;
    private String codigo;
    private String estado;
    private String pais;
    private String municipio;
    private String fEntrega;
    private String guiaEnv;
    private String facEnv;
    private String idGuia;
    private String rEvidencia;
    private String rFactura;
    private String cvePedTiend;
    private String paqueteria;
    private String cvePaisSat;
    private String regFisc;
    private String regFeed;

    public Infenvio01() {
    }

    public Infenvio01(int cveInfo, String cveCons, String nombre, String calle, String numint, String numext, String cruzamientos, String cruzamientos2, String pob, String curp, String referdir, String cveZona, int cveObs, String strnoguia, String strmodoenv, String fechaEnv, String nombreRecep, String noRecep, String fechaRecep, String colonia, String codigo, String estado, String pais, String municipio, String fEntrega, String guiaEnv, String facEnv, String idGuia, String rEvidencia, String rFactura, String cvePedTiend, String paqueteria, String cvePaisSat, String regFisc, String regFeed) {
        this.cveInfo = cveInfo;
        this.cveCons = cveCons;
        this.nombre = nombre;
        this.calle = calle;
        this.numint = numint;
        this.numext = numext;
        this.cruzamientos = cruzamientos;
        this.cruzamientos2 = cruzamientos2;
        this.pob = pob;
        this.curp = curp;
        this.referdir = referdir;
        this.cveZona = cveZona;
        this.cveObs = cveObs;
        this.strnoguia = strnoguia;
        this.strmodoenv = strmodoenv;
        this.fechaEnv = fechaEnv;
        this.nombreRecep = nombreRecep;
        this.noRecep = noRecep;
        this.fechaRecep = fechaRecep;
        this.colonia = colonia;
        this.codigo = codigo;
        this.estado = estado;
        this.pais = pais;
        this.municipio = municipio;
        this.fEntrega = fEntrega;
        this.guiaEnv = guiaEnv;
        this.facEnv = facEnv;
        this.idGuia = idGuia;
        this.rEvidencia = rEvidencia;
        this.rFactura = rFactura;
        this.cvePedTiend = cvePedTiend;
        this.paqueteria = paqueteria;
        this.cvePaisSat = cvePaisSat;
        this.regFisc = regFisc;
        this.regFeed = regFeed;
    }

    public int getCveInfo() {
        return cveInfo;
    }

    public void setCveInfo(int cveInfo) {
        this.cveInfo = cveInfo;
    }

    public String getCveCons() {
        return cveCons;
    }

    public void setCveCons(String cveCons) {
        this.cveCons = cveCons;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumint() {
        return numint;
    }

    public void setNumint(String numint) {
        this.numint = numint;
    }

    public String getNumext() {
        return numext;
    }

    public void setNumext(String numext) {
        this.numext = numext;
    }

    public String getCruzamientos() {
        return cruzamientos;
    }

    public void setCruzamientos(String cruzamientos) {
        this.cruzamientos = cruzamientos;
    }

    public String getCruzamientos2() {
        return cruzamientos2;
    }

    public void setCruzamientos2(String cruzamientos2) {
        this.cruzamientos2 = cruzamientos2;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getReferdir() {
        return referdir;
    }

    public void setReferdir(String referdir) {
        this.referdir = referdir;
    }

    public String getCveZona() {
        return cveZona;
    }

    public void setCveZona(String cveZona) {
        this.cveZona = cveZona;
    }

    public int getCveObs() {
        return cveObs;
    }

    public void setCveObs(int cveObs) {
        this.cveObs = cveObs;
    }

    public String getStrnoguia() {
        return strnoguia;
    }

    public void setStrnoguia(String strnoguia) {
        this.strnoguia = strnoguia;
    }

    public String getStrmodoenv() {
        return strmodoenv;
    }

    public void setStrmodoenv(String strmodoenv) {
        this.strmodoenv = strmodoenv;
    }

    public String getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(String fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public String getNombreRecep() {
        return nombreRecep;
    }

    public void setNombreRecep(String nombreRecep) {
        this.nombreRecep = nombreRecep;
    }

    public String getNoRecep() {
        return noRecep;
    }

    public void setNoRecep(String noRecep) {
        this.noRecep = noRecep;
    }

    public String getFechaRecep() {
        return fechaRecep;
    }

    public void setFechaRecep(String fechaRecep) {
        this.fechaRecep = fechaRecep;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getfEntrega() {
        return fEntrega;
    }

    public void setfEntrega(String fEntrega) {
        this.fEntrega = fEntrega;
    }

    public String getGuiaEnv() {
        return guiaEnv;
    }

    public void setGuiaEnv(String guiaEnv) {
        this.guiaEnv = guiaEnv;
    }

    public String getFacEnv() {
        return facEnv;
    }

    public void setFacEnv(String facEnv) {
        this.facEnv = facEnv;
    }

    public String getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(String idGuia) {
        this.idGuia = idGuia;
    }

    public String getrEvidencia() {
        return rEvidencia;
    }

    public void setrEvidencia(String rEvidencia) {
        this.rEvidencia = rEvidencia;
    }

    public String getrFactura() {
        return rFactura;
    }

    public void setrFactura(String rFactura) {
        this.rFactura = rFactura;
    }

    public String getCvePedTiend() {
        return cvePedTiend;
    }

    public void setCvePedTiend(String cvePedTiend) {
        this.cvePedTiend = cvePedTiend;
    }

    public String getPaqueteria() {
        return paqueteria;
    }

    public void setPaqueteria(String paqueteria) {
        this.paqueteria = paqueteria;
    }

    public String getCvePaisSat() {
        return cvePaisSat;
    }

    public void setCvePaisSat(String cvePaisSat) {
        this.cvePaisSat = cvePaisSat;
    }

    public String getRegFisc() {
        return regFisc;
    }

    public void setRegFisc(String regFisc) {
        this.regFisc = regFisc;
    }

    public String getRegFeed() {
        return regFeed;
    }

    public void setRegFeed(String regFeed) {
        this.regFeed = regFeed;
    }

   

    

}
