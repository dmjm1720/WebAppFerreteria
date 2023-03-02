package com.dmjsistemas.sae.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CLIE01")
public class Clie01 implements java.io.Serializable {

    @Id
    @Column(name = "CLAVE", unique = true, nullable = false, length = 10)
    private String clave;

    @Column(name = "STATUS", nullable = false, length = 1)
    private String status;

    @Column(name = "NOMBRE", length = 254)
    private String nombre;

    @Column(name = "RFC", length = 15)
    private String rfc;

    @Column(name = "CALLE", length = 80)
    private String calle;

    @Column(name = "NUMINT", length = 15)
    private String numint;

    @Column(name = "NUMEXT", length = 15)
    private String numext;

    @Column(name = "CRUZAMIENTOS", length = 40)
    private String cruzamientos;

    @Column(name = "CRUZAMIENTOS2", length = 40)
    private String cruzamientos2;

    @Column(name = "COLONIA", length = 50)
    private String colonia;

    @Column(name = "CODIGO", length = 5)
    private String codigo;

    @Column(name = "LOCALIDAD", length = 50)
    private String localidad;

    @Column(name = "MUNICIPIO", length = 50)
    private String municipio;

    @Column(name = "ESTADO", length = 50)
    private String estado;

    @Column(name = "PAIS", length = 50)
    private String pais;

    @Column(name = "NACIONALIDAD", length = 40)
    private String nacionalidad;

    @Column(name = "REFERDIR")
    private String referdir;

    @Column(name = "TELEFONO", length = 25)
    private String telefono;

    @Column(name = "CLASIFIC", length = 5)
    private String clasific;

    @Column(name = "FAX", length = 25)
    private String fax;

    @Column(name = "PAG_WEB", length = 60)
    private String pagWeb;

    @Column(name = "CURP", length = 18)
    private String curp;

    @Column(name = "CVE_ZONA", length = 6)
    private String cveZona;

    @Column(name = "IMPRIR", length = 1)
    private String imprir;

    @Column(name = "MAIL", length = 1)
    private String mail;

    @Column(name = "NIVELSEC")
    private Integer nivelsec;

    @Column(name = "ENVIOSILEN", length = 1)
    private String enviosilen;

    @Column(name = "EMAILPRED", length = 60)
    private String emailpred;

    @Column(name = "DIAREV", length = 2)
    private String diarev;

    @Column(name = "DIAPAGO", length = 2)
    private String diapago;

    @Column(name = "CON_CREDITO", length = 1)
    private String conCredito;

    @Column(name = "DIASCRED")
    private Integer diascred;

    @Column(name = "LIMCRED", precision = 15, scale = 0)
    private Double limcred;

    @Column(name = "SALDO", precision = 15, scale = 0)
    private Double saldo;

    @Column(name = "LISTA_PREC")
    private Integer listaPrec;

    @Column(name = "CVE_BITA")
    private Integer cveBita;

    @Column(name = "ULT_PAGOD", length = 20)
    private String ultPagod;

    @Column(name = "ULT_PAGOM", precision = 15, scale = 0)
    private Double ultPagom;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ULT_PAGOF", length = 19)
    private Date ultPagof;

    @Column(name = "DESCUENTO", precision = 15, scale = 0)
    private Double descuento;

    @Column(name = "ULT_VENTAD", length = 20)
    private String ultVentad;

    @Column(name = "ULT_COMPM", precision = 15, scale = 0)
    private Double ultCompm;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCH_ULTCOM", length = 19)
    private Date fchUltcom;

    @Column(name = "VENTAS", precision = 15, scale = 0)
    private Double ventas;

    @Column(name = "CVE_VEND", length = 5)
    private String cveVend;

    @Column(name = "CVE_OBS")
    private Integer cveObs;

    @Column(name = "TIPO_EMPRESA", length = 1)
    private String tipoEmpresa;

    @Column(name = "MATRIZ", length = 10)
    private String matriz;

    @Column(name = "PROSPECTO", length = 1)
    private String prospecto;

    @Column(name = "CALLE_ENVIO", length = 80)
    private String calleEnvio;

    @Column(name = "NUMINT_ENVIO", length = 15)
    private String numintEnvio;

    @Column(name = "NUMEXT_ENVIO", length = 15)
    private String numextEnvio;

