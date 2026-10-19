public class Car {
    int speed ;
    int model;
    String color;

    public void run(){
        System.out.println("car is running at : " + speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setSpeed(100);
        c1.model = 2005;
        c1.run();
        c1.model = 2005;
        System.out.println("model of car is :  "+ c1.model);
    }
}
