package advassignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;

public class Ass1   {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl = "jdbc:mysql://localhost:3306/pr";
			Connection con= DriverManager.getConnection(jdbcurl,"root","root");
			System.out.println("connection esatablished");
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the deptno");
			System.out.println("enter the sal");
			int i= sc.nextInt();
			float s = sc.nextFloat();
			
			//
//			//Statement stmt = con.createStatement();
//			
//
//			ResultSet rs = stmt.executeQuery("select * from emp where deptno = 10");
//			while(rs.next())
//			{
//				System.out.print(rs.getInt(1)+" : ");
//				System.out.print(rs.getString(2)+" : ");
//				System.out.print(rs.getString(3)+" : ");
//				System.out.print(rs.getInt(4)+" : ");
//				System.out.print(rs.getInt(8)+" : ");
//				System.out.println();
//			}
//			rs.close();
//			stmt.close();
//			con.close();
//		}
      PreparedStatement  ps = con.prepareStatement("select * from emp where deptno = ? and sal > ? ");
      				ps.setInt(1, i);
      				ps.setFloat(2, s);
      				ResultSet rs=ps.executeQuery();
      				
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1)+" : "+ rs.getFloat(6) + " : "+rs.getFloat(7)) ;
	  
	    }
	rs.close();
	ps.close();
	con.close();
	}
	
}

			
			
			
			
	


