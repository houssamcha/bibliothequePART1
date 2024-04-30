package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {
	private static Connection connection;

    static {
        String url="jdbc:postgresql://localhost:5432/bibliotheque";
        String username="postgres";
        
        String password="1999";

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url,username,password);


        } catch (Exception e) {
            
            e.printStackTrace();
    }

    }

    public static Connection getConnection() {
      
        return connection;
    }
}