package com.dmjsistemas.sae.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FACTC01")

public class Factc01 implements java.io.Serializable {

    @Id
    @Column(name = "CVE_DOC", unique = true, nullable = false, length = 20)
    private String cveDoc;

    @Column(name = "TIP_DOC", length = 1)
    private String tipDoc;

    @Column(name = "CVE_CLPV", nullable = false, length = 10)
    private String cveClpv;

    @Column(name = "STATUS", nullable = false, length = 1)
    private String status;

    @Column(name = "CVE_PEDI", length = 20)
    private String cvePedi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_DOC", nullable = false, length = 19)
    private Date fechaDoc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ENT", length = 19)
    private Date fechaEnt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_VEN", length = 19)
    private Date fechaVen;

    @Column(name = "IMP_TOT1", precision = 15, scale = 0)
    private Double impTot1;

    @Column(name = "IMP_TOT2", precision = 15, scale = 0)
    private Double impTot2;

    @Column(name = "IMP_TOT3", precision = 15, scale = 0)
    private Double impTot3;

    @Column(name = "IMP_TOT4", precision = 15, scale = 0)
    private Double impTot4;

    @Column(name = "DES_FIN", precision = 15, scale = 0)
    private Double desFin;

    @Column(name = "COM_TOT", precision = 15, scale = 0)
    private Double comTot;

    @Column(name = "NUM_MONED")
    private Integer numMoned;

    @Column(name = "TIPCAMB", precision = 15, scale = 0)
    private Double tipcamb;

    @Column(name = "PRIMERPAGO", precision = 15, scale = 0)
    private Double primerpago;

    @Column(name = "RFC", length = 15)
    private String rfc;

    @Column(name = "AUTORIZA")
    private Integer autoriza;

    @Column(name = "FOLIO")
    private Integer folio;

    @Column(name = "SERIE", length = 10)
    private String serie;

    @Column(name = "AUTOANIO", length = 4)
    private String autoanio;

    @Column(name = "ESCFD", length = 1)
    private String escfd;

    @Column(name = "NUM_ALMA")
    private Integer numAlma;

    @Column(name = "ACT_CXC", length = 1)
    private String actCxc;

    @Column(name = "ACT_COI", length = 1)
    private String actCoi;

    @Column(name = "CAN_TOT", precision = 15, scale = 0)
    private Double canTot;

    @Column(name = "CVE_VEND", length = 5)
    private String cveVend;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CANCELA", length = 19)
    private Date fechaCancela;

    @Column(name = "DES_TOT", precision = 15, scale = 0)
    private Double desTot;

    @Column(name = "CONDICION", length = 25)
    private String condicion;

    @Column(name = "NUM_PAGOS")
    private Integer numPagos;

    @Column(name = "DAT_ENVIO")
    private Integer datEnvio;

    @Column(name = "CONTADO", length = 1)
    private String contado;

    @Column(name = "DAT_MOSTR")
    private Integer datMostr;

    @Column(name = "CVE_BITA")
    private Integer cveBita;

    @Column(name = "BLOQ", length = 1)
    private String bloq;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHAELAB", length = 19)
    private Date fechaelab;

    @Column(name = "CTLPOL")
    private Integer ctlpol;

    @Column(name = "CVE_OBS")
    private Integer cveObs;

    @Column(name = "ENLAZADO", length = 1)
    private String enlazado;

    @Column(name = "TIP_DOC_E", length = 1)
    private String tipDocE;

    @Column(name = "FORMAENVIO", length = 1)
    private String formaenvio;

    @Column(name = "DES_FIN_PORC", precision = 15, scale = 0)
    private Double desFinPorc;

    @Column(name = "DES_TOT_PORC", precision = 15, scale = 0)
    private Double desTotPorc;

    @Column(name = "IMPORTE", precision = 15, scale = 0)
    private Double importe;

    @Column(name = "COM_TOT_PORC", precision = 15, scale = 0)
    private Double comTotPorc;

    @Column(name = "METODODEPAGO")
    private String metododepago;

