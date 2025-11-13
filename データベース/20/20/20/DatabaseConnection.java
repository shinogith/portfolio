import java.sql.*;

public class DatabaseConnection {
	private final String JDBC_FQCN = "org.h2.Driver";
	private final String JDBC_URL = "jdbc:h2:~/omdb";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";

	private Connection con = null;

	public Connection getConnection() {
		try {
			Class.forName(JDBC_FQCN);
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}

		try {
			con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void close() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
