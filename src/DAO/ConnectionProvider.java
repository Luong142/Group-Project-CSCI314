package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

// it is incomplete for MySQL
public class ConnectionProvider
{
    // try to log into the mySQL cmd prompt
    public static Connection getCon()
    {
        try
        {
            // use this function to connect with the database
            Class.forName("com.mysql.jdbc.Driver");
            //  login into this database
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false", "root", "123456");
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
