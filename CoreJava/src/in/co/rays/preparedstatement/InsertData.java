package in.co.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance11","root","root");
		PreparedStatement ps=conn.prepareStatement("insert into emp values(3,'pqr', 2000  )");
		ps.executeUpdate();
		System.out.println("Data inserted");
		
	}

}
