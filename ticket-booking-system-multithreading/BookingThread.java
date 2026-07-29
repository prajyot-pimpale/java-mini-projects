
class BookingThread implements Runnable {

    private TicketCounter counter;
    private int seats;

    public BookingThread(TicketCounter counter,int seats) {
        this.counter = counter;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(seats);
    }
}