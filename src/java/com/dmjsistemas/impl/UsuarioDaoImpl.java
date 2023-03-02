package com.dmjsistemas.impl;

import com.dmjsistemas.dao.IUsuarioDao;
import com.dmjsistemas.model.Usuarios;
import com.dmjsistemas.util.HibernateUtil;
import com.dmjsistemas.util.Password;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class UsuarioDaoImpl implements IUsuarioDao {

    @Override
    public Usuarios obtenerDatosUsuario(Usuarios usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Usuarios WHERE nombre=:nombre AND clave=:clave";
        Query q = session.createQuery(hql).setMaxResults(1);
        q.setParameter("nombre", usuario.getNombre());
        q.setParameter("clave", Password.sha512(usuario.getClave()));
        return (Usuarios) q.uniqueResult();
    }

    @Override
    public Usuarios login(Usuarios usuario) {
        Usuarios user = this.obtenerDatosUsuario(usuario);
        if (user != null) {
            if (!user.getClave().equals(Password.sha512(usuario.getClave()))) {
                user = null;
            }
        }
        return user;
    }

    @Override
    public void guardarUsuario(Usuarios usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarUsuario(Usuarios usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarUsuario(Usuarios usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
