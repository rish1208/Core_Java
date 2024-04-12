package in.co.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {
public static void main(String[]args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
	PreparedStatement ps=conn.prepareStatement("delete from user where id=2");
	ps.executeUpdate();
	System.out.println("Data deleted");
}

}
