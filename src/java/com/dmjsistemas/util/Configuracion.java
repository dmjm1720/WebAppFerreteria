package com.dmjsistemas.util;

public class Configuracion {

    //**PRODUCCIÓN**//
    //private static final String conexDB = "jdbc:firebirdsql://localhost:3050/C:\\Program Files (x86)\\Common Files\\Aspel\\Sistemas Aspel\\SAE8.00\\Empresa01\\Datos\\SAE80EMPRE01.FDB?encoding=UTF8";
    //**PRUEBAS**//
//    private static final String conexDB = "jdbc:sqlserver://localhost;databaseName=SAE80Empre01";
//    private static final String conexUser = "sa";
//    private static final String conexPwd = "Pr4xi5A5a*";
    private static final String conexDB = "jdbc:sqlserver://SERVER\\SQLEXPRESS;databaseName=SAE80Empre01";
    private static final String conexUser = "sa";
    private static final String conexPwd = "Portales02";

    //private static final String conexDB = "jdbc:firebirdsql://localhost:3050//firebird/data/SAE80EMPRE01.FDB?encoding=UTF8";
//    private static final String conexDB = "jdbc:firebirdsql://localhost:3050/C:\\Program Files (x86)\\Common Files\\Aspel\\Sistemas Aspel\\SAE8.00\\Empresa01\\Datos\\PRUEBAS_SAE80EMPRE01.FDB?encoding=UTF8";
//    //private static final String conexDB = "jdbc:firebirdsql://localhost:3050//firebird/data/SAE80EMPRE01.FDB?encoding=UTF8";
//    private static final String conexUser = "sysdba";
//    private static final String conexPwd = "masterkey";
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
