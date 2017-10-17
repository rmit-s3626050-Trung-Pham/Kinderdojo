/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author xinyuye
 */
public class Child 
{
    public static DatabaseConnection dbConn  = new DatabaseConnection();
    PreparedStatement stat = null;
    
    public String childID;
    public String childName;
    public String facialPhoto;
    public String age;
    public String   DOB;
    public String gender;
    public String parentID;
    public int iStatus;
    
    
    public Child(String childID, String childName, String facialPhoto, 
                 String DOB, String gender,
			String parentID) 
        {
		
		this.childID = childID;
		this.childName = childName;
		this.facialPhoto = facialPhoto;
		this.DOB = DOB;
                this.gender = gender;
                this.parentID = parentID;
		
        }
    
	    public Child()
	    {
	        
	    }
    
 
    public boolean createChild (DatabaseConnection dbConn ,String childID, String childName, String facialPhoto, 
                 String DOB, String gender,
			String parentID)
    {
        String query = "Insert into CHILDREN values (?,?,?,?,?,?)";
        try 
        {
            stat = dbConn.conn.prepareStatement(query);
            stat.setString(1, childID);
            stat.setString(2, childName);
            stat.setString(3, facialPhoto);
            stat.setString(4, DOB);
            stat.setString(5, gender);
            stat.setString(6, parentID);
            stat.executeUpdate();
//            JOptionPane.showMessageDialog(null, "This child is successfully added. ");

            iStatus++;
            
            System.out.println("This child is successfully added. ");
            
            return true;
        	} 
        
        
        
        
        catch (SQLException ex) 
        {
//            JOptionPane.showMessageDialog(null, "Failed to add the child.");
        
        	System.out.println("Failed to add this child !");    
        
        	return false;
                    
        }
        
    }
    
    public void deleteChild(DatabaseConnection dbconn, String childID)
    {
        PreparedStatement preStatement = null;
        String deleteSQL = "delete CHILDREN where childID = ?";
        try 
        {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, childID);
            preStatement.executeUpdate();
            System.out.println("This child is deleted successfully. ");
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(Child.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed to delete this child. ");
        }
    }
    
    public void viewChildInformation(String childID)
    {
        
    }
    
    public void updateChildInformation(String childID)
    {
        
    }
    
    public boolean addAlbum()
    {
        return false;
    }
    
         
    public boolean addPhoto()
    {
        return false;
    }
    
    public boolean loadChildDB(DatabaseConnection dbConn , String childID)
    {
        String query = "Select * from Children where childID = ' " + childID + "'";
        Statement stat = null;
        
        try 	
        {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
	            while (rs.next())
	            {
	                
	                if(childID.equals(rs.getString(1)))
	                {
	            		
	                    childName = rs.getString(2);
	                    facialPhoto = rs.getString(3);
	                    DOB = rs.getString(4);
	                    gender = rs.getString(5);
	                    parentID = rs.getString(6);
	                    
	                    System.out.println("The child that you are looking for is existing in this database. ");
	    	            
	    	            	 	return true;
	                    
	                }
	                
	                
	            }
	            
	            System.out.println("The child that you are looking for is not existed in this database! ");
	            
	            return false;
	                       
	            
        		} 
        
        	catch (SQLException ex) 
        {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
            
            ex.printStackTrace();
            
            return false;
        }
    }
    
    
//    public static void main(String[] args) 
//    {
//        Child chl = new Child();
//
//        chl.createChild(dbConn, "CH0002", "Bear", "src/Image", "01/July/2013", "Male", "P0001");
//    }
}