    @Column(name = "NUMCTAPAGO")
    private String numctapago;

    @Column(name = "TIP_DOC_ANT", length = 1)
    private String tipDocAnt;

    @Column(name = "DOC_ANT", length = 20)
    private String docAnt;

    @Column(name = "TIP_DOC_SIG", length = 1)
    private String tipDocSig;

    @Column(name = "DOC_SIG", length = 20)
    private String docSig;

    @Column(name = "UUID", length = 50)
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VERSION_SINC", length = 19)
    private Date versionSinc;

    @Column(name = "FORMADEPAGOSAT", length = 5)
    private String formadepagosat;

    @Column(name = "USO_CFDI", length = 5)
    private String usoCfdi;

    @Column(name = "NUM_ALM_DES")
    private Integer numAlmDes;

    @Column(name = "TIP_TRASLADO", length = 1)
    private String tipTraslado;

    public Factc01() {
    }

    public Factc01(String cveDoc, String tipDoc, String cveClpv, String status, String cvePedi, Date fechaDoc, Date fechaEnt, Date fechaVen, Double impTot1, Double impTot2, Double impTot3, Double impTot4, Double desFin, Double comTot, Integer numMoned, Double tipcamb, Double primerpago, String rfc, Integer autoriza, Integer folio, String serie, String autoanio, String escfd, Integer numAlma, String actCxc, String actCoi, Double canTot, String cveVend, Date fechaCancela, Double desTot, String condicion, Integer numPagos, Integer datEnvio, String contado, Integer datMostr, Integer cveBita, String bloq, Date fechaelab, Integer ctlpol, Integer cveObs, String enlazado, String tipDocE, String formaenvio, Double desFinPorc, Double desTotPorc, Double importe, Double comTotPorc, String metododepago, String numctapago, String tipDocAnt, String docAnt, String tipDocSig, String docSig, String uuid, Date versionSinc, String formadepagosat, String usoCfdi, Integer numAlmDes, String tipTraslado) {
        this.cveDoc = cveDoc;
        this.tipDoc = tipDoc;
        this.cveClpv = cveClpv;
        this.status = status;
        this.cvePedi = cvePedi;
        this.fechaDoc = fechaDoc;
        this.fechaEnt = fechaEnt;
        this.fechaVen = fechaVen;
        this.impTot1 = impTot1;
        this.impTot2 = impTot2;
        this.impTot3 = impTot3;
        this.impTot4 = impTot4;
        this.desFin = desFin;
        this.comTot = comTot;
        this.numMoned = numMoned;
        this.tipcamb = tipcamb;
        this.primerpago = primerpago;
        this.rfc = rfc;
        this.autoriza = autoriza;
        this.folio = folio;
        this.serie = serie;
        this.autoanio = autoanio;
        this.escfd = escfd;
        this.numAlma = numAlma;
        this.actCxc = actCxc;
        this.actCoi = actCoi;
        this.canTot = canTot;
        this.cveVend = cveVend;
        this.fechaCancela = fechaCancela;
        this.desTot = desTot;
        this.condicion = condicion;
        this.numPagos = numPagos;
        this.datEnvio = datEnvio;
        this.contado = contado;
        this.datMostr = datMostr;
        this.cveBita = cveBita;
        this.bloq = bloq;
        this.fechaelab = fechaelab;
        this.ctlpol = ctlpol;
        this.cveObs = cveObs;
        this.enlazado = enlazado;
        this.tipDocE = tipDocE;
        this.formaenvio = formaenvio;
        this.desFinPorc = desFinPorc;
        this.desTotPorc = desTotPorc;
        this.importe = importe;
        this.comTotPorc = comTotPorc;
        this.metododepago = metododepago;
        this.numctapago = numctapago;
        this.tipDocAnt = tipDocAnt;
        this.docAnt = docAnt;
        this.tipDocSig = tipDocSig;
        this.docSig = docSig;
        this.uuid = uuid;
        this.versionSinc = versionSinc;
        this.formadepagosat = formadepagosat;
        this.usoCfdi = usoCfdi;
        this.numAlmDes = numAlmDes;
        this.tipTraslado = tipTraslado;
    }

