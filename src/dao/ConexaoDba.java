
package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoDba {
  
    public static Connection conectarNoDba()throws Exception{
    
      Class.forName("org.postgresql.Driver");
      return DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetodeferias","lucas","lucas123");
    
    
    }
}
