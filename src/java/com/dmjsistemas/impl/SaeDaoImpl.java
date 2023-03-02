package com.dmjsistemas.impl;

import com.dmjsistemas.sae.model.Clie01;
import com.dmjsistemas.util.HibernateSaeUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.dmjsistemas.dao.ISaeDao;
import com.dmjsistemas.sae.model.Factc01;
import com.dmjsistemas.sae.model.FactcClib01;
import com.dmjsistemas.sae.model.Infenvio01;
import com.dmjsistemas.sae.model.Inve01;
import com.dmjsistemas.sae.model.ObsDocf01;
import com.dmjsistemas.sae.model.ParFactc01;
import com.dmjsistemas.sae.model.ParFactcClib01;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class SaeDaoImpl implements ISaeDao {

    @Override
    public List<Clie01> listaClie01(String clave) {
        List<Clie01> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Clie01 WHERE clave=:clave";
        try {
            Query q = session.createQuery(hql);
            q.setParameter("clave", clave);
            lista = q.list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;
    }

    @Override
    public List<Factc01> listaFactc01(String cvedoc) {
        List<Factc01> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Factc01 WHERE cveDoc=:cveDoc";
        try {
            Query q = session.createQuery(hql);
            q.setParameter("cveDoc", cvedoc);
            lista = q.list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;
    }

    @Override
    public List<ParFactc01> listaParFactc01(String cvedoc, String items) {
        List<ParFactc01> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM ParFactc01 WHERE cveDoc='" + cvedoc + "' AND numPar='" + items + "'";
        try {
            lista = session.createQuery(hql).list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;
    }

    @Override
    public List<Inve01> listaInve01(String cveArt) {
        List<Inve01> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Inve01 WHERE cveArt=:cveArt";
        try {
            Query q = session.createQuery(hql);
            q.setParameter("cveArt", cveArt);
            lista = q.list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;
    }

    @Override
    public int folioF01() {
        int folio = 0;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "SELECT ultDoc+1 FROM Foliosf01 WHERE tipDoc='C' AND serie='C-' ";
        try {
            Query q = session.createQuery(hql);
            folio = (int) q.uniqueResult();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return folio;
    }

    @Override
    @SuppressWarnings({"ConvertToTryWithResources", "null"})
    public void guardarFactc01(Factc01 f) {
        Session session = null;
        try {
            session = HibernateSaeUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(f);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    @SuppressWarnings({"ConvertToTryWithResources", "null"})
    public void guardarFactcClib01(FactcClib01 f) {
        Session session = null;
        try {
            session = HibernateSaeUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(f);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "¡AVISO!", "ERROR AL GUARDAR"));
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    @SuppressWarnings({"ConvertToTryWithResources", "null"})
    public void guardarObsDocc01(ObsDocf01 obs) {
        Session session = null;
        try {
            session = HibernateSaeUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(obs);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "¡AVISO!", "ERROR AL GUARDAR"));
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    @SuppressWarnings({"ConvertToTryWithResources", "null"})
    public void guardarParFactc01(ParFactc01 pf) {
        Session session = null;
        try {
            session = HibernateSaeUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(pf);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "¡AVISO!", "ERROR AL GUARDAR"));
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    @SuppressWarnings({"ConvertToTryWithResources", "null"})
    public void guardarParFactcClib01(ParFactcClib01 pfc) {
        Session session = null;
        try {
            session = HibernateSaeUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(pfc);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "¡AVISO!", "ERROR AL GUARDAR"));
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<FactcClib01> listaFactcClib01(String cveDoc) {
        List<FactcClib01> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM FactcClib01 WHERE claveDoc=:claveDoc";
        try {
            Query q = session.createQuery(hql);
            q.setParameter("claveDoc", cveDoc);
            lista = q.list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;
    }

    @Override
    public List<String> listaPartidas(String cveDoc) {
        List<String> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "SELECT numPar FROM ParFactc01 WHERE cveDoc=:cveDoc";
        try {
            Query q = session.createQuery(hql);
            q.setParameter("cveDoc", cveDoc);
            lista = q.list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;
    }

    @Override
    public List<ParFactcClib01> listaPartidasClib01(String cveDoc) {
        List<ParFactcClib01> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM ParFactcClib01 WHERE claveDoc=:claveDoc";
        try {
            Query q = session.createQuery(hql);
            q.setParameter("claveDoc", cveDoc);
            lista = q.list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;
    }

    @Override
    public List<ObsDocf01> listaObsDoc(int cveObs) {
        List<ObsDocf01> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM ObsDocf01 WHERE cveObs=:cveObs";
        try {
            Query q = session.createQuery(hql);
            q.setParameter("cveObs", cveObs);
            lista = q.list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;

    }

    @Override
    public int folioObs() {
         int folio = 0;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "SELECT MAX(CVE_OBS)+1 FROM OBS_DOCF01";
        try {
            Query q = session.createSQLQuery(hql);
            folio = (int) q.uniqueResult();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return folio;
    }

    @Override
    @SuppressWarnings({"ConvertToTryWithResources", "null"})
    public void guardarInfenvio01(Infenvio01 infenvio01) {
        Session session = null;
        try {
            session = HibernateSaeUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(infenvio01);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "¡AVISO!", "ERROR AL GUARDAR"));
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Infenvio01> listaInfenvio01(int cveInfo) {
         List<Infenvio01> lista = null;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Infenvio01 WHERE cveInfo=:cveInfo";
        try {
            Query q = session.createQuery(hql);
            q.setParameter("cveInfo", cveInfo);
            lista = q.list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return lista;
    }

    @Override
    public int folioCveInfo() {
          int folio = 0;
        Session session = HibernateSaeUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "SELECT MAX(CVE_INFO)+1 FROM INFENVIO01";
        try {
            Query q = session.createNativeQuery(hql);
            folio = (int) q.uniqueResult();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return folio;
    }

}
