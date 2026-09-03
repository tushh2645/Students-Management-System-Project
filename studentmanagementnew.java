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
		
		public static void addStudent() throws ClassNotFoundException, SQLException {
			PreparedStatement preparedStatement=dbConnect().prepareStatement("insert into student1 values(?,?,?,?)");
			System.out.println("enter a roll no: ");
			preparedStatement.setInt(1, sc.nextInt());
			System.out.println("enter a name: ");
			preparedStatement.setString(2, sc.next());
			System.out.println("enter a age: ");
			preparedStatement.setInt(3, sc.nextInt());
			System.out.println("enter a city: ");
			preparedStatement.setString(4, sc.next());
			
			
			int result=preparedStatement.executeUpdate();
			System.out.println("Query Ok"+ result + "rows affected");
			
			
	        preparedStatement.close();
			
		}
		
}
