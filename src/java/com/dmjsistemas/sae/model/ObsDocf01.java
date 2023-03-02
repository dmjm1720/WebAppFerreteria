package com.dmjsistemas.sae.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "OBS_DOCF01")
public class ObsDocf01 implements java.io.Serializable {

    @Id
    @Column(name = "CVE_OBS", unique = true, nullable = false)
    private int cveObs;

    @Column(name = "STR_OBS")
    private String strObs;

    public ObsDocf01() {
    }

    public ObsDocf01(int cveObs) {
        this.cveObs = cveObs;
    }

    public ObsDocf01(int cveObs, String strObs) {
        this.cveObs = cveObs;
        this.strObs = strObs;
    }

    public int getCveObs() {
        return this.cveObs;
    }

    public void setCveObs(int cveObs) {
        this.cveObs = cveObs;
    }

    public String getStrObs() {
        return this.strObs;
    }

    public void setStrObs(String strObs) {
        this.strObs = strObs;
    }

}
