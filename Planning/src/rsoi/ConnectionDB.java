package rsoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/**
 * Created by madina on 11.05.14.
 */
public class ConnectionDB {

    private Properties properties;

    private static ConnectionDB connectionFactory = null;
    private ConnectionDB() throws Exception {
        try {
            properties = PropertiesLoader.loadProperties("resources/db.properties");
            Class.forName(properties.getProperty("driverClassName"));

        } catch (ClassNotFoundException e) {
            throw new Exception(e);
        }
    }

    public Connection getConnection() throws Exception {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(properties.getProperty("connectionURL"), properties.getProperty("user"), properties.getProperty("pwd"));
        } catch (Exception e) {
        throw new Exception(e);
        }
        return conn;
    }

    public static ConnectionDB getInstance() throws Exception {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionDB();
        }
        return connectionFactory;
    }


}
