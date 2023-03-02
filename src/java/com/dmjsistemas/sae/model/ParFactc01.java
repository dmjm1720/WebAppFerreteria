package com.dmjsistemas.sae.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PAR_FACTC01")
public class ParFactc01 implements java.io.Serializable {

    @Id
    @Column(name = "CVE_DOC", nullable = false, length = 20)
    private String cveDoc;

    @Column(name = "NUM_PAR", nullable = false)
    private int numPar;

    @Column(name = "CVE_ART", length = 16)
    private String cveArt;

    @Column(name = "CANT", precision = 15, scale = 0)
    private Double cant;

    @Column(name = "PXS", precision = 15, scale = 0)
    private Double pxs;

    @Column(name = "PREC", precision = 15, scale = 0)
    private Double prec;

    @Column(name = "COST", precision = 15, scale = 0)
    private Double cost;

    @Column(name = "IMPU1", precision = 15, scale = 0)
    private Double impu1;

    @Column(name = "IMPU2", precision = 15, scale = 0)
    private Double impu2;

    @Column(name = "IMPU3", precision = 15, scale = 0)
    private Double impu3;

    @Column(name = "IMPU4", precision = 15, scale = 0)
    private Double impu4;

    @Column(name = "IMP1APLA")
    private Short imp1apla;

    @Column(name = "IMP2APLA")
    private Short imp2apla;

    @Column(name = "IMP3APLA")
    private Short imp3apla;

    @Column(name = "IMP4APLA")
    private Short imp4apla;

    @Column(name = "TOTIMP1", precision = 15, scale = 0)
    private Double totimp1;

    @Column(name = "TOTIMP2", precision = 15, scale = 0)
    private Double totimp2;

    @Column(name = "TOTIMP3", precision = 15, scale = 0)
    private Double totimp3;

    @Column(name = "TOTIMP4", precision = 15, scale = 0)
    private Double totimp4;

    @Column(name = "DESC1", precision = 15, scale = 0)
    private Double desc1;

    @Column(name = "DESC2", precision = 15, scale = 0)
    private Double desc2;

    @Column(name = "DESC3", precision = 15, scale = 0)
    private Double desc3;

    @Column(name = "COMI", precision = 15, scale = 0)
    private Double comi;

    @Column(name = "APAR", precision = 15, scale = 0)
    private Double apar;

    @Column(name = "ACT_INV", length = 1)
    private String actInv;

    @Column(name = "NUM_ALM")
    private Integer numAlm;

    @Column(name = "POLIT_APLI", length = 1)
    private String politApli;

    @Column(name = "TIP_CAM", precision = 15, scale = 0)
    private Double tipCam;

    @Column(name = "UNI_VENTA", length = 10)
    private String uniVenta;

    @Column(name = "TIPO_PROD", length = 1)
    private String tipoProd;

    @Column(name = "CVE_OBS")
    private Integer cveObs;

    @Column(name = "REG_SERIE")
    private Integer regSerie;

    @Column(name = "E_LTPD")
    private Integer ELtpd;

    @Column(name = "TIPO_ELEM", length = 1)
    private String tipoElem;

    @Column(name = "NUM_MOV")
    private Integer numMov;

    @Column(name = "TOT_PARTIDA", precision = 15, scale = 0)
    private Double totPartida;

    @Column(name = "IMPRIMIR", length = 1)
    private String imprimir;

    @Column(name = "MAN_IEPS", length = 1)
    private String manIeps;

    @Column(name = "APL_MAN_IMP")
    private Integer aplManImp;

    @Column(name = "CUOTA_IEPS", precision = 15, scale = 0)
    private Double cuotaIeps;

    @Column(name = "APL_MAN_IEPS", length = 1)
    private String aplManIeps;

    @Column(name = "MTO_PORC", precision = 15, scale = 0)
    private Double mtoPorc;

    @Column(name = "MTO_CUOTA", precision = 15, scale = 0)
    private Double mtoCuota;

    @Column(name = "CVE_ESQ")
    private Integer cveEsq;

    @Column(name = "DESCR_ART", length = 40)
    private String descrArt;

    @Column(name = "UUID", length = 50)
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VERSION_SINC", length = 19)
    private Date versionSinc;

    @Column(name = "PREC_NETO", precision = 15, scale = 0)
    private Double precNeto;

    @Column(name = "ID_RELACION", length = 30)
    private String idRelacion;

    @Column(name = "CVE_PRODSERV", length = 9)
    private String cveProdserv;

    @Column(name = "CVE_UNIDAD", length = 4)
    private String cveUnidad;

    public ParFactc01() {
    }

