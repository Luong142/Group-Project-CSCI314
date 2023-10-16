package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

// it is incomplete for MySQL
public class ConnectionProvider
{
    // override the function connection
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "system", "pass");
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
