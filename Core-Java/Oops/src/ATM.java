public class ATM {
    String name ;
    int balance ;
    ATM (String name ,int bal){
        this.name = name ;
        this.balance = bal;

    }
    void showbalance(){
        System.out.println("Your balance is  : " + balance);
    }
    static void main(String[] args) {
        ATM a1 = new ATM("harsh" , 18000);
        a1.showbalance();

    }
}
