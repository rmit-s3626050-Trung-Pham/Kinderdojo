/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class Manager {
    public ArrayList<Carer> arrayC = new ArrayList<>();
    public ArrayList<Parent> arrayP = new ArrayList<>();
    public ArrayList<Class> arrayCl = new ArrayList<>();
    public ArrayList<Child> arrayCh = new ArrayList<>();
    public Manager(){
    }
    
    public void loadCarerDB(DatabaseConnection dbConn){
        String query = "Select * from Carer";
        Statement stat = null;
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                Carer carer = new Carer();
                carer.username = rs.getString(1);
                carer.name = rs.getString(2);
                carer.gender = rs.getString(3);
                carer.DOB = rs.getString(4);
                carer.address = rs.getString(5);
                carer.facialPhoto = rs.getString(6);
                carer.email = rs.getString(7);
                carer.phoneNum = rs.getString(8);
                
                arrayC.add(carer);
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
                Parent parent = new Parent();
                parent.username = rs.getString(1);
                parent.name = rs.getString(2);
                parent.gender = rs.getString(3);
                parent.DOB = rs.getString(4);
                parent.address = rs.getString(5);
                parent.facialPhoto = rs.getString(6);
                parent.email = rs.getString(7);
                parent.phoneNum = rs.getString(8);
                arrayP.add(parent);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadClassDB(DatabaseConnection dbConn){
        String query = "Select * from Class";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                    Class cl = new Class();
                    cl.classID = rs.getInt(1);
                    cl.classType = rs.getString(2);
                    cl.yearOffering = rs.getInt(3);
                    System.out.println("classID:" + cl.classID);
                    arrayCl.add(cl);
                    
                    
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadCarerinClassDB(DatabaseConnection dbConn){
        String query = "Select * from CarerinClass";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
//                    Class cl = new Class();
                    String carerID = rs.getString(1);
                    String classID = rs.getString(2);
//                    cl.yearOffering = rs.getInt(3);
//                    arrayCl.add(cl);
                    System.out.println("carerID: "+ carerID);
                    System.out.println("classID:" + classID);
                    System.out.println("---------------------");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadChildDB(DatabaseConnection dbConn){
        String query = "Select * from Children";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                    Child child = new Child();
                    child.childID       = rs.getString(1);
                    child.childName     = rs.getString(2);
                    child.facialPhoto   = rs.getString(3);
//                    child.age           = rs.getString(4);
                    child.DOB           = rs.getString(4);
                    child.gender        = rs.getString(5);
                    child.parentID      = rs.getString(6);
                    arrayCh.add(child);
                    
                    
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        Manager manager = new Manager();
        DatabaseConnection dbConn = new DatabaseConnection();
//        manager.loadCarerDB(dbConn);
//        manager.loadClassDB(dbConn);
//        manager.loadCarerinClassDB(dbConn);
        manager.loadParentDB(dbConn);
        for (Parent parent : manager.arrayP) {
                System.out.println("ID: " + parent.username);
                System.out.println("Name: " + parent.name);
                System.out.println("gender: " + parent.gender);
                System.out.println("DOB: " + parent.DOB);
                System.out.println("address: " + parent.address);
                System.out.println("facialPhoto: " + parent.facialPhoto);
                System.out.println("email: " + parent.email);
                System.out.println("phoneNum: " + parent.phoneNum);
                System.out.println("-------------------------");
        }
//        manager.loadChildDB(dbConn);
//        for (Child child : manager.arrayCh) {
//                System.out.println("ID: " + child.childID);
//                System.out.println("Name: " + child.childName);
//                System.out.println("facialPhoto: " + child.facialPhoto);
////                System.out.println("age: " + child.age);
//                System.out.println("DOB: " + child.DOB);
//                System.out.println("Gender: " + child.gender);
//                System.out.println("parentID: " + child.parentID);
//                System.out.println("-------------------------");
//        }
    }
}
