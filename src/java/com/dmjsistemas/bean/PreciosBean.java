package com.dmjsistemas.bean;

import com.dmjsistemas.dao.ISaeDao;
import com.dmjsistemas.impl.SaeDaoImpl;
import com.dmjsistemas.sae.model.Clie01;
import com.dmjsistemas.sae.model.Factc01;
import com.dmjsistemas.sae.model.FactcClib01;
import com.dmjsistemas.sae.model.Infenvio01;
import com.dmjsistemas.sae.model.Inve01;
import com.dmjsistemas.sae.model.ObsDocf01;
import com.dmjsistemas.sae.model.ParFactc01;
import com.dmjsistemas.sae.model.ParFactcClib01;
import com.dmjsistemas.sae.model.Partidas;
import com.dmjsistemas.util.Conexion;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.PrimeFaces;

@Named(value = "precios")
@ViewScoped
public class PreciosBean extends Conexion implements Serializable {

    private List<Clie01> listarClie;
    private List<Factc01> listarFactc;
    private List<ParFactc01> listarParFactc;
    private List<FactcClib01> listarFactcClib;
    private List<Partidas> listarPartidas;
    private List<ParFactcClib01> listarPartidasClib;
    private Clie01 clie01;
    private Factc01 factc01;
    private ParFactc01 parFactc01;
    private FactcClib01 factcClib01;
    private String cveDoc;
    private List<Inve01> listarinve01;
    private Double porcentajeDescuento = 0.0;
    private Double cantidadTotal;
    private Double impuestoTotal;
    private Double descuentoTotal;
    private Double ct = 0.0;
    private Double it = 0.0;
    private Double dt = 0.0;
    private Double imp = 0.0;
    private Double ct2 = 0.0;
    private Double it2 = 0.0;
    private Double dt2 = 0.0;
    private Double imp2 = 0.0;
    private ParFactcClib01 parFactcClib01;
    private int folioObsDocf01;
    private int folioObsDocf01Ante;
    private List<ObsDocf01> listaObsDoc;
    private ObsDocf01 od;
    private int datEnv;
    private int datEnvAnt;
    private Infenvio01 i;
    private int cveObsValida;

    public PreciosBean() {
    }

    @PostConstruct
    public void init() {
        listarClie = new ArrayList<>();
        listarFactc = new ArrayList<>();
        listarParFactc = new ArrayList<>();
        clie01 = new Clie01();
        factc01 = new Factc01();
        factcClib01 = new FactcClib01();
        parFactc01 = new ParFactc01();
        listarinve01 = new ArrayList<>();
        listarPartidas = new ArrayList<>();
        listarFactcClib = new ArrayList<>();
        listarPartidasClib = new ArrayList<>();
        listaObsDoc = new ArrayList<>();
        parFactcClib01 = new ParFactcClib01();
        od = new ObsDocf01();
        i = new Infenvio01();

    }

    public String getCveDoc() {
        return cveDoc;
    }

    public void setCveDoc(String cveDoc) {
        this.cveDoc = cveDoc;
    }

    public List<Clie01> getListarClie() {
        return listarClie;
    }

    public List<Factc01> getListarFactc() {
        return listarFactc;
    }

    public List<ParFactc01> getListarParFactc() {
        return listarParFactc;
    }

    public void setListarParFactc(List<ParFactc01> listarParFactc) {
        this.listarParFactc = listarParFactc;
    }

    public Clie01 getClie01() {
        return clie01;
    }

    public void setClie01(Clie01 clie01) {
        this.clie01 = clie01;
    }

    public Factc01 getFactc01() {
        return factc01;
    }

    public void setFactc01(Factc01 factc01) {
        this.factc01 = factc01;
    }

    public ParFactc01 getParFactc01() {
        return parFactc01;
    }

    public void setParFactc01(ParFactc01 parFactc01) {
        this.parFactc01 = parFactc01;
    }

    public List<Inve01> getLitsarinve01() {
        return listarinve01;
    }

