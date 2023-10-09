package EntityClass;

public class UserProfile
{
    private String name;
    private int age;
    private String gender;
    private int phone;
    private String email;

    public UserProfile(String name, int age, String gender, int phone, String email)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    // setter
    void setEmail(String email)
    {
        this.email = email;
    }

    void setName(String name)
    {
        this.name = name;
    }

    void setAge(int age)
    {
        this.age = age;
    }

    void setGender(String gender)
    {
        this.gender = gender;
    }

    void setPhone(int phone)
    {
        this.phone = phone;
    }

    String getName(String name)
    {
        return name;
    }

    String getGender(String gender)
    {
        return gender;
    }

    String getEmail(String email)
    {
        return email;
    }

    int getAge(int age)
    {
        return age;
    }
}
