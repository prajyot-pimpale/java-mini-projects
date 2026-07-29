
public class TicketBookingSystem {
    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter(10);

        Thread user1 = new Thread(new BookingThread(counter,4),"User-1");

        Thread user2 =new Thread(new BookingThread(counter,5),"User-2");

        Thread user3 =new Thread(new BookingThread(counter,3),"User-3");

        user1.start();
        user2.start();
        user3.start();
    }
}
