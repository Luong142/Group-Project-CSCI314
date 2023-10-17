package DAO;

import Model.*;

public class UserDao
{
    // for user profile
    public static void save(UserProfile userProfile)
    {
        String query = "INSERT INTO user(fname, lname, age, gender, phone, email) " +
                "values('"+ userProfile.getFname() +"', '"+ userProfile.getLname() +"', '"+ userProfile.getAge() +"', '"+
                userProfile.getGender() +"', '"+ userProfile.getPhone() +"', '"+ userProfile.getEmail() +"')";

    }

    // for user account, overload the method
    public static void save(UserAccount userAccount)
    {
        String query = "";
    }


}
