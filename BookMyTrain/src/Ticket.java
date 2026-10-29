public class Ticket {

    private  int ticketid ;
    private User user;
    private  Train train;
    private int seatBooked;
    private static int counter = 1001;


    public Ticket( User user, Train train, int seatBooked) {
        this.ticketid = counter++;
        this.user = user;
        this.train = train;
        this.seatBooked = seatBooked;
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Ticket.counter = counter;
    }

    @Override
    public String toString() {
        return "PNR : " + ticketid + " | Train : " + train.getName() + " | Route : "+ train.getSrc() + " to " + train.getDest()
                + "| Seats Booked :" + seatBooked + " | Booked by : "  + user.getFullname() ;


    }


}
