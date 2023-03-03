package mysqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class ConnectivityDemo {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Satara@123");
			Statement st=(Statement) conn.createStatement();
			ResultSet rset=st.executeQuery("select * from students");
			while(rset.next())
			{
				System.out.println(rset.getString(1)+"           "+rset.getString(2)+"                "+rset.getString(3)+"                "+rset.getString(4)); 
			}
			
		} catch (Exception e) 
		{
			System.out.println("The error are:   " + e);
		}

		

	}

}


/*package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Connectivity {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ccprogram","root","mysql123");
			Statement st=(Statement) conn.createStatement();
			ResultSet rset=st.executeQuery("select * from itemployee");
			while(rset.next())
			{
				System.out.println(rset.getString(1)+"           "+rset.getString(2)+"                "+rset.getString(3)+"                "+rset.getString(4)+"        "+rset.getString(5)); 
			}
			
		} catch (Exception e) 
		{
			System.out.println("The error are:   " + e);
		}

	}

}
*/