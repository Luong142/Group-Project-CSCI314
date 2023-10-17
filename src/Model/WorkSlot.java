package Model;

public class WorkSlot
{
    private UserProfile staff;
    private String startTime;
    private String endTime;
    private String date; // this can be a class
    private String status;
    private String slotID;



    public UserProfile getStaff() {
        return staff;
    }

    public void setStaff(UserProfile staff) {
        this.staff = staff;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSlotID() {
        return slotID;
    }

    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }
}
