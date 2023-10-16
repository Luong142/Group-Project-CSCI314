package Model;

public class UserProfile
{
    private String name;
    private int age;
    private String gender;
    private int phone;
    private String email;

    private Role role;

    public UserProfile(String name, int age, String gender, int phone, String email, Role role)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.role = role;
    }

    public boolean isSystemAdmin()
    {
        return this.role == Role.SYSTEM_ADMIN;
    }

    public boolean isStaffMember()
    {
        return this.role == Role.STAFF;
    }



    @Override
    public String toString()
    {
        // later we change to better format
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
