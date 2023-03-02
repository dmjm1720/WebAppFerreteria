package com.dmjsistemas.sae.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "INVE01")
public class Inve01 implements java.io.Serializable {

    @Id
    @Column(name = "CVE_ART", unique = true, nullable = false, length = 16)
    private String cveArt;

    @Column(name = "DESCR", length = 40)
    private String descr;

    @Column(name = "LIN_PROD", length = 5)
    private String linProd;

    @Column(name = "CON_SERIE", length = 1)
    private String conSerie;

    @Column(name = "UNI_MED", length = 10)
    private String uniMed;

    @Column(name = "UNI_EMP", precision = 15, scale = 0)
    private Double uniEmp;

    @Column(name = "CTRL_ALM", length = 10)
    private String ctrlAlm;

    @Column(name = "TIEM_SURT")
    private Integer tiemSurt;

    @Column(name = "STOCK_MIN", precision = 15, scale = 0)
    private Double stockMin;

    @Column(name = "STOCK_MAX", precision = 15, scale = 0)
    private Double stockMax;

    @Column(name = "TIP_COSTEO", length = 1)
    private String tipCosteo;

    @Column(name = "NUM_MON")
    private Integer numMon;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCH_ULTCOM", length = 19)
    private Date fchUltcom;

    @Column(name = "COMP_X_REC", precision = 15, scale = 0)
    private Double compXRec;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCH_ULTVTA", length = 19)
    private Date fchUltvta;

    @Column(name = "PEND_SURT", precision = 15, scale = 0)
    private Double pendSurt;

    @Column(name = "EXIST", precision = 15, scale = 0)
    private Double exist;

    @Column(name = "COSTO_PROM", precision = 15, scale = 0)
    private Double costoProm;

    @Column(name = "ULT_COSTO", precision = 15, scale = 0)
    private Double ultCosto;

    @Column(name = "CVE_OBS")
    private Integer cveObs;

    @Column(name = "TIPO_ELE", length = 1)
    private String tipoEle;

    @Column(name = "UNI_ALT", length = 10)
    private String uniAlt;

    @Column(name = "FAC_CONV", precision = 15, scale = 0)
    private Double facConv;

    @Column(name = "APART", precision = 15, scale = 0)
    private Double apart;

    @Column(name = "CON_LOTE", length = 1)
    private String conLote;

    @Column(name = "CON_PEDIMENTO", length = 1)
    private String conPedimento;

    @Column(name = "PESO", precision = 15, scale = 0)
    private Double peso;

    @Column(name = "VOLUMEN", precision = 15, scale = 0)
    private Double volumen;

    @Column(name = "CVE_ESQIMPU")
    private Integer cveEsqimpu;

    @Column(name = "CVE_BITA")
    private Integer cveBita;

    @Column(name = "VTAS_ANL_C", precision = 15, scale = 0)
    private Double vtasAnlC;

    @Column(name = "VTAS_ANL_M", precision = 15, scale = 0)
    private Double vtasAnlM;

    @Column(name = "COMP_ANL_C", precision = 15, scale = 0)
    private Double compAnlC;

    @Column(name = "COMP_ANL_M", precision = 15, scale = 0)
    private Double compAnlM;

    @Column(name = "PREFIJO", length = 8)
    private String prefijo;

    @Column(name = "TALLA", length = 8)
    private String talla;

    @Column(name = "COLOR", length = 8)
    private String color;

    @Column(name = "CUENT_CONT", length = 28)
    private String cuentCont;

    @Column(name = "CVE_IMAGEN", length = 16)
    private String cveImagen;

    @Column(name = "BLK_CST_EXT", length = 1)
    private String blkCstExt;

    @Column(name = "STATUS", length = 1)
    private String status;

    @Column(name = "MAN_IEPS", length = 1)
    private String manIeps;

    @Column(name = "APL_MAN_IMP")
    private Integer aplManImp;

    @Column(name = "CUOTA_IEPS", precision = 15, scale = 0)
    private Double cuotaIeps;