    public List<Partidas> getListarPartidas() {
        return listarPartidas;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Double getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Double cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public Double getImpuestoTotal() {
        return impuestoTotal;
    }

    public void setImpuestoTotal(Double impuestoTotal) {
        this.impuestoTotal = impuestoTotal;
    }

    public Double getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(Double descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public Double getCt() {
        return ct;
    }

    public void setCt(Double ct) {
        this.ct = ct;
    }

    public Double getIt() {
        return it;
    }

    public void setIt(Double it) {
        this.it = it;
    }

    public Double getDt() {
        return dt;
    }

    public void setDt(Double dt) {
        this.dt = dt;
    }

    public Double getImp() {
        return imp;
    }

    public void setImp(Double imp) {
        this.imp = imp;
    }

    public List<FactcClib01> getListarFactcClib() {
        return listarFactcClib;
    }

    public void setListarFactcClib(List<FactcClib01> listarFactcClib) {
        this.listarFactcClib = listarFactcClib;
    }

    public FactcClib01 getFactcClib01() {
        return factcClib01;
    }

    public void setFactcClib01(FactcClib01 factcClib01) {
        this.factcClib01 = factcClib01;
    }

    public List<ParFactcClib01> getListarPartidasClib() {
        return listarPartidasClib;
    }

    public void setListarPartidasClib(List<ParFactcClib01> listarPartidasClib) {
        this.listarPartidasClib = listarPartidasClib;
    }

    public ParFactcClib01 getParFactcClib01() {
        return parFactcClib01;
    }

    public void setParFactcClib01(ParFactcClib01 parFactcClib01) {
        this.parFactcClib01 = parFactcClib01;
    }

    public int getFolioObsDocf01() {
        return folioObsDocf01;
    }

    public void setFolioObsDocf01(int folioObsDocf01) {
        this.folioObsDocf01 = folioObsDocf01;
    }

    public List<ObsDocf01> getListaObsDoc() {
        return listaObsDoc;
    }

    public void setListaObsDoc(List<ObsDocf01> listaObsDoc) {
        this.listaObsDoc = listaObsDoc;
    }

    public int getFolioObsDocf01Ante() {
        return folioObsDocf01Ante;
    }

    public void setFolioObsDocf01Ante(int folioObsDocf01Ante) {
        this.folioObsDocf01Ante = folioObsDocf01Ante;
    }

    public ObsDocf01 getOd() {
        return od;
    }

    public void setOd(ObsDocf01 od) {
        this.od = od;
    }

    public int getDatEnv() {
        return datEnv;
    }

    public void setDatEnv(int datEnv) {
        this.datEnv = datEnv;
    }

    public int getDatEnvAnt() {
        return datEnvAnt;
    }

    public void setDatEnvAnt(int datEnvAnt) {
        this.datEnvAnt = datEnvAnt;
    }

    public Infenvio01 getI() {
        return i;
    }

    public void setI(Infenvio01 i) {
        this.i = i;
    }

    public Double getCt2() {
        return ct2;
    }

    public void setCt2(Double ct2) {
        this.ct2 = ct2;
    }

    public Double getIt2() {
        return it2;
    }

    public void setIt2(Double it2) {
        this.it2 = it2;
    }

    public Double getDt2() {
        return dt2;
    }

    public void setDt2(Double dt2) {
        this.dt2 = dt2;
    }

    public Double getImp2() {
        return imp2;
    }

    public void setImp2(Double imp2) {
        this.imp2 = imp2;
    }

    //**BUSCAR EL ENCABEZADO DE LA COTIZACIÓN**//
    public void buscarCotizacion() {
        ISaeDao lDao = new SaeDaoImpl();
        listarFactc = null;
        listarFactc = lDao.listaFactc01(cveDoc);
        String numeroClie = null;
        for (Factc01 factc : listarFactc) {
            numeroClie = factc.getCveClpv();
            ct2 = factc.getCanTot();
            it2 = factc.getImpTot4();
            dt2 = factc.getDesTot();
            imp2 = factc.getImporte();
        }
        getListarFactc();
        listarClie = null;
        ISaeDao cDao = new SaeDaoImpl();
        listarClie = cDao.listaClie01(numeroClie);
        getListarClie();
        listaDePartidasCot(cveDoc);
        getListarPartidas();

    }

    //**BUSCAR EL ENCABEZADO DE LA COTIZACIÓN SIMULADOR**//
    public void buscarCotizacionSimulador() {
        ISaeDao lDao = new SaeDaoImpl();
        listarFactc = null;
        listarFactc = lDao.listaFactc01(cveDoc);

        String numeroClie = null;
        for (Factc01 factc : listarFactc) {
            numeroClie = factc.getCveClpv();
        }
        //getListarFactc();
        listarClie = null;
        ISaeDao cDao = new SaeDaoImpl();
        listarClie = cDao.listaClie01(numeroClie);
        getListarClie();
        listaDePartidasCotSimulador(cveDoc, porcentajeDescuento);
        getListarPartidas();

    }

    public String descripcion(String cveArt) {
        String descrip = null;
        ISaeDao dDao = new SaeDaoImpl();
        listarinve01 = dDao.listaInve01(cveArt);
        for (Inve01 in : listarinve01) {
            descrip = in.getDescr();
        }
        return descrip;
    }
//**LISTAR PARTIDAS DE LA COTIZACIÓN**//

    public List<Partidas> listaDePartidasCot(String cveDocumento) {
        listarPartidas.clear();
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT pf.NUM_PAR, pf.CVE_ART, i.DESCR, pf.CANT, pf.UNI_VENTA, pf.PREC, pf.TOT_PARTIDA, pf.TOTIMP4, pf.DESC1, pf.DESC2, pf.DESC3, pf.IMPU4 "
                    + "FROM PAR_FACTC01 pf "
                    + "INNER JOIN INVE01 i "
                    + "ON pf.CVE_ART = i.CVE_ART WHERE pf.CVE_DOC = '" + cveDocumento + "'";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                PrimeFaces.current().executeScript("Swal.fire({\n"
                        + "  position: 'top-center',\n"
                        + "  icon: 'error',\n"
                        + "  title: '¡Algo salió mal!',\n"
                        + "  text: 'No encuentro tu cotización, verífica tu información e intenta nuevamente',\n"
                        + "  showConfirmButton: true,\n"
                        + "})");
            } else {
                while (rs.next()) {
                    Partidas p = new Partidas();
                    p.setPartida(rs.getInt("NUM_PAR"));
                    p.setClave(rs.getString("CVE_ART"));
                    p.setDescripcion(rs.getString("DESCR"));
                    p.setCantidad(rs.getDouble("CANT"));
                    p.setUnidadMedida(rs.getString("UNI_VENTA"));
                    p.setPrecio(rs.getDouble("PREC"));
                    p.setImporte(rs.getDouble("TOT_PARTIDA"));
                    p.setIva(rs.getDouble("TOTIMP4"));
                    listarPartidas.add(p);
                }
            }
            Cerrar();
        } catch (SQLException e) {
        }
        return listarPartidas;
    }
//**LISTAR PARTIDAS DE LA COTIZACIÓN**//

