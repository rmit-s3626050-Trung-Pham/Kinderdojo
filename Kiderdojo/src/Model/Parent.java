
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamtrung
 */
public class Parent {
//    public DatabaseConnection dbConn ;
    PreparedStatement stat = null;
    public String username;
    public String name;
    public String gender;
    public String DOB;
    public String address;
    public String facialPhoto;
    public String email;
    public String phoneNum;
    public int iStatus = 0;
    public void createParentUsername(DatabaseConnection dbConn ,String username, String password){
        String query = "Insert into ParentAccount values (?,?)";
        try {
            stat = dbConn.conn.prepareStatement(query);
            stat.setString(1, username);
            stat.setString(2, password);
            stat.executeUpdate();
            iStatus++;
        } catch (SQLException ex) {
            System.out.println("create fail!!!!!!!");
        }
    }
    public void createParentAccount(DatabaseConnection dbConn ,String username, String name, String gender, String DOB, String address, String facialPhoto ,String email, String phoneNum){
        String query = "Insert into Parent values (?,?,?,?,?,?,?,?)";
        try {
            stat = dbConn.conn.prepareStatement(query);
            stat.setString(1, username);
            stat.setString(2, name);
            stat.setString(3, gender);
            stat.setString(4, DOB);
            stat.setString(5, address);
            stat.setString(6, facialPhoto);
            stat.setString(7, email);
            stat.setString(8, phoneNum);
            stat.executeUpdate();
            iStatus++;
        } catch (SQLException ex) {
            System.out.println("Create fail!!!!!!!!");
        }
        
    }
    public void updateParentAccount(){
        
    }
    public void deleteParentUsername(DatabaseConnection dbconn, String username){
        PreparedStatement preStatement = null;
        String deleteSQL = "delete parentAccount where username = ?";
        try {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, username);
            preStatement.executeUpdate();
            System.out.println("delete parent username successful!!");
        } catch (SQLException ex) {
//            Logger.getLogger(Parent.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("delete parent username fail!!");
        }
    }
    public void deleteParentAccount(DatabaseConnection dbconn, String username){
        PreparedStatement preStatement = null;
        String deleteSQL = "delete Parent where username = ?";
        try {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, username);
            preStatement.executeUpdate();
            System.out.println("delete Parent account successful!!");
        } catch (SQLException ex) {
//            Logger.getLogger(Parent.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("delete parent account fail!!");
        }
    }
    
    public void loadParentInfo(DatabaseConnection dbConn , String username){
        String query = "Select * from Parent";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                if(username.equals(rs.getString(1))){
                    name = rs.getString(2);
                    gender = rs.getString(3);
                    DOB = rs.getString(4);
                    address = rs.getString(5);
                    email = rs.getString(6);
                    phoneNum = rs.getString(7);
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadParentDB(DatabaseConnection dbConn){
        String query = "Select * from Parent";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                    username = rs.getString(1);
                    name = rs.getString(2);
                    gender = rs.getString(3);
                    DOB = rs.getString(4);
                    address = rs.getString(5);
                    facialPhoto = rs.getString(6);
                    email = rs.getString(7);
                    phoneNum = rs.getString(8);
                    
                    System.out.println("username: " + username);
                    System.out.println("name: " + name);
                    System.out.println("gender: " + gender);
                    System.out.println("DOB: " + DOB);
                    System.out.println("address: " + address);
                    System.out.println("facialPhoto: " + facialPhoto);
                    System.out.println("email: " + email);
                    System.out.println("phoneNum: " + phoneNum);
                    System.out.println("--------------------");
                    
                    
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static void main(String args[]){
        Parent pr = new Parent();
        DatabaseConnection dbconn = new DatabaseConnection();
        
        pr.loadParentDB(dbconn);
       
        
    }
}
