package com.gla;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class MainMethod {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("main starting");
		String url = "jdbc:mysql://localhost:3306/users?serverTimezone=UTC&useSSL=false";
		String user= "root";
		String password= "root";
		String create="create table employee(id int primary key auto_increment,name varchar(20),department varchar(20))";
		String insert="insert into employee(name,department) values('Krunall','Operations'),('Amol','PowerB'),('Tanisha','PLSQL')";
		String selectQuery = "SELECT * FROM employee";
		
		
		
//		String deleteData= "DELETE FROM student WHERE id=1";
		
		int rowsUpdate
		
		try(Connection conn = DriverManager.getConnection(url,user,password);
				Statement stat = conn.createStatement()){
			
			stat.executeUpdate(create);
			stat.executeUpdate(insert);
		

			try(ResultSet resultSet= stat.executeQuery(selectQuery)){
				while(resultSet.next()) {
					int id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					String department = resultSet.getString("department");
					System.out.printf("id=%d,name=%s,department=%s%n",id,name,department);
				}
			}
			
		}   catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}