    public List<Partidas> listaDePartidasCotSimulador(String cveDocumento, Double descuento) {
        listarPartidas.clear();
        ct2 = 0.0;
        it2 = 0.0;
        dt2 = 0.0;
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT pf.NUM_PAR, pf.CVE_ART, i.DESCR, pf.CANT, pf.UNI_VENTA, pf.PREC, pf.TOT_PARTIDA, pf.TOTIMP4, pf.DESC1, pf.DESC2, pf.DESC3, pf.IMPU4 "
                    + "FROM PAR_FACTC01 pf "
                    + "INNER JOIN INVE01 i "
                    + "ON pf.CVE_ART = i.CVE_ART WHERE pf.CVE_DOC = '" + cveDocumento + "'";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                PrimeFaces.current().executeScript("Swal.fire({\n"
                        + "  position: 'top-center',\n"
                        + "  icon: 'error',\n"
                        + "  title: '¡Algo salió mal!',\n"
                        + "  text: 'No encuentro tu cotización, verífica tu información e intenta nuevamente',\n"
                        + "  showConfirmButton: true,\n"
                        + "})");
            } else {
                while (rs.next()) {
                    Partidas p = new Partidas();
                    p.setPartida(rs.getInt("NUM_PAR"));
                    p.setClave(rs.getString("CVE_ART"));
                    p.setDescripcion(rs.getString("DESCR"));
                    p.setCantidad(rs.getDouble("CANT"));
                    p.setUnidadMedida(rs.getString("UNI_VENTA"));
                    p.setPrecio(rs.getDouble("PREC") + (rs.getDouble("PREC") * (descuento / 100)));
                    p.setImporte(rs.getDouble("CANT") * (rs.getDouble("PREC") + (rs.getDouble("PREC") * (descuento / 100))));
                    p.setIva(((rs.getDouble("CANT") * (rs.getDouble("PREC") + (rs.getDouble("PREC") * (descuento / 100)))) - ((rs.getDouble("DESC1") + rs.getDouble("DESC2") + rs.getDouble("DESC3")) / 100)) * (rs.getDouble("IMPU4") / 100));
                    ct2 += p.getImporte();
                    it2 += p.getIva();
                    listarPartidas.add(p);
                }
            }
            Cerrar();
            imp2 = ct2 + it2;
        } catch (SQLException e) {
        }
        return listarPartidas;
    }

    public void actualizar(String nuevoDocumento, String oldDocu) {
        listarPartidas.forEach((item) -> {

            Optional<Double> validarDescuento = Optional.ofNullable(porcentajeDescuento);
            porcentajeDescuento = validarDescuento.orElse(0.0);
            if (porcentajeDescuento != 0.0) {
                actualizarPrecioPartidas(nuevoDocumento, (porcentajeDescuento / 100), item.getPartida(), item.getClave());
            }

        });
        if (porcentajeDescuento != 0.0) {
            actualizarPrecioEncabezado(nuevoDocumento);
        }

//        if (porcentajeDescuento.equals(100.0)) {
//            porcentajeDescuento = 0.0;
//        }
        String info = "Se ha enviado la cotización número: " + oldDocu + "  a la cotización nueva con número: " + nuevoDocumento + " con el porcentaje: " + porcentajeDescuento + "";
        PrimeFaces.current().executeScript("Swal.fire({\n"
                + "  position: 'top-center',\n"
                + "  icon: 'success',\n"
                + "  title: '¡Aviso!',\n"
                + "  text: '" + info + "',\n"
                + "  showConfirmButton: false,\n"
                + "  timer: 8000\n"
                + "})");
    }

    public void actualizarPrecioPartidas(String cve, Double descuento, int partida, String art) {
        try {
            Conectar();
            String sql = "UPDATE "
                    + "PAR_FACTC01 "
                    + "SET "
                    + "PREC = PREC + (PREC * " + descuento + "), "
                    + "TOT_PARTIDA = CANT * (PREC + (PREC * " + descuento + ")), "
                    + "TOTIMP4 = (CANT * (PREC + (PREC * " + descuento + ")) - ((DESC1 + DESC2 + DESC3)/100))*(IMPU4 / 100) WHERE NUM_PAR = '" + partida + "' "
                    + "AND CVE_DOC = '" + cve + "' "
                    + "AND CVE_ART = '" + art + "'";
            PreparedStatement ps = getCn().prepareStatement(sql);
            ps.executeUpdate();
            Cerrar();
        } catch (SQLException e) {
            System.err.println(e.getSQLState() + "" + e.getMessage());
        }
    }

    public void actualizarPrecioEncabezado(String cveDocumento) {
        try {
            ct = 0.0;
            it = 0.0;
            dt = 0.0;
            Conectar();
            String sql = "SELECT SUM(TOT_PARTIDA) AS CANTIDAD_TOTAL, SUM(TOTIMP4) AS IMPUESTO_TOTAL4, ((SUM(DESC1) + SUM(DESC2) + SUM (DESC3))/ 100) * TOT_PARTIDA AS DESCUENTO_TOTAL FROM PAR_FACTC01 WHERE CVE_DOC = '" + cveDocumento + "' GROUP BY TOT_PARTIDA";
            Statement st = getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    cantidadTotal = rs.getDouble("CANTIDAD_TOTAL");
                    ct += cantidadTotal;
                    impuestoTotal = rs.getDouble("IMPUESTO_TOTAL4");
                    it += impuestoTotal;
                    descuentoTotal = rs.getDouble("DESCUENTO_TOTAL");
                    dt += descuentoTotal;
                }
            }
            imp = 0.0;
            imp = ct + it + dt;
            String sqlActualizar = "UPDATE FACTC01 SET CAN_TOT=" + ct + ", DES_TOT=" + dt + ", IMP_TOT4=" + it + ", IMPORTE=" + imp + " WHERE CVE_DOC='" + cveDocumento + "'";
            PreparedStatement ps = getCn().prepareStatement(sqlActualizar);
            ps.executeUpdate();
            Cerrar();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void clonarCotización(String docu) {

        ISaeDao folioDao = new SaeDaoImpl();
        int ultFolio = folioDao.folioF01();
        ISaeDao listaFactcDao = new SaeDaoImpl();
        ISaeDao guardarFactcDao = new SaeDaoImpl();
        //**FACTC01**//
        listarFactc.clear();
        listarFactc = listaFactcDao.listaFactc01(docu);
        listarFactc.stream().map((l) -> {
            factc01 = new Factc01();
            return l;
        }).forEachOrdered((l) -> {
            factc01.setTipDoc(l.getTipDoc());
            factc01.setCveDoc("C-" + ultFolio);
            factc01.setCveClpv(l.getCveClpv());
            factc01.setStatus(l.getStatus());
            factc01.setCvePedi("");
            factc01.setFechaDoc(l.getFechaDoc());
            factc01.setFechaEnt(l.getFechaEnt());
            factc01.setFechaVen(l.getFechaVen());
            factc01.setImpTot1(l.getImpTot1());
            factc01.setImpTot2(l.getImpTot2());
            factc01.setImpTot3(l.getImpTot3());
            factc01.setImpTot4(l.getImpTot4());
            factc01.setDesFin(l.getDesFin());
            factc01.setComTot(l.getComTot());
            factc01.setNumMoned(l.getNumMoned());
            factc01.setTipcamb(l.getTipcamb());
            factc01.setPrimerpago(l.getPrimerpago());
            factc01.setRfc(l.getRfc());
            factc01.setAutoriza(l.getAutoriza());
            factc01.setFolio(ultFolio);
            factc01.setSerie(l.getSerie());
            factc01.setAutoanio("");
            factc01.setEscfd(l.getEscfd());
            factc01.setNumAlma(l.getNumAlma());
            factc01.setActCxc(l.getActCxc());
            factc01.setActCoi(l.getActCoi());
            factc01.setCanTot(l.getCanTot());
            factc01.setCveVend("");
            //factc01.setFechaCancela("");
            factc01.setDesTot(l.getDesTot());
            factc01.setCondicion(l.getCondicion());
            factc01.setNumPagos(l.getNumPagos());
            datEnvAnt = l.getDatEnvio();

            factc01.setContado(l.getContado());
            factc01.setDatMostr(l.getDatMostr());
            factc01.setCveBita(l.getCveBita());
            factc01.setBloq(l.getBloq());
            factc01.setFechaelab(l.getFechaelab());
            factc01.setCtlpol(l.getCtlpol());
            //**""OBS_DOCF01""**//
            //BUSCAR CVE_OBS Y GUARDAR DATO
            folioObsDocf01 = folObsDoc();

            if (!l.getCveObs().equals(0)) {
                buscarDatosPartidaCveObs(l.getCveObs(), folioObsDocf01);
                factc01.setCveObs(folioObsDocf01);

            } else {
                factc01.setCveObs(0);
            }
            folioObsDocf01Ante = l.getCveObs();
            int dE = nuevoCveInfo();
            // factc01.setDatEnvio(datEnv);///
            if (!l.getDatEnvio().equals(0)) {
                factc01.setDatEnvio(l.getDatEnvio());
                actualizarInfEnvio(ultFolio, folioObsDocf01, dE);
                factc01.setDatEnvio(dE);
            } else {
                factc01.setDatEnvio(0);
            }

            //**""OBS_DOCF01""**//
            factc01.setEnlazado(l.getEnlazado());
            factc01.setTipDocE(l.getTipDocE());
            factc01.setFormaenvio(l.getFormaenvio());
            factc01.setDesFinPorc(l.getDesFinPorc());
            factc01.setDesTotPorc(l.getDesTotPorc());
            factc01.setImporte(l.getImporte());
            factc01.setComTotPorc(l.getComTotPorc());
            factc01.setMetododepago("");
            factc01.setNumctapago("");
            factc01.setTipDocAnt("");
            factc01.setDocAnt("");
            factc01.setTipDocSig("");
            factc01.setUuid("");
            factc01.setVersionSinc(l.getVersionSinc());
            factc01.setFormadepagosat("");
            factc01.setUsoCfdi(l.getUsoCfdi());
            //factc01.setNumAlmDes();
            factc01.setTipTraslado("");
            guardarFactcDao.guardarFactc01(factc01);//**GUARDAR EL ENCABEZADO FACTC01**//
        });
        //**FACTC01**//

        //**FACTC_CLIB01**//
        ISaeDao fclibDao = new SaeDaoImpl();
        ISaeDao guardarFactcClib01Dao = new SaeDaoImpl();
        listarFactcClib.clear();
        listarFactcClib = fclibDao.listaFactcClib01(docu);
        listarFactcClib.stream().map((l) -> {
            factcClib01 = new FactcClib01();
            return l;
        }).forEachOrdered((l) -> {
            factcClib01.setClaveDoc("C-" + ultFolio);
            factcClib01.setCamplib1(l.getCamplib1());
            factcClib01.setCamplib2(l.getCamplib2());
            factcClib01.setCamplib3(l.getCamplib3());
            guardarFactcClib01Dao.guardarFactcClib01(factcClib01);//**GUARDAR EL ENCABEZADO FACTC_CLIB01**//
        });
        //**FACTC_CLIB01**//

        //**PAR_FACTC01**//
        ISaeDao partidas = new SaeDaoImpl();
        String list = partidas.listaPartidas(docu).toString().replace("[", "").replace("]", "");
        String[] items = list.split(",");

        for (int i = 0; i < items.length; i++) {
            ISaeDao partidasDao = new SaeDaoImpl();
            ISaeDao guardarPartidasDao = new SaeDaoImpl();
            listarParFactc.clear();
            listarParFactc = partidasDao.listaParFactc01(docu, items[i]);
            listarParFactc.stream().map((l) -> {
                parFactc01 = new ParFactc01();
                return l;
            }).forEachOrdered((l) -> {
                parFactc01.setCveDoc("C-" + ultFolio);
                parFactc01.setNumPar(l.getNumPar());
                parFactc01.setCveArt(l.getCveArt());
                parFactc01.setCant(l.getCant());
                parFactc01.setPxs(l.getPxs());
                parFactc01.setPrec(l.getPrec());
                parFactc01.setCost(l.getCost());
                parFactc01.setImpu1(l.getImpu1());
                parFactc01.setImpu2(l.getImpu2());
                parFactc01.setImpu3(l.getImpu3());
                parFactc01.setImpu4(l.getImpu4());
                parFactc01.setImp1apla(l.getImp1apla());
                parFactc01.setImp2apla(l.getImp2apla());
                parFactc01.setImp3apla(l.getImp3apla());
                parFactc01.setImp4apla(l.getImp4apla());
                parFactc01.setTotimp1(l.getTotimp1());
                parFactc01.setTotimp2(l.getTotimp2());
                parFactc01.setTotimp3(l.getTotimp3());
                parFactc01.setTotimp4(l.getTotimp4());
                parFactc01.setDesc1(l.getDesc1());
                parFactc01.setDesc2(l.getDesc2());
                parFactc01.setDesc3(l.getDesc3());
                parFactc01.setComi(l.getComi());
                parFactc01.setApar(l.getApar());
                parFactc01.setActInv(l.getActInv());
                parFactc01.setNumAlm(l.getNumAlm());
                parFactc01.setPolitApli("");
                parFactc01.setTipCam(l.getTipCam());
                parFactc01.setUniVenta(l.getUniVenta());
                parFactc01.setTipoProd(l.getTipoProd());
                //BUSCAR CVE_OBS Y GUARDAR DATO
                int dato_folio = folObsDoc();
                if (!l.getCveObs().equals(0)) {
                    buscarDatosPartidaCveObs(l.getCveObs(), dato_folio);
                    parFactc01.setCveObs(dato_folio);
                } else {
                    parFactc01.setCveObs(0);
                }
                //**FOLIO OBS**//
                parFactc01.setRegSerie(l.getRegSerie());
                parFactc01.setELtpd(l.getELtpd());
                parFactc01.setTipoElem(l.getTipoElem());
                parFactc01.setNumMov(l.getNumMov());
                parFactc01.setTotPartida(l.getTotPartida());
                parFactc01.setImprimir(l.getImprimir());
                parFactc01.setManIeps(l.getManIeps());
                parFactc01.setCuotaIeps(l.getCuotaIeps());
                parFactc01.setAplManImp(l.getAplManImp());
                parFactc01.setMtoPorc(l.getMtoPorc());
                parFactc01.setMtoCuota(l.getMtoCuota());
                parFactc01.setCveEsq(l.getCveEsq());
                parFactc01.setDescrArt("");
                parFactc01.setUuid(l.getUuid());
                parFactc01.setVersionSinc(l.getVersionSinc());
                //parFactc01.setPrecNeto("");
                //parFactc01.setIdRelacion(l.getIdRelacion());
                //parFactc01.setCveProdserv("");
                //parFactc01.setCveUnidad("");
                guardarPartidasDao.guardarParFactc01(parFactc01);

            });

        }
        //**PAR_FACTC01**//

        //**"PAR_FACTC_CLIB01"**//
        partidasClib(cveDoc, ultFolio);
        maxObsPartidas(ultFolio);
        maxObsEncabezados(ultFolio);
        //**"PAR_FACTC_CLIB01"**//

        //***FOLIOSF01**//
        actualizarFolio(ultFolio);
        //***FOLIOSF01**//
        //**ACTUALIZAR LOS PRECIOS CON EL PORCENTAJE**//
        actualizar("C-" + ultFolio, docu);
        //**ACTUALIZAR LOS PRECIOS CON EL PORCENTAJE**//

    }

    public void actualizarInfEnvio(int uFolio, int cve, int info) {
        //**"INFENVIO01"**//
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT CVE_INFO, CVE_CONS, NOMBRE, CALLE, NUMINT, NUMEXT, CRUZAMIENTOS, CRUZAMIENTOS2, POB, CURP, REFERDIR, CVE_ZONA, CVE_OBS, STRNOGUIA, STRMODOENV, FECHA_ENV, NOMBRE_RECEP, NO_RECEP, FECHA_RECEP, COLONIA, CODIGO, ESTADO, PAIS, MUNICIPIO, PAQUETERIA, CVE_PED_TIEND, F_ENTREGA, R_FACTURA, R_EVIDENCIA, ID_GUIA, FAC_ENV, GUIA_ENV, REG_FISC, CVE_PAIS_SAT, FEEDDOCUMENT_GUIA FROM INFENVIO01 WHERE CVE_INFO='" + datEnvAnt + "'";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {

            } else {
                while (rs.next()) {
                    String sinInfo = "0";
                    i = new Infenvio01();
                    try {
                        Optional<String> CVE_CONS = Optional.ofNullable(rs.getString("CVE_CONS"));
                        i.setCveCons(CVE_CONS.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> NOMBRE = Optional.ofNullable(rs.getString("NOMBRE"));
                        i.setNombre(NOMBRE.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> CALLE = Optional.ofNullable(rs.getString("CALLE"));
                        i.setCalle(CALLE.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> NUMINT = Optional.ofNullable(rs.getString("NUMINT"));
                        i.setNumint(NUMINT.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> NUMEXT = Optional.ofNullable(rs.getString("NUMEXT"));
                        i.setNumext(NUMEXT.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> CRUZAMIENTOS = Optional.ofNullable(rs.getString("CRUZAMIENTOS"));
                        i.setCruzamientos(CRUZAMIENTOS.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> CRUZAMIENTOS2 = Optional.ofNullable(rs.getString("CRUZAMIENTOS2"));
                        i.setCruzamientos2(CRUZAMIENTOS2.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> POB = Optional.ofNullable(rs.getString("POB"));
                        i.setPob(POB.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> CURP = Optional.ofNullable(rs.getString("CURP"));
                        i.setCurp(CURP.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> REFERDIR = Optional.ofNullable(rs.getString("REFERDIR"));
                        i.setReferdir(REFERDIR.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> CVE_ZONA = Optional.ofNullable(rs.getString("CVE_ZONA"));
                        i.setCveZona(CVE_ZONA.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> STRNOGUIA = Optional.ofNullable(rs.getString("STRNOGUIA"));
                        i.setStrnoguia(STRNOGUIA.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> STRMODOENV = Optional.ofNullable(rs.getString("STRMODOENV"));
                        i.setStrmodoenv(STRMODOENV.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> FECHA_ENV = Optional.ofNullable(rs.getString("FECHA_ENV"));
                        i.setFechaEnv(FECHA_ENV.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> NOMBRE_RECEP = Optional.ofNullable(rs.getString("NOMBRE_RECEP"));
                        i.setNombreRecep(NOMBRE_RECEP.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> NO_RECEP = Optional.ofNullable(rs.getString("NO_RECEP"));
                        i.setNoRecep(NO_RECEP.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> FECHA_RECEP = Optional.ofNullable(rs.getString("FECHA_RECEP"));
                        i.setFechaRecep(FECHA_RECEP.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> COLONIA = Optional.ofNullable(rs.getString("COLONIA"));
                        i.setColonia(COLONIA.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> CODIGO = Optional.ofNullable(rs.getString("CODIGO"));
                        i.setCodigo(CODIGO.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> ESTADO = Optional.ofNullable(rs.getString("ESTADO"));
                        i.setEstado(ESTADO.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> PAIS = Optional.ofNullable(rs.getString("PAIS"));
                        i.setPais(PAIS.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> MUNICIPIO = Optional.ofNullable(rs.getString("MUNICIPIO"));
                        i.setMunicipio(MUNICIPIO.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> PAQUETERIA = Optional.ofNullable(rs.getString("PAQUETERIA"));
                        i.setPaqueteria(PAQUETERIA.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> CVE_PED_TIEND = Optional.ofNullable(rs.getString("CVE_PED_TIEND"));
                        i.setCvePedTiend(CVE_PED_TIEND.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> F_ENTREGA = Optional.ofNullable(rs.getString("F_ENTREGA"));
                        i.setfEntrega(F_ENTREGA.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> R_EVIDENCIA = Optional.ofNullable(rs.getString("R_EVIDENCIA"));
                        i.setrEvidencia(R_EVIDENCIA.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> ID_GUIA = Optional.ofNullable(rs.getString("ID_GUIA"));
                        i.setIdGuia(ID_GUIA.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> FAC_ENV = Optional.ofNullable(rs.getString("FAC_ENV"));
                        i.setFacEnv(FAC_ENV.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> GUIA_ENV = Optional.ofNullable(rs.getString("GUIA_ENV"));
                        i.setGuiaEnv(GUIA_ENV.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> REG_FISC = Optional.ofNullable(rs.getString("REG_FISC"));
                        i.setRegFisc(REG_FISC.orElse(sinInfo));

                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        Optional<String> CVE_PAIS_SAT = Optional.ofNullable(rs.getString("CVE_PAIS_SAT"));
                        i.setCvePaisSat(CVE_PAIS_SAT.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Optional<String> FEEDDOCUMENT_GUIA = Optional.ofNullable(rs.getString("FEEDDOCUMENT_GUIA"));
                        i.setRegFeed(FEEDDOCUMENT_GUIA.orElse(sinInfo));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                }
            }
            Cerrar();

            try {
                Conectar();
                String sqlInsert = "INSERT INTO INFENVIO01 (CVE_INFO, CVE_CONS, NOMBRE, CALLE, NUMINT, NUMEXT, CRUZAMIENTOS, CRUZAMIENTOS2, POB, CURP, REFERDIR, CVE_ZONA, CVE_OBS, STRNOGUIA, STRMODOENV, FECHA_ENV, NOMBRE_RECEP, NO_RECEP, FECHA_RECEP, COLONIA, CODIGO, ESTADO, PAIS, MUNICIPIO, PAQUETERIA, CVE_PED_TIEND, F_ENTREGA, R_FACTURA, R_EVIDENCIA, ID_GUIA, FAC_ENV, GUIA_ENV, REG_FISC, CVE_PAIS_SAT, FEEDDOCUMENT_GUIA)"
                        + "VALUES (" + info + ", '" + i.getCveCons() + "', '" + i.getNombre() + "', '" + i.getCalle() + "', '" + i.getNumint() + "', '" + i.getNumext() + "', "
                        + "'" + i.getCruzamientos() + "', '" + i.getCruzamientos2() + "', '" + i.getPob() + "', '" + i.getCurp() + "', '" + i.getReferdir() + "', '" + i.getCveZona() + "', "
                        + "" + cve + ", '" + i.getStrnoguia() + "', '" + i.getStrmodoenv() + "', NULL, '" + i.getNoRecep() + "', '" + i.getNoRecep() + "', "
                        + "NULL, '" + i.getColonia() + "', '" + i.getCodigo() + "', '" + i.getEstado() + "', '" + i.getPais() + "', '" + i.getMunicipio() + "', "
                        + "'" + i.getPaqueteria() + "', '" + i.getCvePedTiend() + "', NULL, 'C-" + uFolio + "', '" + i.getrEvidencia() + "', '" + i.getIdGuia() + "', "
                        + "'" + i.getFacEnv() + "', '" + i.getGuiaEnv() + "', '" + i.getRegFisc() + "', '" + i.getCvePaisSat() + "', NULL)";
                PreparedStatement ps = getCn().prepareStatement(sqlInsert);
                ps.executeUpdate();
                Cerrar();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //**"INFENVIO01"**//
    }

    //**MAX FOLIO CVE_OBS***//
    public void maxObsPartidas(int doc) {
        int maxfol = 0;
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT MAX(CVE_OBS) AS CVE_OBS FROM PAR_FACTC01 WHERE CVE_DOC='C-" + doc + "'";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    maxfol = rs.getInt("CVE_OBS");
                    if (maxfol != 0) {
                        actualizarTblControl01(maxfol);
                    }

                }
            }
            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    //**MAX FOLIO CVE_OBS***//
    public void maxObsEncabezados(int doc) {
        int maxfol = 0;
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT MAX(CVE_OBS) AS CVE_OBS FROM FACTC01 WHERE CVE_DOC='C-" + doc + "'";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    maxfol = rs.getInt("CVE_OBS");
                    if (maxfol != 0) {
                        actualizarTblControl012(maxfol);
                    }

                }
            }
            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void actualizarTblControl01(int folio) {
        try {
            Conectar();
            String sql = "UPDATE TBLCONTROL01 SET ULT_CVE='" + folio + "' WHERE ID_TABLA=56";
            PreparedStatement ps = getCn().prepareStatement(sql);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PreciosBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarTblControl012(int folio) {
        try {
            Conectar();
            String sql = "UPDATE TBLCONTROL01 SET ULT_CVE='" + folio + "' WHERE ID_TABLA=70";
            PreparedStatement ps = getCn().prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PreciosBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //PASO 1
    public int nuevoCveInfo() {
        int datoEnv = 0;
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT MAX(CVE_INFO)+1 AS CVE_INFO FROM INFENVIO01";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    datoEnv = rs.getInt("CVE_INFO");
                }
            }
            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datoEnv;
    }

    //**MAX FOLIO CVE_OBS***//
    public int folObsDoc() {
        datEnv = 0;
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT MAX(CVE_OBS)+1 AS CVE_OBS  FROM OBS_DOCF01";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    datEnv = rs.getInt("CVE_OBS");
                }
            }
            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datEnv;
    }

    public int folObsDocTablaPartidas() {
        datEnv = 0;
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT MAX(CVE_OBS)+1 AS CVE_OBS  FROM OBS_DOCF01";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    datEnv = rs.getInt("CVE_OBS");
                }
            }
            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datEnv;
    }

    //**MAX FOLIO CVE_OBS***//
    public int folObsDocTblCtl() {
        datEnv = 0;
        try {
            Conectar();
            Statement st = getCn().createStatement();
            String sql = "SELECT MAX(CVE_OBS) AS CVE_OBS  FROM OBS_DOCF01";
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    datEnv = rs.getInt("CVE_OBS");
                }
            }
            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datEnv;
    }

    public void partidasClib(String cveD, int folioUlt) {
        try {
            Conectar();
            String sql = "SELECT CLAVE_DOC, NUM_PART, CAMPLIB1, CAMPLIB2 FROM PAR_FACTC_CLIB01 WHERE CLAVE_DOC='" + cveD + "'";
            Statement st = getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (!rs.isBeforeFirst()) {

            } else {
                while (rs.next()) {
                    parFactcClib01 = new ParFactcClib01();
                    parFactcClib01.setClaveDoc(rs.getString("CLAVE_DOC"));
                    parFactcClib01.setNumPart(rs.getInt("NUM_PART"));
                    parFactcClib01.setCamplib1(rs.getString("CAMPLIB1"));
                    parFactcClib01.setCamplib2(rs.getString("CAMPLIB2"));
                    guardarpartidasClib(folioUlt, parFactcClib01);
                }
            }

            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarpartidasClib(int folio, ParFactcClib01 p) {
        try {
            Conectar();
            String sql = "INSERT INTO PAR_FACTC_CLIB01 (CLAVE_DOC, NUM_PART, CAMPLIB1, CAMPLIB2) "
                    + "VALUES ('C-" + folio + "', " + p.getNumPart() + ", '" + p.getCamplib1() + "', '" + p.getCamplib2() + "');";
            PreparedStatement ps = getCn().prepareStatement(sql);
            ps.executeUpdate();
            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void actualizarFolio(int folio) {
        try {
            Conectar();
            String sql = "UPDATE FOLIOSF01 SET ULT_DOC='" + folio + "' WHERE TIP_DOC='C' AND SERIE='C-'";
            PreparedStatement ps = getCn().prepareStatement(sql);
            ps.executeUpdate();
            Cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarDatosPartidaCveObs(int cveObs, int dato) {
        try {

            Conectar();
            String sql = "SELECT STR_OBS FROM OBS_DOCF01 WHERE CVE_OBS='" + cveObs + "'";
            Statement st = getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    insertarDatosPartidaCveObs(rs.getString("STR_OBS"), dato);
                }
            }
            Cerrar();
        } catch (SQLException e) {
            Logger.getLogger(PreciosBean.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void insertarDatosPartidaCveObs(String cveO, int folio) {
        try {
            Conectar();
            String sql = "INSERT INTO OBS_DOCF01 (CVE_OBS, STR_OBS) "
                    + "VALUES (" + folio + ", '" + cveO.replace("\"", "") + "');";
            PreparedStatement ps = getCn().prepareStatement(sql);
            ps.executeUpdate();
            Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(PreciosBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
