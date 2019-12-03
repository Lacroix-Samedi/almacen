
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionAlmacen {
      
    
   private static String driver = "com.mysql.jdbc.Driver";
   private static String database = "almacen";
   private static String hostname = "127.0.0.1";
   private static String port = "3306";
   private static String username = "root";
   private static String password = "";
   private static String ConnectionURL;
   public static Connection conn;

   public ConexionAlmacen() {
      this.ConnectionURL = "jdbc:mysql://";
      this.ConnectionURL += hostname + ":" + port + "/" + database;
      this.ConnectionURL += "?autoReconnect=true&useSS1=false";
      this.getConnection();
   }

   public static Connection getConnection() {
     
       try {
            Class.forName(driver);
       try {
            conn = DriverManager.getConnection(ConnectionURL, username, password); 
            } catch(SQLException e) {     
              System.out.print("La Clase " + driver + "no existe en el sistema");
            } 
            
}      catch (ClassNotFoundException ex) {
           Logger.getLogger(ConexionAlmacen.class.getName()).log(Level.SEVERE, null, ex);
       } 
       return conn;
   }
   }