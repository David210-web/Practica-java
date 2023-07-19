package app;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexion {
    public static Connection getConection(){
        //String url = "jdbc:sqlserver://localhost:1433;" + "database=escuela;" +  "database=escuela;" + "user=sa;" + "password=1234;" + "TrustServerCertificate=True;";
        
         //con = DriverManager.getConnection(url, user, password);
        
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=escuela;TrustServerCertificate=True";
             String user = "sa";
            String password = "12345678";
            Connection con = DriverManager.getConnection(url,user,password);
            return con;
        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
}
