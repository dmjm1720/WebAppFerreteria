package com.dmjsistemas.dao;

import com.dmjsistemas.sae.model.Clie01;
import com.dmjsistemas.sae.model.Factc01;
import com.dmjsistemas.sae.model.FactcClib01;
import com.dmjsistemas.sae.model.Infenvio01;
import com.dmjsistemas.sae.model.Inve01;
import com.dmjsistemas.sae.model.ObsDocf01;
import com.dmjsistemas.sae.model.ParFactc01;
import com.dmjsistemas.sae.model.ParFactcClib01;
import java.util.List;

public interface ISaeDao {

    public List<Clie01> listaClie01(String clave);

    public List<Factc01> listaFactc01(String cvedoc);

    public List<ParFactc01> listaParFactc01(String cvedoc, String items);

    public List<Inve01> listaInve01(String cveArt);

    public int folioF01();

    public void guardarFactc01(Factc01 f);

    public void guardarFactcClib01(FactcClib01 f);

    public void guardarObsDocc01(ObsDocf01 obs);

    public void guardarParFactc01(ParFactc01 pf);

    public void guardarParFactcClib01(ParFactcClib01 pfc);

    public void guardarInfenvio01(Infenvio01 infenvio01);

    public List<FactcClib01> listaFactcClib01(String cveDoc);

    public List<String> listaPartidas(String cveDoc);

    public List<ParFactcClib01> listaPartidasClib01(String cveDoc);

    public List<ObsDocf01> listaObsDoc(int cveObs);

    public int folioObs();

    public List<Infenvio01> listaInfenvio01(int cveInfo);

    public int folioCveInfo();

}
