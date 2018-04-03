/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;
import java.util.*;
import java.sql.*;

class OurDBmeth
{
    Connection conn;
    ResultSet rs;
    OurDBmeth() throws SQLException
    {
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/NanoOOP","nanooop","nanooop");
    }
    boolean check(String uname,String pass) throws SQLException
    {
        String queryString = "SELECT * FROM USER_DETAILS WHERE USERNAME LIKE '"+uname+"' AND PASSWORD LIKE '"+pass+"'";
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(queryString);
        try{rs.next();String s=rs.getString("USERNAME");}
        catch(SQLException ee){return false;}
        return true;
    }
    void enterFreshData(String uname,String pass) throws SQLException
    {
        String queryString="INSERT INTO USER_DETAILS(USERNAME,PASSWORD) VALUES('"+uname+"','"+pass+"')";
        Statement stmt=conn.createStatement();
        int rr=stmt.executeUpdate(queryString);
    }
    String[]  
}


public class TestDB {

    /**
     * @param 
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        OurDBmeth p=new OurDBmeth();
       //p.enterFreshData("abc3d", "1123");
        System.out.println(p.check("abc3d", "1123")); 
    }
    
}
