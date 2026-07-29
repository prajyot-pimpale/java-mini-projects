class TicketCounter {

    private int availableSeats;

    public TicketCounter(int seats) {
        this.availableSeats = seats;
    }

    public synchronized void bookTicket(int seats) {

        System.out.println(Thread.currentThread().getName()+ " trying to book "+ seats + " seats");

        if (availableSeats >= seats) {
            System.out.println("Booking successful for "+ Thread.currentThread().getName());
            availableSeats -= seats;
            System.out.println("Remaining Seats : "+ availableSeats);
        }else{
            System.out.println("Booking failed for "+ Thread.currentThread().getName());
            System.out.println("Available Seats : "+ availableSeats);
        }
        System.out.println();
    }
}