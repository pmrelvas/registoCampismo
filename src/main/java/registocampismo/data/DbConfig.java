package registocampismo.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
	
	private final static DbConfig instance = null;
	
	private static final String DB_URL = "jdbc:sqlite:./registos_campismo.db";
	
	private DbConfig() {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(DB_URL);
			System.out.println("Successfuly connected to the DB");
		} catch (Exception e) {
			System.out.println("Error connecting to the DB: " + e.getMessage());
		}
		
	}
	
	public static DbConfig getInstance() {
		if (instance == null) {
			return new DbConfig();
		}
		return instance;
	}
	
	

}
