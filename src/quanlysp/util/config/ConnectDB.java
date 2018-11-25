package util.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

	private static Connection conn = null;

	public ConnectDB() {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/quanlysanpham";
			String user = "tuananh99";
			String password = "1999";
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("Kết nối CSDL SQL Server thành công!");
			}

		} catch (ClassNotFoundException ex) {
			System.out.println(ex.toString());
			System.out.println("Lỗi" + ex.getMessage());
		} catch (SQLException ex) {
			System.out.println(ex.toString());
			System.out.println("Lỗi :" + ex.getMessage());
		}
	}

	// Thực thi câu lệnh SELECT
	public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
			return rs;
		} catch (SQLException ex) {
			System.out.println(ex.toString());
			System.out.println("Truy vấn thất bại");

		}

		return null;
	}

	// Thực thi INSERT, DELETE, UPDATE
	public void ExcuteQueryUpdateDB(String cauTruyVanSQL) {

		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(cauTruyVanSQL);
		} catch (SQLException ex) {
			System.out.println(ex.toString());
			System.out.println("Truy vấn thất bại");
		}
	}

}
