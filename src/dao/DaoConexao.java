package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConexao {
	public Connection getConexao() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CatalogoLivros",
				"postgres", "postgres");

		return connection;
	}
}
