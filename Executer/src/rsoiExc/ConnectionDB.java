package rsoiExc;

import java.sql.*;

/**
 * Created by madina on 12.05.14.
 */
public class ConnectionDB {
    public static Statement getStatement() {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/rsoi_Executor", "root", "root");
            statement = connection.createStatement();

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

}
