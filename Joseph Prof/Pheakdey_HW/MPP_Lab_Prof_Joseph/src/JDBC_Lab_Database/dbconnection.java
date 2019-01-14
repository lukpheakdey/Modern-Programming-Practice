package JDBC_Lab_Database;
import java.sql.*;

public class dbconnection {
	
	String url = "jdbc:odbc:studentinfo";    
	Connection con;
	Statement stmt;  

	public void Close(){
		try {
			stmt.close();
			con.close();
		} catch(SQLException ex) {
			System.err.println("SQLCloseException: " + ex.getMessage());
		}
	}
	
	public void Connect(){
		try {
			con = DriverManager.getConnection("jdbc:Access:////Users/user/lukpheakdey/eclipse-workspace⁩/MPP_Lab_Prof_Joseph/src/Student_info.mdb");  //used for java 8
		} catch(SQLException ex) {
			System.err.println("SQLConnectException: " + ex.getMessage());
		}
	}
	
	public ResultSet DoQuery (String query){
	    ResultSet rs = null;
		try {
			stmt = con.createStatement();							
	        rs = stmt.executeQuery(query);
			
		} catch(SQLException ex) {
			System.err.println("SQLQueryException: " + ex.getMessage());
		}
		return rs;
	}
	
	public void DoUpdate(String query) {
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException ex) {
			System.err.println("SQLQueryException: " + ex.getMessage());
		}
	}
}
