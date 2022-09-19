package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// método para retornar conexções com o banco de dados
	public static Connection openConnection() throws Exception {

		// Nome do DRIVER JDBC para conexção com o banco de dados
		Class.forName("org.postgresql.Driver");

		// abrindo conexção com o banco de dados
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_aula04", "postgres", "coti");

	}

}
