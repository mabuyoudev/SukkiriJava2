// 練習9-1

package chapter09;

import java.sql.*;

public class Item {
	private String name;
	private int price;
	private int weight;
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getWeight() {
		return this.weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Item(String name) {
		ResultSet rs = getFromDb(name);
		
		try {
			this.name	= rs.getString("NAME");
			this.price	= rs.getInt("PRICE");
			this.weight	= rs.getInt("WEIGHT");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private ResultSet getFromDb(String name) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:derby:rpgdb;create=true");
			PreparedStatement pstm = con.prepareStatement
					("SELECT * FROM ITEMS WHERE NAME = ?");
			pstm.setString(1, name);
			ResultSet rs = pstm.executeQuery();
			pstm.close();
			return rs;
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


