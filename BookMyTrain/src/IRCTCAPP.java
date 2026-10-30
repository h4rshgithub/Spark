import java.util.List;
import java.util.Scanner;

public class IRCTCAPP {
    private final Scanner sc = new Scanner(System.in);
    private final UserService userService = new UserService();
    private  final BookingService bookingService = new BookingService();

    public static void main(String[] args) {
        new IRCTCAPP().start();


    }
    public  void start(){
        while (true){
            System.out.println("----Welcome to  IRCTC App----");
            if(!userService.isLogin()){
                System.out.println(" 1- Register new User");
                System.out.println(" 2- Login ");
                System.out.println(" 3- Exit");
                System.out.println("Enter your choice : ");

                int choice = sc.nextInt();
                switch (choice){
                    case 1 -> register();
                    case 2 -> login();
                    case 3 -> exitApp();
                    default -> System.out.println("Invalid Choice");
                }
            }else {
                showUserMenu();
            }
        }
    }
    public void register(){
        System.out.println("Enter username : ");
        String username = sc.next();
        System.out.println("Enter Password :");;
        String password = sc.next();
        System.out.println("Enter Full Name : ");
        sc.nextLine();
        String fullName = sc.nextLine();
        System.out.println("Enter Contact :");
        String contact = sc.next();
        userService.registerUser(username , password , fullName , contact);
        userService.loginUser(username , password);
        showUserMenu();


    }
    public  void login(){
        System.out.println("Enter Username :");
        String username = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();

        userService.loginUser(username, password);
    }
    private void exitApp(){
        System.out.println("Thank You for using IRCTC APP");
        System.exit(0);
    }
    public  void showUserMenu(){
        while(userService.isLogin()){
            System.out.println("-----User Menu ----");
            System.out.println("1- Search Trains");
            System.out.println("2- Book Tickets ");
            System.out.println("3- View my Tickets ");
            System.out.println("4 - Cancel Ticket");
            System.out.println("5 - View All Trains");
            System.out.println("6 - LogOut");
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1 -> searchTrain();
                case 2 -> bookTicket();
                case 3 -> viewAllTicket();
                case 4 -> cancelTicket();
                case 5 -> bookingService.listOfAllTrains();
                case 6 -> userService.logoutUser();
                default -> System.out.println("Invalid Choice ");
            }

        }
    }
    private void searchTrain(){
        System.out.println("Enter Source station : ");
        String src = sc.next();
        System.out.println("Enter Desination station :");
        String dest = sc.next();

        List<Train> trains = bookingService.serachTrain(src , dest );
        if(trains.isEmpty()){
            System.out.println("No Trains Found b/w " + src + " and " + dest);
            return ;
        }
        System.out.println("Trains Found :");
        for(Train t : trains){
            System.out.println(t);
        }
        System.out.println("Do you want to book ticket ? (yes/no)");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Enter Train no to book : ");
            int trainNo = sc.nextInt();
            System.out.println("Enter no of seats :");
            int seats = sc.nextInt();
            Ticket ticket = bookingService.bookTicket(userService.getCurrentUser() ,trainNo , seats );
            if(ticket != null){
                System.out.println("Booking Sucessfull ");
                System.out.println(ticket);
            }

        }else {
            System.out.println("Returning to user menu...");
        }

    }
    private void bookTicket(){
        System.out.println("Enter Source station : ");
        String src = sc.next();
        System.out.println("Enter Desination station :");
        String dest = sc.next();

        List<Train> trains = bookingService.serachTrain(src , dest );
        if(trains.isEmpty()){
            System.out.println("No Trains Found b/w " + src + " and " + dest);
            return ;
        }
        System.out.println("Available Trains ");
        for(Train t : trains){
            System.out.println(t);
        }
        System.out.println("Enter Train number to book : ");
        int trainNo = sc.nextInt();
        System.out.println("Enter no of seats :");
        int seats = sc.nextInt();
        Ticket ticket = bookingService.bookTicket(userService.getCurrentUser() ,trainNo , seats );
        if(ticket != null){
            System.out.println("Booking Sucessfull ");
            System.out.println(ticket);
        }
    }
    private void viewAllTicket(){
        List<Ticket> ticket = bookingService.getTicketbyUser(userService.getCurrentUser());
        if(ticket.isEmpty()){
            System.out.println("No tickets found ");
        }
        else{
            System.out.println("Yours Ticket :");
            for( Ticket t: ticket){
                System.out.println(t);
            }
        }
    }
    private void  cancelTicket(){
        System.out.println("Enter Ticket ID to cancel :");
        int ticketid = sc.nextInt();
        bookingService.cancelTicket(ticketid , userService.getCurrentUser());

    }



}
