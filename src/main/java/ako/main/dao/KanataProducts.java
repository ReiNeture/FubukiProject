package ako.main.dao;

import java.sql.*;

import ako.main.info.ProductsInfo;

public class KanataProducts {
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/FubukiProject";
	static final String USER = "root";
	static final String PASSWORD = "root";
	
	public static void insert(ProductsInfo product) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			try {
				PreparedStatement stmt = conn.prepareStatement(
						"INSERT INTO Products (ProductName, ProductInfo, Price) VALUES (?, ?, ?);");
				stmt.setString(1, product.getName());
				stmt.setString(2, product.getInfo());
				stmt.setInt(3, product.getPrice());
				int row = stmt.executeUpdate();
				
			}
			catch (SQLException e2) {
				e2.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
