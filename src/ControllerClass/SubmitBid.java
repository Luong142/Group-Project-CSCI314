package ControllerClass;

import Model.Role;

public class SubmitBid
{
    Role staffMember;

    public SubmitBid(Role staffMember)
    {
        this.staffMember = staffMember;
    }

    @SuppressWarnings("finally")  // to suppress the warning of finally block not returning anything
    public boolean checkBid()
    {
        try
        {
            if (this.staffMember == Role.CAFE_STAFF)
            {
                // allow to submit
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            return false;
        }
    }

    @SuppressWarnings("finally")  // to suppress the warning of finally block not returning anything
    @Deprecated  // this method is deprecated because it is not used anywhere.
    public boolean checkBid(Role staffMember)
    {
        try {
            if (this.staffMember == staffMember) {
                // allow to submit
                return true;
            } else {
                return false;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }


}
