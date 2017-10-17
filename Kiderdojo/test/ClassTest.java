/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Model.DatabaseConnection;
/**
 *
 * @author phamtrung
 */
public class ClassTest {
    static DatabaseConnection dbConn;
    static Model.Class cl;
    public ClassTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        dbConn = new DatabaseConnection();
        cl = new Model.Class();
    }
    
    @Test
    public void createClass_Successful(){
        assertTrue(cl.createClass(dbConn, 1004, "blue", 2009));
    }
    @Test
    public void createClass_Failed(){
        assertFalse(cl.createClass(dbConn, 1003, "red", 2005));
    }
    @Test
    public void assignCarerClass_Successful(){
//        assertTrue(cl.assignCarerClass(dbConn, "C0001", 1004));
    }
    @Test 
    public void assignCarerClass_Failed(){
//        assertFalse(cl.assignCarerClass(dbConn, "C0001", 1005));
    }
    @AfterClass
    public static void tearDownClass() {
//        cl.deleteCarerAssignClass(dbConn, "C0001", 1004);
//        cl.deleteClass(dbConn, 1004);
    }
    

    
}
