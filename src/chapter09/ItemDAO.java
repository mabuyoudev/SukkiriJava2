// 練習9-2

package chapter09;

import java.sql.*;
import java.util.*;

public class ItemDAO {
	public static ArrayList<Item> findByMinimumPrice(int price) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:derby:rpgdb;create=true");
			PreparedStatement pstmt = con.prepareStatement
					("SELECT * FROM ITEMS WHERE PRICE >= ?");
			pstmt.setInt(1, price);
			ResultSet rs = pstmt.executeQuery();
			
			ArrayList<Item> items = new ArrayList<>();
			
			while(rs.next()) {
				Item item = new Item(rs.getString("NAME"));
				items.add(item);
			}
			
			return items;
			
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
