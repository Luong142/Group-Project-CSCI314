package DAO;

import javax.swing.JOptionPane;

// the purpose is to automatically create table, unrelated to use cases.
public class Tables
{
    public static void main(String [] args)
    {
        try
        {
            // user profile
            String userProfileTable =
                    "create table user(id int AUTO_INCREMENT primary key, " +
                            "fname varchar(200), lname varchar(200), " +
                            "age int, gender varchar(200), phone varchar(200), email varchar(200))";
                            // foreign key to role table
            //  ", role_id INT, FOREIGN KEY (role_id) REFERENCES roles(id))"

            String userAccountTable = "create table account(id int AUTO_INCREMENT primary key, "; // continue here

            DbOperation.setDataOrDelete(userProfileTable, "User Table created successfully!");

            // DbOperation.setDataOrDelete(userAccountTable, "Account Table created successfully!");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);;
        }
    }
}
