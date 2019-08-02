package com.smoothstack.assignments.week01;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	private SampleSingleton() {
		//initialize connection here...
	}
	public static SampleSingleton getInstance() {
		if (instance == null) {
			synchronized(SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
				return instance;
			}
		} else {
			return instance;			
		}
	}
	
	public static void databaseQuery(BigDecimal input) {
		try {
			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			BigDecimal x = new BigDecimal(0);
			while(rs.next()) {
				x = new BigDecimal(rs.getInt(1)).multiply(input);
			}
			System.out.println(x);
		} catch (Exception e) {}
	}
}