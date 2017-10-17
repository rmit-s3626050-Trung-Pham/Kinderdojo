/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author phamtrung
 */
public class Class {

    static void forName(String url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int classID;
    public String classType;
    public int yearOffering;
    PreparedStatement stat = null;
    public boolean createClass(DatabaseConnection dbConn, int classID, String classType, int yearOffering){
        String query = "Insert into Class values (?,?,?)";
        try {
            stat = dbConn.conn.prepareStatement(query);
            stat.setInt(1, classID);
            stat.setString(2, classType);
            stat.setInt(3, yearOffering);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "create class successful!!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "create class fail!!");
            return false;
        }
    }
    public void updateClass(){
    
    }
    public void deleteClass(DatabaseConnection dbconn, String classID){
        PreparedStatement preStatement = null;
        String deleteSQL = "delete Class where classID = ?";
        try {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, classID);
            preStatement.executeUpdate();
            System.out.println("delete Parent account successful!!");
        } catch (SQLException ex) {
            Logger.getLogger(Carer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("delete parent account fail!!");
        }
    }
    public void deleteCarerAssignClass(DatabaseConnection dbconn, String carerID, int classID){
        PreparedStatement preStatement = null;
        String deleteSQL = "delete CARERinCLASS where carerID = ? and classID = ?";
        try {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, carerID);
            preStatement.setInt(2, classID);
            preStatement.executeUpdate();
            System.out.println("delete assign Carer_class successful!!");
        } catch (SQLException ex) {
            Logger.getLogger(Carer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("delete assign Carer_class fail!!");
        }
    }
    public boolean assignCarerClass(DatabaseConnection dbConn, String carerID, int classID){
        String query = "Insert into CARERinCLASS values (?,?)";
        try {
            stat = dbConn.conn.prepareStatement(query);
            stat.setString(1, carerID);
            stat.setInt(2, classID);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "assign carer into class successful!!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "assign carer into class fail!!");
            return false;
        }
    }
    public void loadClassDB(DatabaseConnection dbConn){
        String query = "Select * from Class";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                    String classID = rs.getString(1);
                    String classType = rs.getString(2);
                    String yearOffering = rs.getString(3);
                    
                    System.out.println("username: " + classID);
                    System.out.println("name: " + classType);
                    System.out.println("gender: " + yearOffering);
                    System.out.println("--------------------");
                    
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        DatabaseConnection dbConn = new DatabaseConnection();
        Class cl = new Class();
//        cl.assignCarerClass(dbConn, "C0001", 1003);
//        cl.deleteClass(dbConn, "1004");
        cl.deleteCarerAssignClass(dbConn, "C0001", 1004);
//        cl.loadClassDB(dbConn);
    }
}
