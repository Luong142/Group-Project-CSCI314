package Model;

// note that individual roles like cafe manager or system admin are not classes.
// instead they are the role as an attribute string data type.
public class Login extends UserProfile
{
    private String username;
    private String password;
    // private Role role; // user type
    private UserProfile userProfile;

    public Login(String username, String password, UserProfile userProfile)
    {
        this.username = username;
        this.password = password;
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


    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

}
