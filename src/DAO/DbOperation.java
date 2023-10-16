package DAO;

import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.Connection;

public class DbOperation
{
    // start from here
    public static void setDataOrDelete(String query, String msg)
    {
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.execute(query);

            // validation for the msg.
            if (!msg.equals(""))
            {
                JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
                st.close();
                con.close();

            }
        }

        // display error if there is any problem with database
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null , e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

}