    public String getCveDoc() {
        return cveDoc;
    }

    public void setCveDoc(String cveDoc) {
        this.cveDoc = cveDoc;
    }

    public String getTipDoc() {
        return tipDoc;
    }

    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    public String getCveClpv() {
        return cveClpv;
    }

    public void setCveClpv(String cveClpv) {
        this.cveClpv = cveClpv;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCvePedi() {
        return cvePedi;
    }

    public void setCvePedi(String cvePedi) {
        this.cvePedi = cvePedi;
    }

    public Date getFechaDoc() {
        return fechaDoc;
    }

    public void setFechaDoc(Date fechaDoc) {
        this.fechaDoc = fechaDoc;
    }

    public Date getFechaEnt() {
        return fechaEnt;
    }

    public void setFechaEnt(Date fechaEnt) {
        this.fechaEnt = fechaEnt;
    }

    public Date getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(Date fechaVen) {
        this.fechaVen = fechaVen;
    }

    public Double getImpTot1() {
        return impTot1;
    }

    public void setImpTot1(Double impTot1) {
        this.impTot1 = impTot1;
    }

    public Double getImpTot2() {
        return impTot2;
    }

    public void setImpTot2(Double impTot2) {
        this.impTot2 = impTot2;
    }

    public Double getImpTot3() {
        return impTot3;
    }

    public void setImpTot3(Double impTot3) {
        this.impTot3 = impTot3;
    }

    public Double getImpTot4() {
        return impTot4;
    }

    public void setImpTot4(Double impTot4) {
        this.impTot4 = impTot4;
    }

    public Double getDesFin() {
        return desFin;
    }

    public void setDesFin(Double desFin) {
        this.desFin = desFin;
    }

    public Double getComTot() {
        return comTot;
    }

    public void setComTot(Double comTot) {
        this.comTot = comTot;
    }

    public Integer getNumMoned() {
        return numMoned;
    }

    public void setNumMoned(Integer numMoned) {
        this.numMoned = numMoned;
    }

    public Double getTipcamb() {
        return tipcamb;
    }

    public void setTipcamb(Double tipcamb) {
        this.tipcamb = tipcamb;
    }

    public Double getPrimerpago() {
        return primerpago;
    }

    public void setPrimerpago(Double primerpago) {
        this.primerpago = primerpago;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Integer getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(Integer autoriza) {
        this.autoriza = autoriza;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getAutoanio() {
        return autoanio;
    }

    public void setAutoanio(String autoanio) {
        this.autoanio = autoanio;
    }

    public String getEscfd() {
        return escfd;
    }

    public void setEscfd(String escfd) {
        this.escfd = escfd;
    }

    public Integer getNumAlma() {
        return numAlma;
    }

    public void setNumAlma(Integer numAlma) {
        this.numAlma = numAlma;
    }

    public String getActCxc() {
        return actCxc;
    }

    public void setActCxc(String actCxc) {
        this.actCxc = actCxc;
    }

    public String getActCoi() {
        return actCoi;
    }

    public void setActCoi(String actCoi) {
        this.actCoi = actCoi;
    }

    public Double getCanTot() {
        return canTot;
    }

    public void setCanTot(Double canTot) {
        this.canTot = canTot;
    }

    public String getCveVend() {
        return cveVend;
    }

    public void setCveVend(String cveVend) {
        this.cveVend = cveVend;
    }

    public Date getFechaCancela() {
        return fechaCancela;
    }

    public void setFechaCancela(Date fechaCancela) {
        this.fechaCancela = fechaCancela;
    }

    public Double getDesTot() {
        return desTot;
    }

    public void setDesTot(Double desTot) {
        this.desTot = desTot;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getNumPagos() {
        return numPagos;
    }

    public void setNumPagos(Integer numPagos) {
        this.numPagos = numPagos;
    }

    public Integer getDatEnvio() {
        return datEnvio;
    }

    public void setDatEnvio(Integer datEnvio) {
        this.datEnvio = datEnvio;
    }

    public String getContado() {
        return contado;
    }

    public void setContado(String contado) {
        this.contado = contado;
    }

    public Integer getDatMostr() {
        return datMostr;
    }

    public void setDatMostr(Integer datMostr) {
        this.datMostr = datMostr;
    }

    public Integer getCveBita() {
        return cveBita;
    }

    public void setCveBita(Integer cveBita) {
        this.cveBita = cveBita;
    }

    public String getBloq() {
        return bloq;
    }

    public void setBloq(String bloq) {
        this.bloq = bloq;
    }

    public Date getFechaelab() {
        return fechaelab;
    }

    public void setFechaelab(Date fechaelab) {
        this.fechaelab = fechaelab;
    }

    public Integer getCtlpol() {
        return ctlpol;
    }

    public void setCtlpol(Integer ctlpol) {
        this.ctlpol = ctlpol;
    }

    public Integer getCveObs() {
        return cveObs;
    }

    public void setCveObs(Integer cveObs) {
        this.cveObs = cveObs;
    }

    public String getEnlazado() {
        return enlazado;
    }

    public void setEnlazado(String enlazado) {
        this.enlazado = enlazado;
    }

    public String getTipDocE() {
        return tipDocE;
    }

    public void setTipDocE(String tipDocE) {
        this.tipDocE = tipDocE;
    }

    public String getFormaenvio() {
        return formaenvio;
    }

    public void setFormaenvio(String formaenvio) {
        this.formaenvio = formaenvio;
    }

    public Double getDesFinPorc() {
        return desFinPorc;
    }

    public void setDesFinPorc(Double desFinPorc) {
        this.desFinPorc = desFinPorc;
    }

    public Double getDesTotPorc() {
        return desTotPorc;
    }

    public void setDesTotPorc(Double desTotPorc) {
        this.desTotPorc = desTotPorc;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getComTotPorc() {
        return comTotPorc;
    }

    public void setComTotPorc(Double comTotPorc) {
        this.comTotPorc = comTotPorc;
    }

    public String getMetododepago() {
        return metododepago;
    }

    public void setMetododepago(String metododepago) {
        this.metododepago = metododepago;
    }

    public String getNumctapago() {
        return numctapago;
    }

    public void setNumctapago(String numctapago) {
        this.numctapago = numctapago;
    }

    public String getTipDocAnt() {
        return tipDocAnt;
    }

    public void setTipDocAnt(String tipDocAnt) {
        this.tipDocAnt = tipDocAnt;
    }

    public String getDocAnt() {
        return docAnt;
    }

    public void setDocAnt(String docAnt) {
        this.docAnt = docAnt;
    }

    public String getTipDocSig() {
        return tipDocSig;
    }

    public void setTipDocSig(String tipDocSig) {
        this.tipDocSig = tipDocSig;
    }

    public String getDocSig() {
        return docSig;
    }

    public void setDocSig(String docSig) {
        this.docSig = docSig;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getVersionSinc() {
        return versionSinc;
    }

    public void setVersionSinc(Date versionSinc) {
        this.versionSinc = versionSinc;
    }

    public String getFormadepagosat() {
        return formadepagosat;
    }

    public void setFormadepagosat(String formadepagosat) {
        this.formadepagosat = formadepagosat;
    }

    public String getUsoCfdi() {
        return usoCfdi;
    }

    public void setUsoCfdi(String usoCfdi) {
        this.usoCfdi = usoCfdi;
    }

    public Integer getNumAlmDes() {
        return numAlmDes;
    }

    public void setNumAlmDes(Integer numAlmDes) {
        this.numAlmDes = numAlmDes;
    }

    public String getTipTraslado() {
        return tipTraslado;
    }

    public void setTipTraslado(String tipTraslado) {
        this.tipTraslado = tipTraslado;
    }

    
    
    
    
}
