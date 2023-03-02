package com.dmjsistemas.sae.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FOLIOSF01")
public class Foliosf01 implements java.io.Serializable {

    @Column(name = "TIP_DOC", nullable = false, length = 1)
    @Id
    private String tipDoc;

    @Column(name = "SERIE", nullable = false, length = 10)
    private String serie;

    @Column(name = "FOLIODESDE", nullable = false)
    private int foliodesde;

    @Column(name = "FOLIOHASTA")
    private Integer foliohasta;

    @Column(name = "AUTORIZA")
    private Integer autoriza;

    @Column(name = "AUTOANIO", length = 4)
    private String autoanio;

    @Column(name = "ULT_DOC")
    private Integer ultDoc;

    @Column(name = "TIPO", length = 1)
    private String tipo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECH_ULT_DOC", length = 19)
    private Date fechUltDoc;

    @Column(name = "CBB", length = 50)
    private String cbb;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHAAPROBCBB", length = 19)
    private Date fechaaprobcbb;

    @Column(name = "IMGCBB")
    private byte[] imgcbb;

    @Column(name = "FOLIOPERSONALIZADO", length = 1)
    private String foliopersonalizado;

    @Column(name = "PARCIALIDAD", length = 1)
    private String parcialidad;

    @Column(name = "STATUS", length = 1)
    private String status;

    public Foliosf01() {
    }

    public Foliosf01(String tipDoc, String serie, int foliodesde, Integer foliohasta, Integer autoriza, String autoanio, Integer ultDoc, String tipo, Date fechUltDoc, String cbb, Date fechaaprobcbb, byte[] imgcbb, String foliopersonalizado, String parcialidad, String status) {
        this.tipDoc = tipDoc;
        this.serie = serie;
        this.foliodesde = foliodesde;
        this.foliohasta = foliohasta;
        this.autoriza = autoriza;
        this.autoanio = autoanio;
        this.ultDoc = ultDoc;
        this.tipo = tipo;
        this.fechUltDoc = fechUltDoc;
        this.cbb = cbb;
        this.fechaaprobcbb = fechaaprobcbb;
        this.imgcbb = imgcbb;
        this.foliopersonalizado = foliopersonalizado;
        this.parcialidad = parcialidad;
        this.status = status;
    }

    public String getTipDoc() {
        return tipDoc;
    }

    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getFoliodesde() {
        return foliodesde;
    }

    public void setFoliodesde(int foliodesde) {
        this.foliodesde = foliodesde;
    }

    public Integer getFoliohasta() {
        return foliohasta;
    }

    public void setFoliohasta(Integer foliohasta) {
        this.foliohasta = foliohasta;
    }

    public Integer getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(Integer autoriza) {
        this.autoriza = autoriza;
    }

    public String getAutoanio() {
        return autoanio;
    }

    public void setAutoanio(String autoanio) {
        this.autoanio = autoanio;
    }

    public Integer getUltDoc() {
        return ultDoc;
    }

    public void setUltDoc(Integer ultDoc) {
        this.ultDoc = ultDoc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechUltDoc() {
        return fechUltDoc;
    }

    public void setFechUltDoc(Date fechUltDoc) {
        this.fechUltDoc = fechUltDoc;
    }

    public String getCbb() {
        return cbb;
    }

    public void setCbb(String cbb) {
        this.cbb = cbb;
    }

    public Date getFechaaprobcbb() {
        return fechaaprobcbb;
    }

    public void setFechaaprobcbb(Date fechaaprobcbb) {
        this.fechaaprobcbb = fechaaprobcbb;
    }

    public byte[] getImgcbb() {
        return imgcbb;
    }

    public void setImgcbb(byte[] imgcbb) {
        this.imgcbb = imgcbb;
    }

    public String getFoliopersonalizado() {
        return foliopersonalizado;
    }

    public void setFoliopersonalizado(String foliopersonalizado) {
        this.foliopersonalizado = foliopersonalizado;
    }

    public String getParcialidad() {
        return parcialidad;
    }

    public void setParcialidad(String parcialidad) {
        this.parcialidad = parcialidad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
