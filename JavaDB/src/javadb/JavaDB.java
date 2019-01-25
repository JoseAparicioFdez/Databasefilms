/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadb;

import java.sql.*;
                
public class JavaDB {

    
    public static void main(String[] args) {
        
      try{
          
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila","root","Pa$$w0rd");
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery ("select * from film");
          while (rs.next())
          {
              System.out.println(rs.getString(1));
              System.out.println(rs.getString(2)); 
              System.out.println(rs.getString(3)); 
              System.out.println(rs.getString(4)); 
              
              System.out.println("-------------"); 
          }
      }catch (Exception e)
      {
          System.out.println(e.getMessage());
      
              
              
              
              
              
              
              
              
          }
      }
        
    }
    

