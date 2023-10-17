package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// for database, this is just a test, take a look how CRUDS perform in these entity classes
@SuppressWarnings("ALL") // suppress warnings for all methods in this class

public class UserDAO {
    public Connection conn;

    public UserDAO() {
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false", "root", "123456");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public boolean createUser(String profile, String fname, String lname, String phone, String email, String password, String dob) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(dob);
            String mysqlDate = new SimpleDateFormat("yyyy-MM-dd").format(date);

            String sql = "INSERT INTO " + profile + " (fname, lname, phone, email, password, dob) " +
                    "VALUES ('" + fname + "', '" + lname + "', '" + phone + "', '" + email + "', '" + password + "', '" + mysqlDate + "')";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Map<String, String> getAccount(String profile, String phone)
    {
        Map<String, String> account = new HashMap<>();

        try {
            String sql = "SELECT * FROM " + profile + " WHERE phone = '" + phone + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                account.put("fname", rs.getString("fname"));
                account.put("lname", rs.getString("lname"));
                account.put("phone", rs.getString("phone"));
                account.put("email", rs.getString("email"));
                account.put("password", rs.getString("password"));
                account.put("dob", rs.getString("dob"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return account;
    }

    public boolean updateUser(String profile, String fname, String lname, String phone, String email, String password, String dob, String status, String oldPhone) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(dob);
            String mysqlDate = new SimpleDateFormat("yyyy-MM-dd").format(date);

            String sql = "UPDATE " + profile + " SET fname = '" + fname + "', lname = '" + lname + "', email = '" + email + "', dob = '" + mysqlDate + "', password = '" + password + "', phone = '" + phone + "', status = '" + status + "' WHERE phone = '" + oldPhone + "'";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Map<String, String> getAllAccount(String profile) {
        Map<String, String> accounts = new HashMap<>();

        try {
            String sql = "SELECT * FROM " + profile;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                accounts.put(phone, email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return accounts;
    }
}

