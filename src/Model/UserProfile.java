package Model;

public class UserProfile {
    private String fname;

    private String lname;

    private int age;
    private String gender;
    private int phone;
    private String email;

    private Role role;

    public UserProfile(String fname, String lname, int age, String gender, int phone, String email, Role role)
    {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.role = role;
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
                ", role=" + role +
                '}';
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
