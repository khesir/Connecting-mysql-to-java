/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadb;

import java.sql.*;

/**
 *
 * @author artollo
 */
public class Database {
    
    private Connection con;
    private Statement statement;
    
    public Database(){
        String dburl = "jdbc:mysql://localhost:3306/javadb";
        String dbuser = "root";
        String dbpassword = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dburl,dbuser,dbpassword);
            statement = con.createStatement();
        } catch(Exception e){
            System.err.println(e);
        }
    } 
    public void insert(String query)throws Exception{
        statement.executeUpdate(query);
    }
    
    public ResultSet select(String query)throws Exception{
        return statement.executeQuery(query);
    }
    public void delete(String query) throws Exception{
        statement.executeUpdate(query);
    }
    public void update(String query) throws Exception{
        statement.executeUpdate(query);
    }
}
