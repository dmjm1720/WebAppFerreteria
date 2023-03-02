package com.dmjsistemas.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public void Conectar() {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");    
            this.cn = DriverManager.getConnection(Configuracion.getConexDB(), Configuracion.getConexUser(), Configuracion.getConexPwd());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Cerrar() throws SQLException {
        try {
            if ((this.cn != null)
                    && (!this.cn.isClosed())) {
                this.cn.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }
    
}