    public ParFactc01(String cveDoc, int numPar, String cveArt, Double cant, Double pxs, Double prec, Double cost, Double impu1, Double impu2, Double impu3, Double impu4, Short imp1apla, Short imp2apla, Short imp3apla, Short imp4apla, Double totimp1, Double totimp2, Double totimp3, Double totimp4, Double desc1, Double desc2, Double desc3, Double comi, Double apar, String actInv, Integer numAlm, String politApli, Double tipCam, String uniVenta, String tipoProd, Integer cveObs, Integer regSerie, Integer ELtpd, String tipoElem, Integer numMov, Double totPartida, String imprimir, String manIeps, Integer aplManImp, Double cuotaIeps, String aplManIeps, Double mtoPorc, Double mtoCuota, Integer cveEsq, String descrArt, String uuid, Date versionSinc, Double precNeto, String idRelacion, String cveProdserv, String cveUnidad) {
        this.cveDoc = cveDoc;
        this.numPar = numPar;
        this.cveArt = cveArt;
        this.cant = cant;
        this.pxs = pxs;
        this.prec = prec;
        this.cost = cost;
        this.impu1 = impu1;
        this.impu2 = impu2;
        this.impu3 = impu3;
        this.impu4 = impu4;
        this.imp1apla = imp1apla;
        this.imp2apla = imp2apla;
        this.imp3apla = imp3apla;
        this.imp4apla = imp4apla;
        this.totimp1 = totimp1;
        this.totimp2 = totimp2;
        this.totimp3 = totimp3;
        this.totimp4 = totimp4;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.desc3 = desc3;
        this.comi = comi;
        this.apar = apar;
        this.actInv = actInv;
        this.numAlm = numAlm;
        this.politApli = politApli;
        this.tipCam = tipCam;
        this.uniVenta = uniVenta;
        this.tipoProd = tipoProd;
        this.cveObs = cveObs;
        this.regSerie = regSerie;
        this.ELtpd = ELtpd;
        this.tipoElem = tipoElem;
        this.numMov = numMov;
        this.totPartida = totPartida;
        this.imprimir = imprimir;
        this.manIeps = manIeps;
        this.aplManImp = aplManImp;
        this.cuotaIeps = cuotaIeps;
        this.aplManIeps = aplManIeps;
        this.mtoPorc = mtoPorc;
        this.mtoCuota = mtoCuota;
        this.cveEsq = cveEsq;
        this.descrArt = descrArt;
        this.uuid = uuid;
        this.versionSinc = versionSinc;
        this.precNeto = precNeto;
        this.idRelacion = idRelacion;
        this.cveProdserv = cveProdserv;
        this.cveUnidad = cveUnidad;
    }

    public String getCveArt() {
        return this.cveArt;
    }

    public void setCveArt(String cveArt) {
        this.cveArt = cveArt;
    }

    public int getNumPar() {
        return numPar;
    }

    public void setNumPar(int numPar) {
        this.numPar = numPar;
    }

    public Double getCant() {
        return this.cant;
    }

    public void setCant(Double cant) {
        this.cant = cant;
    }

    public Double getPxs() {
        return this.pxs;
    }

    public void setPxs(Double pxs) {
        this.pxs = pxs;
    }

    public Double getPrec() {
        return this.prec;
    }

