package com.studentmanagement2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class studentmanagementnew {

		static Scanner sc=new Scanner(System.in);
		
		
		public static Connection dbConnect() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/java43",
	                "root",
	                "Abc@2022"
	        );
	        
	        return connection;
		}
}
