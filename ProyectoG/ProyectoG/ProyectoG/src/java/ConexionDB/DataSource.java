/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;
import java.sql.*;
/**
 *
 * @author Juls
 */
public class DataSource {
    
      public Connection getConexion()
            {
                Connection c = null;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"classicmodels","odintec","RedCod25");
                    
                    
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
                return c;
            }
}
