import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Train> trainlist = new ArrayList<>();
    private  List<Ticket> ticketList = new ArrayList<>();

    public BookingService(){
        trainlist.add(new Train(101 , "Rajdhani Express","Delhi" , "Nagpur" , 100  ));
        trainlist.add(new Train(102 , "Ben-Ind SF Express","Bengaluru" , "Indore" , 60  ));
        trainlist.add(new Train(103 , "Basti Interciyt","Goa" , "Basti" , 70  ));
        trainlist.add(new Train(104 , "Vande Bharat Express","Chennai" , "Kashmir" , 80  ));
        trainlist.add(new Train(105 , "Amrit Bharat Express","Kolkata" , "Betul" , 20  ));
        trainlist.add(new Train(106 , "Patna Express","Kota" , "Patna" , 90  ));

    }
    public List<Train> serachTrain (String src , String dest  ){
        List<Train> res = new ArrayList<>();
        for(Train t : trainlist){
            if(t.getSrc().equalsIgnoreCase(src) && t.getDest().equalsIgnoreCase(dest) ){
                res.add(t);
            }
        }
        return res;
    }
    public Ticket bookTicket(User user , int trainNum , int seatCnt ){
        for(Train t : trainlist){
            if(t.getNumber() == trainNum ){
                if(t.bookSeats(seatCnt)){
                    Ticket ticket = new Ticket(user , t , seatCnt);
                    ticketList.add(ticket);
                    return ticket;
                }else {
                    System.out.println("Mot enough seats available ");
                    return null;
                }
            }
        }
        System.out.println("Train Id Not found ");
        return null;

    }
    public List<Ticket> getTicketbyUser(User user){
        List<Ticket> res = new ArrayList<>();
        for(Ticket t : ticketList){
            if(t.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                res.add(t);
            }
        }
        return res;
    }
    public boolean cancelTicket(int ticketid , User user){
        for(Ticket t : ticketList){
            if(t.getTicketid() == ticketid && t.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                Train train = t.getTrain();
                train.cancelSeats(t.getSeatBooked());
                System.out.println("Ticket " + ticketid + " cancelled Successfully :(");
                return true;
            }
        }
        System.out.println("Ticket does not belong to current user");
        return false;

    }

    public void listOfAllTrains(){
        System.out.println("List of All Trains :");
        for(Train train : trainlist){
            System.out.println(train);
        }
    }
}