    @Column(name = "CRUZAMIENTOS_ENVIO", length = 40)
    private String cruzamientosEnvio;

    @Column(name = "CRUZAMIENTOS_ENVIO2", length = 40)
    private String cruzamientosEnvio2;

    @Column(name = "COLONIA_ENVIO", length = 50)
    private String coloniaEnvio;

    @Column(name = "LOCALIDAD_ENVIO", length = 50)
    private String localidadEnvio;

    @Column(name = "MUNICIPIO_ENVIO", length = 50)
    private String municipioEnvio;

    @Column(name = "ESTADO_ENVIO", length = 50)
    private String estadoEnvio;

    @Column(name = "PAIS_ENVIO", length = 50)
    private String paisEnvio;

    @Column(name = "CODIGO_ENVIO", length = 5)
    private String codigoEnvio;

    @Column(name = "CVE_ZONA_ENVIO", length = 6)
    private String cveZonaEnvio;

    @Column(name = "REFERENCIA_ENVIO")
    private String referenciaEnvio;

    @Column(name = "CUENTA_CONTABLE", length = 28)
    private String cuentaContable;

    @Column(name = "ADDENDAF")
    private String addendaf;

    @Column(name = "ADDENDAD")
    private String addendad;

    @Column(name = "NAMESPACE")
    private String namespace;

    @Column(name = "METODODEPAGO")
    private String metododepago;

