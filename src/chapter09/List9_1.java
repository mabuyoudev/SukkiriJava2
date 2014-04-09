// JDBCを操作する基本パターン

package chapter09;

import java.sql.*;

public class List9_1 {

	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			// STEP 1: データベースの接続
			con = DriverManager.getConnection(
					"jdbc:derby:rpgdb;create=true");
			
			// STEP 2: SQL送信処理
			/**
			 * メインのDB操作
			 */
			// STEP2 1-1 送信すべきSQLのひな形を作成
			PreparedStatement pstmt = con.prepareStatement
					("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
			
			// STEP2 1-2 ひな形に値を流し込みSQLを組み立てる
			pstmt.setInt(1, 10);
			pstmt.setString(2, "ゾンビ");
			int r = pstmt.executeUpdate();
			
			// STEP2 1-3 処理結果を判定する
			if(r != 0) {
				System.out.println(r + "件のモンスターを削除しました");
			} else {
				System.out.println("該当するモンスターはいませんでした");
			}
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			// STEP 3: データベース接続の切断
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
