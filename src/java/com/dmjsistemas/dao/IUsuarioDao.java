package com.dmjsistemas.dao;

import com.dmjsistemas.model.Usuarios;

public interface IUsuarioDao {

    public Usuarios obtenerDatosUsuario(Usuarios usuario);

    public Usuarios login(Usuarios usuario);

    public void guardarUsuario(Usuarios usuario);

    public void actualizarUsuario(Usuarios usuario);

    public void borrarUsuario(Usuarios usuario);
}
