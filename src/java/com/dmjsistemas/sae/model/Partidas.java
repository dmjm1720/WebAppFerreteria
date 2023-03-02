package com.dmjsistemas.sae.model;

public class Partidas implements java.io.Serializable {

    private int partida;
    private String clave;
    private String descripcion;
    private Double cantidad;
    private String unidadMedida;
    private Double precio;
    private Double importe;
    private Double iva;
    private Double desc1;
    private Double desc2;
    private Double desc3;
    private Double impu4;

    public Partidas() {
    }

    public Partidas(int partida, String clave, String descripcion, Double cantidad, String unidadMedida, Double precio, Double importe, Double iva, Double desc1, Double desc2, Double desc3, Double impu4) {
        this.partida = partida;
        this.clave = clave;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.precio = precio;
        this.importe = importe;
        this.iva = iva;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.desc3 = desc3;
        this.impu4 = impu4;
    }

    public int getPartida() {
        return partida;
    }

    public void setPartida(int partida) {
        this.partida = partida;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getDesc1() {
        return desc1;
    }

    public void setDesc1(Double desc1) {
        this.desc1 = desc1;
    }

    public Double getDesc2() {
        return desc2;
    }

    public void setDesc2(Double desc2) {
        this.desc2 = desc2;
    }

    public Double getDesc3() {
        return desc3;
    }

    public void setDesc3(Double desc3) {
        this.desc3 = desc3;
    }

    public Double getImpu4() {
        return impu4;
    }

    public void setImpu4(Double impu4) {
        this.impu4 = impu4;
    }

}
