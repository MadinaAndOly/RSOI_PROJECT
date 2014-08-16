package rsoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/**
 * Created by madina on 11.05.14.
 */
public class ConnectionDB {

   /* public static  Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/rsoi_Planning", "root", "root");

            
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }*/
    private Properties properties;

    private static ConnectionDB connectionFactory = null;
    private ConnectionDB() {
        try {
            properties = PropertiesLoader.loadProperties("resources/db.properties");
            Class.forName(properties.getProperty("driverClassName"));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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

    public static ConnectionDB getInstance() {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionDB();
        }
        return connectionFactory;
    }


}
