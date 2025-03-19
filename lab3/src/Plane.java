package lab3.src;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seats;
    private int numEmptySeat = 12;

    public Plane(){
        seats = new PlaneSeat[numEmptySeat];
        for(int i = 0; i < 12; i++)
        {
            seats[i] = new PlaneSeat(i + 1);
        }
    }

    private PlaneSeat[] sortSeats(){
        PlaneSeat[] sortedSeats = Arrays.copyOf(seats, seats.length);
        Arrays.sort(sortedSeats, Comparator.comparingInt(PlaneSeat::getCustomerId));
        return sortedSeats;
    }

    public void showNumEmptySeats(){
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats(){
        System.out.println("The following seats are empty");
        for(PlaneSeat seat : seats){
            if(!seat.isOccupied())
            {
                System.out.println("SeatID " + seat.getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId){
        PlaneSeat[] sortedSeats = bySeatId ? seats: sortSeats();
        System.out.println("The seat assignments are as follows: ");
        for(PlaneSeat seat: sortedSeats){
            if (seat.isOccupied()){
                System.out.println("SeatID " + seat.getSeatID() + " assigned to CustomerID " + seat.getCustomerId());
            }
        }
    }

    public void assignSeat(int SeatId, int cust_id){
        if(SeatId < 1 || SeatId > 12 || seats[SeatId - 1].isOccupied()){
            System.out.println("Seat already assigned to customer");
        }
        else{
            seats[SeatId - 1].assign(cust_id);
            numEmptySeat--;
            System.out.println("Seat Assigned!");
        }
    }

    public void unAssignSeat(int seatId)
    {
        if(seatId < 1 || seatId > 12 || !seats[seatId - 1].isOccupied()){
            System.out.println("Seat is already empty.");
        }
        else{
            seats[seatId - 1].unassign();
            numEmptySeat++;
            System.out.println("Seat Unassigned!");
        }
    }
}
