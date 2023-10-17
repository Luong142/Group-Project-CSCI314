package Model;

// note that individual roles like cafe manager or system admin are not classes.
// instead they are the role as an attribute string data type.
public class UserAccount
{
    private String username;
    private String password;
    private Role role; // user type

    private UserProfile userProfile;

    public UserAccount(String username, String password, Role role, UserProfile userProfile)
    {
        this.username = username;
        this.password = password;
        this.role = role;
        this.userProfile = userProfile;
    }

    public void setUserProfile(UserProfile userProfile)
    {
        this.userProfile = userProfile;
    }

    public UserProfile getUserProfile()
    {
        return userProfile;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public Role getRole()
    {
      return role;
    }
}
