/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.systems;
import java.sql.*;
/**
 *
 * @author R.SHANMUKH
 */
public class connect {
    Connection c;
    Statement s;
    public connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ums","root","");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
        
    
    }
    
}
