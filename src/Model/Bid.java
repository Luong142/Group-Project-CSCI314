package Model;

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

    // this function should be in submit bid


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