    @Column(name = "NUMCTAPAGO")
    private String numctapago;

    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "DES_IMPU1", length = 1)
    private String desImpu1;

    @Column(name = "DES_IMPU2", length = 1)
    private String desImpu2;

    @Column(name = "DES_IMPU3", length = 1)
    private String desImpu3;

    @Column(name = "DES_IMPU4", length = 1)
    private String desImpu4;

    @Column(name = "DES_PER", length = 1)
    private String desPer;

    @Column(name = "LAT_GENERAL", precision = 15, scale = 0)
    private Double latGeneral;

    @Column(name = "LON_GENERAL", precision = 15, scale = 0)
    private Double lonGeneral;

    @Column(name = "LAT_ENVIO", precision = 15, scale = 0)
    private Double latEnvio;

    @Column(name = "LON_ENVIO", precision = 15, scale = 0)
    private Double lonEnvio;

    @Column(name = "UUID", length = 50)
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VERSION_SINC", length = 19)
    private Date versionSinc;

    @Column(name = "USO_CFDI", length = 5)
    private String usoCfdi;

    @Column(name = "CVE_PAIS_SAT", length = 5)
    private String cvePaisSat;

    @Column(name = "NUMIDREGFISCAL", length = 128)
    private String numidregfiscal;

    @Column(name = "FORMADEPAGOSAT", length = 5)
    private String formadepagosat;

    @Column(name = "ADDENDAG")
    private String addendag;

    @Column(name = "ADDENDAE")
    private String addendae;

    @Column(name = "ADDENDAT")
    private String addendat;

    @Column(name = "UBICACION_R", length = 0)
    private String ubicacionR;

    @Column(name = "REG_FISC", length = 4)
    private String regFisc;

    @Column(name = "VAL_RFC")
    private Integer valRfc;

    @Column(name = "NOMBRECOMERCIAL", length = 254)
    private String nombrecomercial;

    public Clie01() {
    }

    public Clie01(String clave, String status, String nombre, String rfc, String calle, String numint, String numext, String cruzamientos, String cruzamientos2, String colonia, String codigo, String localidad, String municipio, String estado, String pais, String nacionalidad, String referdir, String telefono, String clasific, String fax, String pagWeb, String curp, String cveZona, String imprir, String mail, Integer nivelsec, String enviosilen, String emailpred, String diarev, String diapago, String conCredito, Integer diascred, Double limcred, Double saldo, Integer listaPrec, Integer cveBita, String ultPagod, Double ultPagom, Date ultPagof, Double descuento, String ultVentad, Double ultCompm, Date fchUltcom, Double ventas, String cveVend, Integer cveObs, String tipoEmpresa, String matriz, String prospecto, String calleEnvio, String numintEnvio, String numextEnvio, String cruzamientosEnvio, String cruzamientosEnvio2, String coloniaEnvio, String localidadEnvio, String municipioEnvio, String estadoEnvio, String paisEnvio, String codigoEnvio, String cveZonaEnvio, String referenciaEnvio, String cuentaContable, String addendaf, String addendad, String namespace, String metododepago, String numctapago, String modelo, String desImpu1, String desImpu2, String desImpu3, String desImpu4, String desPer, Double latGeneral, Double lonGeneral, Double latEnvio, Double lonEnvio, String uuid, Date versionSinc, String usoCfdi, String cvePaisSat, String numidregfiscal, String formadepagosat, String addendag, String addendae, String addendat, String ubicacionR, String regFisc, Integer valRfc, String nombrecomercial) {
        this.clave = clave;
        this.status = status;
        this.nombre = nombre;
        this.rfc = rfc;
        this.calle = calle;
        this.numint = numint;
        this.numext = numext;
        this.cruzamientos = cruzamientos;
        this.cruzamientos2 = cruzamientos2;
        this.colonia = colonia;
        this.codigo = codigo;
        this.localidad = localidad;
        this.municipio = municipio;
        this.estado = estado;
        this.pais = pais;
        this.nacionalidad = nacionalidad;
        this.referdir = referdir;
        this.telefono = telefono;
        this.clasific = clasific;
        this.fax = fax;
        this.pagWeb = pagWeb;
        this.curp = curp;
        this.cveZona = cveZona;
        this.imprir = imprir;
        this.mail = mail;
        this.nivelsec = nivelsec;
        this.enviosilen = enviosilen;
        this.emailpred = emailpred;
        this.diarev = diarev;
        this.diapago = diapago;
        this.conCredito = conCredito;
        this.diascred = diascred;
        this.limcred = limcred;
        this.saldo = saldo;
        this.listaPrec = listaPrec;
        this.cveBita = cveBita;
        this.ultPagod = ultPagod;
        this.ultPagom = ultPagom;
        this.ultPagof = ultPagof;
        this.descuento = descuento;
        this.ultVentad = ultVentad;
        this.ultCompm = ultCompm;
        this.fchUltcom = fchUltcom;
        this.ventas = ventas;
        this.cveVend = cveVend;
        this.cveObs = cveObs;
        this.tipoEmpresa = tipoEmpresa;
        this.matriz = matriz;
        this.prospecto = prospecto;
        this.calleEnvio = calleEnvio;
        this.numintEnvio = numintEnvio;
        this.numextEnvio = numextEnvio;
        this.cruzamientosEnvio = cruzamientosEnvio;
        this.cruzamientosEnvio2 = cruzamientosEnvio2;
        this.coloniaEnvio = coloniaEnvio;
        this.localidadEnvio = localidadEnvio;
        this.municipioEnvio = municipioEnvio;
        this.estadoEnvio = estadoEnvio;
        this.paisEnvio = paisEnvio;
        this.codigoEnvio = codigoEnvio;
        this.cveZonaEnvio = cveZonaEnvio;
        this.referenciaEnvio = referenciaEnvio;
        this.cuentaContable = cuentaContable;
        this.addendaf = addendaf;
        this.addendad = addendad;
        this.namespace = namespace;
        this.metododepago = metododepago;
        this.numctapago = numctapago;
        this.modelo = modelo;
        this.desImpu1 = desImpu1;
        this.desImpu2 = desImpu2;
        this.desImpu3 = desImpu3;
        this.desImpu4 = desImpu4;
        this.desPer = desPer;
        this.latGeneral = latGeneral;
        this.lonGeneral = lonGeneral;
        this.latEnvio = latEnvio;
        this.lonEnvio = lonEnvio;
        this.uuid = uuid;
        this.versionSinc = versionSinc;
        this.usoCfdi = usoCfdi;
        this.cvePaisSat = cvePaisSat;
        this.numidregfiscal = numidregfiscal;
        this.formadepagosat = formadepagosat;
        this.addendag = addendag;
        this.addendae = addendae;
        this.addendat = addendat;
        this.ubicacionR = ubicacionR;
        this.regFisc = regFisc;
        this.valRfc = valRfc;
        this.nombrecomercial = nombrecomercial;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getReferdir() {
        return referdir;
    }

    public void setReferdir(String referdir) {
        this.referdir = referdir;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClasific() {
        return clasific;
    }

    public void setClasific(String clasific) {
        this.clasific = clasific;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCveZona() {
        return cveZona;
    }

    public void setCveZona(String cveZona) {
        this.cveZona = cveZona;
    }

    public String getImprir() {
        return imprir;
    }

    public void setImprir(String imprir) {
        this.imprir = imprir;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getNivelsec() {
        return nivelsec;
    }

    public void setNivelsec(Integer nivelsec) {
        this.nivelsec = nivelsec;
    }

    public String getEnviosilen() {
        return enviosilen;
    }

    public void setEnviosilen(String enviosilen) {
        this.enviosilen = enviosilen;
    }

    public String getEmailpred() {
        return emailpred;
    }

    public void setEmailpred(String emailpred) {
        this.emailpred = emailpred;
    }

    public String getDiarev() {
        return diarev;
    }

    public void setDiarev(String diarev) {
        this.diarev = diarev;
    }

    public String getDiapago() {
        return diapago;
    }

    public void setDiapago(String diapago) {
        this.diapago = diapago;
    }

    public String getConCredito() {
        return conCredito;
    }

    public void setConCredito(String conCredito) {
        this.conCredito = conCredito;
    }

    public Integer getDiascred() {
        return diascred;
    }

    public void setDiascred(Integer diascred) {
        this.diascred = diascred;
    }

    public Double getLimcred() {
        return limcred;
    }

    public void setLimcred(Double limcred) {
        this.limcred = limcred;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getListaPrec() {
        return listaPrec;
    }

    public void setListaPrec(Integer listaPrec) {
        this.listaPrec = listaPrec;
    }

    public Integer getCveBita() {
        return cveBita;
    }

    public void setCveBita(Integer cveBita) {
        this.cveBita = cveBita;
    }

    public String getUltPagod() {
        return ultPagod;
    }

    public void setUltPagod(String ultPagod) {
        this.ultPagod = ultPagod;
    }

    public Double getUltPagom() {
        return ultPagom;
    }

    public void setUltPagom(Double ultPagom) {
        this.ultPagom = ultPagom;
    }

    public Date getUltPagof() {
        return ultPagof;
    }

    public void setUltPagof(Date ultPagof) {
        this.ultPagof = ultPagof;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getUltVentad() {
        return ultVentad;
    }

    public void setUltVentad(String ultVentad) {
        this.ultVentad = ultVentad;
    }

    public Double getUltCompm() {
        return ultCompm;
    }

    public void setUltCompm(Double ultCompm) {
        this.ultCompm = ultCompm;
    }

    public Date getFchUltcom() {
        return fchUltcom;
    }

    public void setFchUltcom(Date fchUltcom) {
        this.fchUltcom = fchUltcom;
    }

    public Double getVentas() {
        return ventas;
    }

    public void setVentas(Double ventas) {
        this.ventas = ventas;
    }

    public String getCveVend() {
        return cveVend;
    }

    public void setCveVend(String cveVend) {
        this.cveVend = cveVend;
    }

    public Integer getCveObs() {
        return cveObs;
    }

    public void setCveObs(Integer cveObs) {
        this.cveObs = cveObs;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getMatriz() {
        return matriz;
    }

    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    public String getProspecto() {
        return prospecto;
    }

    public void setProspecto(String prospecto) {
        this.prospecto = prospecto;
    }

    public String getCalleEnvio() {
        return calleEnvio;
    }

    public void setCalleEnvio(String calleEnvio) {
        this.calleEnvio = calleEnvio;
    }

    public String getNumintEnvio() {
        return numintEnvio;
    }

    public void setNumintEnvio(String numintEnvio) {
        this.numintEnvio = numintEnvio;
    }

    public String getNumextEnvio() {
        return numextEnvio;
    }

    public void setNumextEnvio(String numextEnvio) {
        this.numextEnvio = numextEnvio;
    }

    public String getCruzamientosEnvio() {
        return cruzamientosEnvio;
    }

    public void setCruzamientosEnvio(String cruzamientosEnvio) {
        this.cruzamientosEnvio = cruzamientosEnvio;
    }

    public String getCruzamientosEnvio2() {
        return cruzamientosEnvio2;
    }

    public void setCruzamientosEnvio2(String cruzamientosEnvio2) {
        this.cruzamientosEnvio2 = cruzamientosEnvio2;
    }

    public String getColoniaEnvio() {
        return coloniaEnvio;
    }

    public void setColoniaEnvio(String coloniaEnvio) {
        this.coloniaEnvio = coloniaEnvio;
    }

    public String getLocalidadEnvio() {
        return localidadEnvio;
    }

    public void setLocalidadEnvio(String localidadEnvio) {
        this.localidadEnvio = localidadEnvio;
    }

    public String getMunicipioEnvio() {
        return municipioEnvio;
    }

    public void setMunicipioEnvio(String municipioEnvio) {
        this.municipioEnvio = municipioEnvio;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getPaisEnvio() {
        return paisEnvio;
    }

    public void setPaisEnvio(String paisEnvio) {
        this.paisEnvio = paisEnvio;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getCveZonaEnvio() {
        return cveZonaEnvio;
    }

    public void setCveZonaEnvio(String cveZonaEnvio) {
        this.cveZonaEnvio = cveZonaEnvio;
    }

    public String getReferenciaEnvio() {
        return referenciaEnvio;
    }

    public void setReferenciaEnvio(String referenciaEnvio) {
        this.referenciaEnvio = referenciaEnvio;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public String getAddendaf() {
        return addendaf;
    }

    public void setAddendaf(String addendaf) {
        this.addendaf = addendaf;
    }

    public String getAddendad() {
        return addendad;
    }

    public void setAddendad(String addendad) {
        this.addendad = addendad;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDesImpu1() {
        return desImpu1;
    }

    public void setDesImpu1(String desImpu1) {
        this.desImpu1 = desImpu1;
    }

    public String getDesImpu2() {
        return desImpu2;
    }

    public void setDesImpu2(String desImpu2) {
        this.desImpu2 = desImpu2;
    }

    public String getDesImpu3() {
        return desImpu3;
    }

    public void setDesImpu3(String desImpu3) {
        this.desImpu3 = desImpu3;
    }

    public String getDesImpu4() {
        return desImpu4;
    }

    public void setDesImpu4(String desImpu4) {
        this.desImpu4 = desImpu4;
    }

    public String getDesPer() {
        return desPer;
    }

    public void setDesPer(String desPer) {
        this.desPer = desPer;
    }

    public Double getLatGeneral() {
        return latGeneral;
    }

    public void setLatGeneral(Double latGeneral) {
        this.latGeneral = latGeneral;
    }

    public Double getLonGeneral() {
        return lonGeneral;
    }

    public void setLonGeneral(Double lonGeneral) {
        this.lonGeneral = lonGeneral;
    }

    public Double getLatEnvio() {
        return latEnvio;
    }

    public void setLatEnvio(Double latEnvio) {
        this.latEnvio = latEnvio;
    }

    public Double getLonEnvio() {
        return lonEnvio;
    }

    public void setLonEnvio(Double lonEnvio) {
        this.lonEnvio = lonEnvio;
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

    public String getUsoCfdi() {
        return usoCfdi;
    }

    public void setUsoCfdi(String usoCfdi) {
        this.usoCfdi = usoCfdi;
    }

    public String getCvePaisSat() {
        return cvePaisSat;
    }

    public void setCvePaisSat(String cvePaisSat) {
        this.cvePaisSat = cvePaisSat;
    }

    public String getNumidregfiscal() {
        return numidregfiscal;
    }

    public void setNumidregfiscal(String numidregfiscal) {
        this.numidregfiscal = numidregfiscal;
    }

    public String getFormadepagosat() {
        return formadepagosat;
    }

    public void setFormadepagosat(String formadepagosat) {
        this.formadepagosat = formadepagosat;
    }

    public String getAddendag() {
        return addendag;
    }

    public void setAddendag(String addendag) {
        this.addendag = addendag;
    }

    public String getAddendae() {
        return addendae;
    }

    public void setAddendae(String addendae) {
        this.addendae = addendae;
    }

    public String getAddendat() {
        return addendat;
    }

    public void setAddendat(String addendat) {
        this.addendat = addendat;
    }

    public String getUbicacionR() {
        return ubicacionR;
    }

    public void setUbicacionR(String ubicacionR) {
        this.ubicacionR = ubicacionR;
    }

    public String getRegFisc() {
        return regFisc;
    }

    public void setRegFisc(String regFisc) {
        this.regFisc = regFisc;
    }

    public Integer getValRfc() {
        return valRfc;
    }

    public void setValRfc(Integer valRfc) {
        this.valRfc = valRfc;
    }

    public String getNombrecomercial() {
        return nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

}
