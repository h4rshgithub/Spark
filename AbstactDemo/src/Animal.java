public interface Animal {
    void makeSound();
    void eat();

}
class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog is barking ");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating biscuits ");
    }
}
