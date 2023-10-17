package Model;

import DAO.DbOperation;

public class UserProfile
{
    private int userID;
    private String fname;
    private String lname;
    private int age;
    private String gender;
    private int phone;
    private String email;

    // no need constructor

    public void createUserProfile(String fname, String lname, int age, String gender, int phone, String email)
    {
        String query = "INSERT INTO user(fname, lname, age, gender, phone, email) " +
                "values('"+ fname +"', '"+ lname +"', '"+ age +"', '"+
                gender +"', '"+ phone +"', '"+ email + "')";
        DbOperation.setDataOrDelete(query, "Register successfully! wait for admin approval!");
    }


    @Override
    public String toString()
    {
        return "UserProfile{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +

                '}';
    }

    public int getUserID()
    {
        return userID;
    }

    public void setUserID(int userID)
    {
        this.userID = userID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
