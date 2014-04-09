// SQL送信パターン検索系

package chapter09;

import java.sql.*;

public class List9_3 {

	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:derby:rpgdb;create=true");
			/**
			 * メインのDB操作
			 */
			PreparedStatement pstmt = con.prepareStatement
					("SELECT * FROM MONSTERS WHERE HP >= ?");
			pstmt.setInt(1, 10);
			ResultSet rs = pstmt.executeQuery();
			/**
			 * 結果表の処理
			 */
			while(rs.next()) {
				System.out.println(rs.getString("NAME"));
			}
			rs.close();
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
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
