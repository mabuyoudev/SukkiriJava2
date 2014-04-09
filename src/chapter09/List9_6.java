// 基本パターンコード（トランザクション利用時）

package chapter09;

import java.sql.*;

public class List9_6 {

	public static void main(String[] args) {
		// STEP 0: 事前準備
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		
		try {
			// STEP 1: データベースの接続
			con = DriverManager.getConnection
					("jdbc:derby:rpgdb;create=true");
			con.setAutoCommit(false);
			con.commit();
		} catch(SQLException e) {
			try {
				con.rollback();
			} catch(SQLException e2) {
				e2.printStackTrace();
			} finally {
				if(con != null) {
					try {
						con.close();
					} catch(SQLException e3) {
						e3.printStackTrace();
					}
				}
			}
		}
	}

}
