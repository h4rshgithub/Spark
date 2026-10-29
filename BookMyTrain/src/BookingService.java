import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Train> trainlist = new ArrayList<>();
    private  List<Ticket> ticketList = new ArrayList<>();

    public BookingService(){
        trainlist.add(new Train(101 , "Rajdhani Express","Delhi" , "Nagpur" , 100  ));
        trainlist.add(new Train(102 , "Ben-Ind SF Express","Bengaluru" , "Indore" , 60  ));
        trainlist.add(new Train(103 , "Basti Interciyt","GOa" , "Basti" , 70  ));
        trainlist.add(new Train(104 , "Vande Bharat Express","Chennai" , "Kashmir" , 80  ));
        trainlist.add(new Train(105 , "Amrit Bharat Express","Kolkata" , "Betul" , 20  ));
        trainlist.add(new Train(106 , "Patna Express","Kota" , "Patna" , 90  ));

    }

}
