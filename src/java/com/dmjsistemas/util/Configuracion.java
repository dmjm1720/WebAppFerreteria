package com.dmjsistemas.util;



public class Configuracion {

    //**PRODUCCIÓN**//
    //private static final String conexDB = "jdbc:firebirdsql://localhost:3050/C:\\Program Files (x86)\\Common Files\\Aspel\\Sistemas Aspel\\SAE8.00\\Empresa01\\Datos\\SAE80EMPRE01.FDB?encoding=UTF8";

    //**PRUEBAS**//
    private static final String conexDB = "jdbc:firebirdsql://localhost:3050/C:\\Program Files (x86)\\Common Files\\Aspel\\Sistemas Aspel\\SAE8.00\\Empresa01\\Datos\\PRUEBAS_SAE80EMPRE01.FDB?encoding=UTF8";
    //private static final String conexDB = "jdbc:firebirdsql://localhost:3050//firebird/data/SAE80EMPRE01.FDB?encoding=UTF8";
    private static final String conexUser = "sysdba";
    private static final String conexPwd = "masterkey";

    public static String getConexDB() {
        return conexDB;
    }

    public static String getConexUser() {
        return conexUser;
    }

    public static String getConexPwd() {
        return conexPwd;
    }

}
