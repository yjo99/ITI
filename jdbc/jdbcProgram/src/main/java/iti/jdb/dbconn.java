package iti.jdb;
import java.sql.*;

public class dbconn {

    private static final String Host = "127.0.0.10";

    private static final int Port = 3306;
    private static final String dbName = "sys";
    private static final String user ="root";
    private static final String pass = "123456";
    private static Connection  con = null;


    public static Connection getConn(){

        try {
            con = DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s", Host, Port, dbName), user, pass);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
