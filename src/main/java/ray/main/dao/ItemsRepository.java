package ray.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import ray.main.entity.Items;

public class ItemsRepository {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String JDBC_URL = "jdbc:mysql://localhost:3306/FubukiProject";
	static final String JDBC_USER = "root";
	static final String JDBC_PASSWORD = "root";
	
	public static void insert(Items item) {
		
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		
		try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
			
		    try (PreparedStatement stmt = conn.prepareStatement(
		            "INSERT INTO Items (title, info, submission_date) VALUES (?, ?, ?);") ) {
		    	
		        stmt.setString(1, item.getTitle());
		        stmt.setString(2, item.getInfo());
		        stmt.setTimestamp(3, Timestamp.valueOf( item.getSubmission_date() ) );
		        int rowResult = stmt.executeUpdate();
		        
		    } catch (SQLException e) {
				e.printStackTrace();
			}
		    
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
