/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package test;

import Model.Child;
import Model.DatabaseConnection;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.sun.media.jfxmedia.control.VideoDataBuffer;
import oracle.jdbc.driver.DBConversion;

/**
 *
 * @author yifan
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Childtest 

{
	static DatabaseConnection dbConn;
	static Child baby1;
	static Child Baby2;
	

	@BeforeClass
	public static void setUp() 
	{
		baby1 = new Child ();
		dbConn = new DatabaseConnection();
	}
        

        
	@Test
	public void test1createChild() 
	{
		assertTrue(baby1.createChild(dbConn, "9999", "baby"," ","24/12/1993","male","P0001"));
	}

	@Test
	public void test2createChildFaild() 
	{
		assertFalse(baby1.createChild(dbConn, "9999", "baby"," ","24/12/1993","male","P0001"));
	}

	@Test
	public void test3LoadChildDB() 
	{
		assertTrue(baby1.loadChildDB(dbConn, "9999"));
	}
        
        @Test
	public void test4LoadChildDB() 
	{
		assertFalse(baby1.loadChildDB(dbConn, "111111"));
	}
        
	
	@AfterClass
	public static void tearDown() 
	{
		baby1.deleteChild(dbConn, "9999");
//		dbConn.disConnect();
	}
}
