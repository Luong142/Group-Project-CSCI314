package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class LoginModel extends UserDAO {
    private String profile;
    private String uid;
    private String pass;

    public LoginModel(String profile, String uid, String pass) {
        this.profile = profile;
        this.uid = uid;
        this.pass = pass;
    }

    public Map<String, String> getPhoneAndPass(String profile) {
        Map<String, String> phoneAndPass = new HashMap<>();

        try {
            String sql = "SELECT phone, password FROM " + profile + " WHERE status = 'active'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                phoneAndPass.put(phone, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return phoneAndPass;
    }

    public boolean checkUser() {
        String found = "not found";

        Map<String, String> phoneAndPass = getPhoneAndPass(profile);
        for (Map.Entry<String, String> entry : phoneAndPass.entrySet()) {
            String phone = entry.getKey();
            String password = entry.getValue();

            if (uid.equals(phone))
            {
                found = "found";
            }
            else if (pass.equals(password))
            {
                //
            }

        }
        return found.equals("found");
    }
}
