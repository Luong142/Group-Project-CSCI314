package EntityClass;

public class Bid
{
    private Role staffMember; // strictly staff

    private UserProfile staff;
    private int bidID;
    private boolean isAvailable;

    public Bid(Role staffMember, int bidID, boolean isAvailable, UserProfile staff)
    {
        this.staffMember = staffMember;
        this.bidID = bidID;
        this.isAvailable = isAvailable;
        this.staff = staff;
    }

    // a function that help staff to submit the bid and await for their approval or rejection
    public void submitBid()
    {
        try
        {
            if (this.staffMember == Role.STAFF)
            {
                // allow to submit
                System.out.println("Bid Submitted");
            }
            else
            {
                System.out.println("retry");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void viewBid()
    {

    }

    @Override
    public String toString()
    {
        return "Bid{" +
                "staffMember=" + staffMember +
                ", staff=" + staff +
                ", bidID=" + bidID +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public Role getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(Role staffMember) {
        this.staffMember = staffMember;
    }

    public UserProfile getStaff() {
        return staff;
    }

    public void setStaff(UserProfile staff) {
        this.staff = staff;
    }

    public int getBidID() {
        return bidID;
    }

    public void setBidID(int bidID) {
        this.bidID = bidID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