    public void setPrec(Double prec) {
        this.prec = prec;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getImpu1() {
        return this.impu1;
    }

    public void setImpu1(Double impu1) {
        this.impu1 = impu1;
    }

    public Double getImpu2() {
        return this.impu2;
    }

    public void setImpu2(Double impu2) {
        this.impu2 = impu2;
    }

    public Double getImpu3() {
        return this.impu3;
    }

    public void setImpu3(Double impu3) {
        this.impu3 = impu3;
    }

    public Double getImpu4() {
        return this.impu4;
    }

    public void setImpu4(Double impu4) {
        this.impu4 = impu4;
    }

    public Short getImp1apla() {
        return this.imp1apla;
    }

    public void setImp1apla(Short imp1apla) {
        this.imp1apla = imp1apla;
    }

    public Short getImp2apla() {
        return this.imp2apla;
    }

    public void setImp2apla(Short imp2apla) {
        this.imp2apla = imp2apla;
    }

    public Short getImp3apla() {
        return this.imp3apla;
    }

    public void setImp3apla(Short imp3apla) {
        this.imp3apla = imp3apla;
    }

    public Short getImp4apla() {
        return this.imp4apla;
    }

    public void setImp4apla(Short imp4apla) {
        this.imp4apla = imp4apla;
    }

    public Double getTotimp1() {
        return this.totimp1;
    }

    public void setTotimp1(Double totimp1) {
        this.totimp1 = totimp1;
    }

    public Double getTotimp2() {
        return this.totimp2;
    }

    public void setTotimp2(Double totimp2) {
        this.totimp2 = totimp2;
    }

    public Double getTotimp3() {
        return this.totimp3;
    }

    public void setTotimp3(Double totimp3) {
        this.totimp3 = totimp3;
    }

    public Double getTotimp4() {
        return this.totimp4;
    }

    public void setTotimp4(Double totimp4) {
        this.totimp4 = totimp4;
    }

    public Double getDesc1() {
        return this.desc1;
    }

    public void setDesc1(Double desc1) {
        this.desc1 = desc1;
    }

    public Double getDesc2() {
        return this.desc2;
    }

    public void setDesc2(Double desc2) {
        this.desc2 = desc2;
    }

    public Double getDesc3() {
        return this.desc3;
    }

    public void setDesc3(Double desc3) {
        this.desc3 = desc3;
    }

    public Double getComi() {
        return this.comi;
    }

    public void setComi(Double comi) {
        this.comi = comi;
    }

    public Double getApar() {
        return this.apar;
    }

    public void setApar(Double apar) {
        this.apar = apar;
    }

    public String getActInv() {
        return this.actInv;
    }

    public void setActInv(String actInv) {
        this.actInv = actInv;
    }

    public Integer getNumAlm() {
        return this.numAlm;
    }

    public void setNumAlm(Integer numAlm) {
        this.numAlm = numAlm;
    }

    public String getPolitApli() {
        return this.politApli;
    }

    public void setPolitApli(String politApli) {
        this.politApli = politApli;
    }

    public Double getTipCam() {
        return this.tipCam;
    }

    public void setTipCam(Double tipCam) {
        this.tipCam = tipCam;
    }

    public String getUniVenta() {
        return this.uniVenta;
    }

    public void setUniVenta(String uniVenta) {
        this.uniVenta = uniVenta;
    }

    public String getTipoProd() {
        return this.tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public Integer getCveObs() {
        return this.cveObs;
    }

    public void setCveObs(Integer cveObs) {
        this.cveObs = cveObs;
    }

    public Integer getRegSerie() {
        return this.regSerie;
    }

    public void setRegSerie(Integer regSerie) {
        this.regSerie = regSerie;
    }

    public Integer getELtpd() {
        return this.ELtpd;
    }

    public void setELtpd(Integer ELtpd) {
        this.ELtpd = ELtpd;
    }

    public String getTipoElem() {
        return this.tipoElem;
    }

    public void setTipoElem(String tipoElem) {
        this.tipoElem = tipoElem;
    }

    public Integer getNumMov() {
        return this.numMov;
    }

    public void setNumMov(Integer numMov) {
        this.numMov = numMov;
    }

    public Double getTotPartida() {
        return this.totPartida;
    }

    public void setTotPartida(Double totPartida) {
        this.totPartida = totPartida;
    }

    public String getImprimir() {
        return this.imprimir;
    }

    public void setImprimir(String imprimir) {
        this.imprimir = imprimir;
    }

    public String getManIeps() {
        return this.manIeps;
    }

    public void setManIeps(String manIeps) {
        this.manIeps = manIeps;
    }

    public Integer getAplManImp() {
        return this.aplManImp;
    }

    public void setAplManImp(Integer aplManImp) {
        this.aplManImp = aplManImp;
    }

    public Double getCuotaIeps() {
        return this.cuotaIeps;
    }

    public void setCuotaIeps(Double cuotaIeps) {
        this.cuotaIeps = cuotaIeps;
    }

    public String getAplManIeps() {
        return this.aplManIeps;
    }

    public void setAplManIeps(String aplManIeps) {
        this.aplManIeps = aplManIeps;
    }

    public Double getMtoPorc() {
        return this.mtoPorc;
    }

    public void setMtoPorc(Double mtoPorc) {
        this.mtoPorc = mtoPorc;
    }

    public Double getMtoCuota() {
        return this.mtoCuota;
    }

    public void setMtoCuota(Double mtoCuota) {
        this.mtoCuota = mtoCuota;
    }

    public Integer getCveEsq() {
        return this.cveEsq;
    }

    public void setCveEsq(Integer cveEsq) {
        this.cveEsq = cveEsq;
    }

    public String getDescrArt() {
        return this.descrArt;
    }

    public void setDescrArt(String descrArt) {
        this.descrArt = descrArt;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getVersionSinc() {
        return this.versionSinc;
    }

    public void setVersionSinc(Date versionSinc) {
        this.versionSinc = versionSinc;
    }

    public Double getPrecNeto() {
        return this.precNeto;
    }

    public void setPrecNeto(Double precNeto) {
        this.precNeto = precNeto;
    }

    public String getIdRelacion() {
        return this.idRelacion;
    }

    public void setIdRelacion(String idRelacion) {
        this.idRelacion = idRelacion;
    }

    public String getCveProdserv() {
        return this.cveProdserv;
    }

    public void setCveProdserv(String cveProdserv) {
        this.cveProdserv = cveProdserv;
    }

    public String getCveUnidad() {
        return this.cveUnidad;
    }

    public void setCveUnidad(String cveUnidad) {
        this.cveUnidad = cveUnidad;
    }

    public String getCveDoc() {
        return cveDoc;
    }

    public void setCveDoc(String cveDoc) {
        this.cveDoc = cveDoc;
    }

}
