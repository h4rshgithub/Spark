public class ScorpioNeo extends Vehicle{


    ScorpioNeo(String brand) {
        super(brand);
    }

    @Override
    void start() {

    }

    static void main(String[] args) {
        Vehicle v = new Vehicle("Neo") ; // cannot do it
    }
}
