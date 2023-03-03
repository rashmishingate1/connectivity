package mysqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class updatesql {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Satara@123");
			Statement st=(Statement) conn.createStatement();
			String str1="update students set id=25 where name='komal'";
			st.executeUpdate(str1);
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
