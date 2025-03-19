package lab3.src;

import java.util.concurrent.Flow;

public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seatId)
    {
        this.seatId = seatId;
        this.assigned = false;
        this.customerId = -1;
    }

    public int getSeatID()
    {
        return seatId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean isOccupied()
    {
        return assigned;
    }

    public void assign(int cust_id)
    {
        assigned = true;
        customerId = cust_id;
    }

    public void unassign(){
        assigned = false;
        customerId = -1;
    }
}