    @Column(name = "APL_MAN_IEPS", length = 1)
    private String aplManIeps;

    @Column(name = "UUID", length = 50)
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VERSION_SINC", length = 19)
    private Date versionSinc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VERSION_SINC_FECHA_IMG", length = 19)
    private Date versionSincFechaImg;

    @Column(name = "CVE_PRODSERV", length = 9)
    private String cveProdserv;

    @Column(name = "CVE_UNIDAD", length = 4)
    private String cveUnidad;

    @Column(name = "EDO_PUBL_ML", length = 1)
    private String edoPublMl;

    @Column(name = "CVE_PUBL_ML", length = 20)
    private String cvePublMl;

    @Column(name = "CONDICION_ML", length = 5)
    private String condicionMl;

    @Column(name = "TIPO_PUBL_ML", length = 12)
    private String tipoPublMl;

    @Column(name = "MODO_ENVIO_ML", length = 15)
    private String modoEnvioMl;

    @Column(name = "LARGO_ML", precision = 15, scale = 0)
    private Double largoMl;

    @Column(name = "ALTO_ML", precision = 15, scale = 0)
    private Double altoMl;

    @Column(name = "ANCHO_ML", precision = 15, scale = 0)
    private Double anchoMl;

    @Column(name = "ENVIO_ML", length = 2)
    private String envioMl;

    @Column(name = "CATEG_ML", length = 30)
    private String categMl;

    @Column(name = "CAMPOS_CATEG_ML", length = 3000)
    private String camposCategMl;

    @Column(name = "DISPONIBLE_PUBL", length = 1)
    private String disponiblePubl;

    @Column(name = "CVE_CATE_ML", length = 20)
    private String cveCateMl;

