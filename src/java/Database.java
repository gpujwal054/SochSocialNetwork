import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gpujw
 */
public class Database {
    Connection con = null;
    Statement statement = null;//query statement
    ResultSet resultSet = null;
    public Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/socialnetwork?zeroDateTimeBehavior=convertToNull","root","");
            statement = con.createStatement();
            JOptionPane.showMessageDialog(null,"Connected");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Not Connected");
        }
}

    public static void main(String[] args){
        Database d = new Database();
    }
}
