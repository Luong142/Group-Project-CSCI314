package EntityClass;

public class UserAccount
{
    private String username;
    private String password;
    private String role;

    public UserAccount(String username, String password, String role)
    {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    void setUsername(String username)
    {
        this.username = username;
    }

    void setPassword(String password)
    {
        this.password = password;
    }

    void setRole(String role)
    {
        this.role = role;
    }

    String getUsername()
    {
        return username;
    }

    String getPassword()
    {
        return password;
    }

    String getRole()
    {
      return role;

    }
}