    @Column(name = "LAST_UPDATE_ML", length = 30)
    private String lastUpdateMl;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "F_CREA_ML", length = 19)
    private Date FCreaMl;

    @Column(name = "IMAGEN_ML", length = 0)
    private String imagenMl;

    @Column(name = "EN_CATALOGO", length = 1)
    private String enCatalogo;

    @Column(name = "ID_CATALOGO", length = 30)
    private String idCatalogo;

    @Column(name = "TITULO_ML", length = 300)
    private String tituloMl;

    @Column(name = "MAT_PELI", length = 0)
    private String matPeli;

    public Inve01() {
    }

    public Inve01(String cveArt, String descr, String linProd, String conSerie, String uniMed, Double uniEmp, String ctrlAlm, Integer tiemSurt, Double stockMin, Double stockMax, String tipCosteo, Integer numMon, Date fchUltcom, Double compXRec, Date fchUltvta, Double pendSurt, Double exist, Double costoProm, Double ultCosto, Integer cveObs, String tipoEle, String uniAlt, Double facConv, Double apart, String conLote, String conPedimento, Double peso, Double volumen, Integer cveEsqimpu, Integer cveBita, Double vtasAnlC, Double vtasAnlM, Double compAnlC, Double compAnlM, String prefijo, String talla, String color, String cuentCont, String cveImagen, String blkCstExt, String status, String manIeps, Integer aplManImp, Double cuotaIeps, String aplManIeps, String uuid, Date versionSinc, Date versionSincFechaImg, String cveProdserv, String cveUnidad, String edoPublMl, String cvePublMl, String condicionMl, String tipoPublMl, String modoEnvioMl, Double largoMl, Double altoMl, Double anchoMl, String envioMl, String categMl, String camposCategMl, String disponiblePubl, String cveCateMl, String lastUpdateMl, Date FCreaMl, String imagenMl, String enCatalogo, String idCatalogo, String tituloMl, String matPeli) {
        this.cveArt = cveArt;
        this.descr = descr;
        this.linProd = linProd;
        this.conSerie = conSerie;
        this.uniMed = uniMed;
        this.uniEmp = uniEmp;
        this.ctrlAlm = ctrlAlm;
        this.tiemSurt = tiemSurt;
        this.stockMin = stockMin;
        this.stockMax = stockMax;
        this.tipCosteo = tipCosteo;
        this.numMon = numMon;
        this.fchUltcom = fchUltcom;
        this.compXRec = compXRec;
        this.fchUltvta = fchUltvta;
        this.pendSurt = pendSurt;
        this.exist = exist;
        this.costoProm = costoProm;
        this.ultCosto = ultCosto;
        this.cveObs = cveObs;
        this.tipoEle = tipoEle;
        this.uniAlt = uniAlt;
        this.facConv = facConv;
        this.apart = apart;
        this.conLote = conLote;
        this.conPedimento = conPedimento;
        this.peso = peso;
        this.volumen = volumen;
        this.cveEsqimpu = cveEsqimpu;
        this.cveBita = cveBita;
        this.vtasAnlC = vtasAnlC;
        this.vtasAnlM = vtasAnlM;
        this.compAnlC = compAnlC;
        this.compAnlM = compAnlM;
        this.prefijo = prefijo;
        this.talla = talla;
        this.color = color;
        this.cuentCont = cuentCont;
        this.cveImagen = cveImagen;
        this.blkCstExt = blkCstExt;
        this.status = status;
        this.manIeps = manIeps;
        this.aplManImp = aplManImp;
        this.cuotaIeps = cuotaIeps;
        this.aplManIeps = aplManIeps;
        this.uuid = uuid;
        this.versionSinc = versionSinc;
        this.versionSincFechaImg = versionSincFechaImg;
        this.cveProdserv = cveProdserv;
        this.cveUnidad = cveUnidad;
        this.edoPublMl = edoPublMl;
        this.cvePublMl = cvePublMl;
        this.condicionMl = condicionMl;
        this.tipoPublMl = tipoPublMl;
        this.modoEnvioMl = modoEnvioMl;
        this.largoMl = largoMl;
        this.altoMl = altoMl;
        this.anchoMl = anchoMl;
        this.envioMl = envioMl;
        this.categMl = categMl;
        this.camposCategMl = camposCategMl;
        this.disponiblePubl = disponiblePubl;
        this.cveCateMl = cveCateMl;
        this.lastUpdateMl = lastUpdateMl;
        this.FCreaMl = FCreaMl;
        this.imagenMl = imagenMl;
        this.enCatalogo = enCatalogo;
        this.idCatalogo = idCatalogo;
        this.tituloMl = tituloMl;
        this.matPeli = matPeli;
    }

    public String getCveArt() {
        return cveArt;
    }

    public void setCveArt(String cveArt) {
        this.cveArt = cveArt;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getLinProd() {
        return linProd;
    }

    public void setLinProd(String linProd) {
        this.linProd = linProd;
    }

    public String getConSerie() {
        return conSerie;
    }

    public void setConSerie(String conSerie) {
        this.conSerie = conSerie;
    }

    public String getUniMed() {
        return uniMed;
    }

    public void setUniMed(String uniMed) {
        this.uniMed = uniMed;
    }

    public Double getUniEmp() {
        return uniEmp;
    }

    public void setUniEmp(Double uniEmp) {
        this.uniEmp = uniEmp;
    }

    public String getCtrlAlm() {
        return ctrlAlm;
    }

    public void setCtrlAlm(String ctrlAlm) {
        this.ctrlAlm = ctrlAlm;
    }

    public Integer getTiemSurt() {
        return tiemSurt;
    }

    public void setTiemSurt(Integer tiemSurt) {
        this.tiemSurt = tiemSurt;
    }

    public Double getStockMin() {
        return stockMin;
    }

    public void setStockMin(Double stockMin) {
        this.stockMin = stockMin;
    }

    public Double getStockMax() {
        return stockMax;
    }

    public void setStockMax(Double stockMax) {
        this.stockMax = stockMax;
    }

    public String getTipCosteo() {
        return tipCosteo;
    }

    public void setTipCosteo(String tipCosteo) {
        this.tipCosteo = tipCosteo;
    }

    public Integer getNumMon() {
        return numMon;
    }

    public void setNumMon(Integer numMon) {
        this.numMon = numMon;
    }

    public Date getFchUltcom() {
        return fchUltcom;
    }

    public void setFchUltcom(Date fchUltcom) {
        this.fchUltcom = fchUltcom;
    }

    public Double getCompXRec() {
        return compXRec;
    }

    public void setCompXRec(Double compXRec) {
        this.compXRec = compXRec;
    }

    public Date getFchUltvta() {
        return fchUltvta;
    }

    public void setFchUltvta(Date fchUltvta) {
        this.fchUltvta = fchUltvta;
    }

    public Double getPendSurt() {
        return pendSurt;
    }

    public void setPendSurt(Double pendSurt) {
        this.pendSurt = pendSurt;
    }

    public Double getExist() {
        return exist;
    }

    public void setExist(Double exist) {
        this.exist = exist;
    }

    public Double getCostoProm() {
        return costoProm;
    }

    public void setCostoProm(Double costoProm) {
        this.costoProm = costoProm;
    }

    public Double getUltCosto() {
        return ultCosto;
    }

    public void setUltCosto(Double ultCosto) {
        this.ultCosto = ultCosto;
    }

    public Integer getCveObs() {
        return cveObs;
    }

    public void setCveObs(Integer cveObs) {
        this.cveObs = cveObs;
    }

    public String getTipoEle() {
        return tipoEle;
    }

    public void setTipoEle(String tipoEle) {
        this.tipoEle = tipoEle;
    }

    public String getUniAlt() {
        return uniAlt;
    }

    public void setUniAlt(String uniAlt) {
        this.uniAlt = uniAlt;
    }

    public Double getFacConv() {
        return facConv;
    }

    public void setFacConv(Double facConv) {
        this.facConv = facConv;
    }

    public Double getApart() {
        return apart;
    }

    public void setApart(Double apart) {
        this.apart = apart;
    }

    public String getConLote() {
        return conLote;
    }

    public void setConLote(String conLote) {
        this.conLote = conLote;
    }

    public String getConPedimento() {
        return conPedimento;
    }

    public void setConPedimento(String conPedimento) {
        this.conPedimento = conPedimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Integer getCveEsqimpu() {
        return cveEsqimpu;
    }

    public void setCveEsqimpu(Integer cveEsqimpu) {
        this.cveEsqimpu = cveEsqimpu;
    }

    public Integer getCveBita() {
        return cveBita;
    }

    public void setCveBita(Integer cveBita) {
        this.cveBita = cveBita;
    }

    public Double getVtasAnlC() {
        return vtasAnlC;
    }

    public void setVtasAnlC(Double vtasAnlC) {
        this.vtasAnlC = vtasAnlC;
    }

    public Double getVtasAnlM() {
        return vtasAnlM;
    }

    public void setVtasAnlM(Double vtasAnlM) {
        this.vtasAnlM = vtasAnlM;
    }

    public Double getCompAnlC() {
        return compAnlC;
    }

    public void setCompAnlC(Double compAnlC) {
        this.compAnlC = compAnlC;
    }

    public Double getCompAnlM() {
        return compAnlM;
    }

    public void setCompAnlM(Double compAnlM) {
        this.compAnlM = compAnlM;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCuentCont() {
        return cuentCont;
    }

    public void setCuentCont(String cuentCont) {
        this.cuentCont = cuentCont;
    }

    public String getCveImagen() {
        return cveImagen;
    }

    public void setCveImagen(String cveImagen) {
        this.cveImagen = cveImagen;
    }

    public String getBlkCstExt() {
        return blkCstExt;
    }

    public void setBlkCstExt(String blkCstExt) {
        this.blkCstExt = blkCstExt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManIeps() {
        return manIeps;
    }

    public void setManIeps(String manIeps) {
        this.manIeps = manIeps;
    }

    public Integer getAplManImp() {
        return aplManImp;
    }

    public void setAplManImp(Integer aplManImp) {
        this.aplManImp = aplManImp;
    }

    public Double getCuotaIeps() {
        return cuotaIeps;
    }

    public void setCuotaIeps(Double cuotaIeps) {
        this.cuotaIeps = cuotaIeps;
    }

    public String getAplManIeps() {
        return aplManIeps;
    }

    public void setAplManIeps(String aplManIeps) {
        this.aplManIeps = aplManIeps;
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

    public Date getVersionSincFechaImg() {
        return versionSincFechaImg;
    }

    public void setVersionSincFechaImg(Date versionSincFechaImg) {
        this.versionSincFechaImg = versionSincFechaImg;
    }

    public String getCveProdserv() {
        return cveProdserv;
    }

    public void setCveProdserv(String cveProdserv) {
        this.cveProdserv = cveProdserv;
    }

    public String getCveUnidad() {
        return cveUnidad;
    }

    public void setCveUnidad(String cveUnidad) {
        this.cveUnidad = cveUnidad;
    }

    public String getEdoPublMl() {
        return edoPublMl;
    }

    public void setEdoPublMl(String edoPublMl) {
        this.edoPublMl = edoPublMl;
    }

    public String getCvePublMl() {
        return cvePublMl;
    }

    public void setCvePublMl(String cvePublMl) {
        this.cvePublMl = cvePublMl;
    }

    public String getCondicionMl() {
        return condicionMl;
    }

    public void setCondicionMl(String condicionMl) {
        this.condicionMl = condicionMl;
    }

    public String getTipoPublMl() {
        return tipoPublMl;
    }

    public void setTipoPublMl(String tipoPublMl) {
        this.tipoPublMl = tipoPublMl;
    }

    public String getModoEnvioMl() {
        return modoEnvioMl;
    }

    public void setModoEnvioMl(String modoEnvioMl) {
        this.modoEnvioMl = modoEnvioMl;
    }

    public Double getLargoMl() {
        return largoMl;
    }

    public void setLargoMl(Double largoMl) {
        this.largoMl = largoMl;
    }

    public Double getAltoMl() {
        return altoMl;
    }

    public void setAltoMl(Double altoMl) {
        this.altoMl = altoMl;
    }

    public Double getAnchoMl() {
        return anchoMl;
    }

    public void setAnchoMl(Double anchoMl) {
        this.anchoMl = anchoMl;
    }

    public String getEnvioMl() {
        return envioMl;
    }

    public void setEnvioMl(String envioMl) {
        this.envioMl = envioMl;
    }

    public String getCategMl() {
        return categMl;
    }

    public void setCategMl(String categMl) {
        this.categMl = categMl;
    }

    public String getCamposCategMl() {
        return camposCategMl;
    }

    public void setCamposCategMl(String camposCategMl) {
        this.camposCategMl = camposCategMl;
    }

    public String getDisponiblePubl() {
        return disponiblePubl;
    }

    public void setDisponiblePubl(String disponiblePubl) {
        this.disponiblePubl = disponiblePubl;
    }

    public String getCveCateMl() {
        return cveCateMl;
    }

    public void setCveCateMl(String cveCateMl) {
        this.cveCateMl = cveCateMl;
    }

    public String getLastUpdateMl() {
        return lastUpdateMl;
    }

    public void setLastUpdateMl(String lastUpdateMl) {
        this.lastUpdateMl = lastUpdateMl;
    }

    public Date getFCreaMl() {
        return FCreaMl;
    }

    public void setFCreaMl(Date FCreaMl) {
        this.FCreaMl = FCreaMl;
    }

    public String getImagenMl() {
        return imagenMl;
    }

    public void setImagenMl(String imagenMl) {
        this.imagenMl = imagenMl;
    }

    public String getEnCatalogo() {
        return enCatalogo;
    }

    public void setEnCatalogo(String enCatalogo) {
        this.enCatalogo = enCatalogo;
    }

    public String getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(String idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getTituloMl() {
        return tituloMl;
    }

    public void setTituloMl(String tituloMl) {
        this.tituloMl = tituloMl;
    }

    public String getMatPeli() {
        return matPeli;
    }

    public void setMatPeli(String matPeli) {
        this.matPeli = matPeli;
    }

}
