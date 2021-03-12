package registocampismo.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
	
	private final static DbConfig instance = null;
	
	private DbConfig() {
		Connection connection = null;
		String executionPath = System.getProperty("user.dir");
		String dbUrl = "jdbc:sqlite:" + executionPath + "/db/registocampismo.db";
		
		try {
			connection = DriverManager.getConnection(dbUrl);
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
