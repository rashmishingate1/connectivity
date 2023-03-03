package mysqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class insertrecordsql {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Rashmi@123");
			Statement st=(Statement) conn.createStatement();
			String str="insert into students values(5,'Delhi','Komal','komal@gmail.com')";
			st.executeUpdate(str);
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



//String str="insert into itemployee values(113,'varadharajan',20,'Developer',35000)";
//st.executeUpdate(str);
//String str1="update itemployee set eage=25 where ename='varadharajan'";
//st.executeUpdate(str1);
//String str1="delete from itemployee where ename='varadharajan'";
//st.executeUpdate(str1);