package Model;

public class UserProfile
{
    private int userID;
    private String fname;
    private String lname;
    private int age;
    private String gender;
    private String phone;
    private String email;

    public UserProfile(int userID, String fname, String lname, int age, String gender, String phone, String email)
    {
        this.userID = userID;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
