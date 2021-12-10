package ako.main.dao;

import java.sql.*;
import java.util.ArrayList;

import ako.main.info.ProductsInfo;

public class KanataProducts {
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/FubukiProject";
	static final String USER = "root";
	static final String PASSWORD = "root";
	
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void insert(ProductsInfo product) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			stmt = conn.prepareStatement(
					"INSERT INTO Products (ProductName, ProductInfo, Price) VALUES (?, ?, ?);");
			stmt.setString(1, product.getName());
			stmt.setString(2, product.getInfo());
			stmt.setInt(3, product.getPrice());
			int row = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		}
	}
	
	public static ArrayList<ProductsInfo> query() {
		ArrayList<ProductsInfo> list = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ProductsInfo product = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			stmt = conn.prepareStatement(
					"SELECT Id, ProductName, ProductInfo, Price FROM products;");
			rs = stmt.executeQuery();
			
			if (rs == null)
				return null;
			
			list = new ArrayList<>();
			while (rs.next()) {
				product = new ProductsInfo();
				product.setId(rs.getInt("Id"));
				product.setName(rs.getString("ProductName"));
				product.setInfo(rs.getString("ProductInfo"));
				product.setPrice(rs.getInt("Price"));
				list.add(product);
			}
			product = null;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				if(rs != null)
					rs.close();
				
				if(stmt != null)
					stmt.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		}
		return list;
	}
	
	public static ProductsInfo queryId(int Id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ProductsInfo product = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			stmt = conn.prepareStatement(
					"SELECT Id, ProductName, ProductInfo, Price FROM products WHERE Id = ?;");
			stmt.setInt(1, Id);
			rs = stmt.executeQuery();
			
			if (rs == null)
				return null;
			
			while (rs.next()) {
				product = new ProductsInfo();
				product.setId(rs.getInt("Id"));
				product.setName(rs.getString("ProductName"));
				product.setInfo(rs.getString("ProductInfo"));
				product.setPrice(rs.getInt("Price"));
			}
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				if(rs != null)
					rs.close();
				
				if(stmt != null)
					stmt.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		}
		return product;
	}
}
