package dv;

import java.sql.*;

public class DBConnection {
	 private static final String URL = "jdbc:sqlserver://DESKTOP-JL615BG:1433;databaseName=dvl;integratedSecurity=true;encrypt=false";
	    
	    // Method to get a connection
	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL);
	    }
	    
	    public static ResultSet getAuthors() throws SQLException {
	        String query = "SELECT * FROM users";
	        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
	            return stmt.executeQuery(query);
	        }
	    }
}
