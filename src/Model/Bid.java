package Model;

public class Bid
{
    private UserProfile staff;
    private int bidID;
    private boolean isAvailable;

    public Bid(int bidID, boolean isAvailable, UserProfile staff)
    {
        this.bidID = bidID;
        this.isAvailable = isAvailable;
        this.staff = staff;
    }

    // this function should be in submit bid


    public void viewBid()
    {

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
