package sqldemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDemo {

	 // Decom code using SQL Server 2008 
		public static void main(String[] args) {
			
			Connection conn = null;
	        ResultSet rs = null;
	        String url = "jdbc:jtds:sqlserver://127.0.0.1;instance=SQLEXPRESS;DatabaseName=login_DB";
	        String driver = "net.sourceforge.jtds.jdbc.Driver";
	        String userName = "sa";
	        String password = "mumsql";
			try {
	           				
				 Class.forName(driver);
		         conn = DriverManager.getConnection(url, userName, password);
	            Statement stmt = conn.createStatement();
	            stmt.executeUpdate("insert into login values('Raja','Rani')");
	            stmt.executeUpdate("insert into login values('Pari','Ramu')");
	            rs = stmt.executeQuery("select * from login");
	            String i1 = "", i2="";
	            while(rs.next())
	            {
	            	i1 = rs.getString(1);
	            	i2 = rs.getString(2);
	            	System.out.println("User id = " + i1 + " Password =" + i2 );
	            
		 	}
			}
	            catch(Exception e)
	            {
	            	 System.out.println("ERROR: " + e);
	            }
	}
}
