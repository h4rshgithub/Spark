package FunctionalInterface;

@FunctionalInterface
public interface Calc  {
    int add(int a , int b );
}
// Befor java 1.8
//class Child  implements Calc{
//
//    @Override
//    public int add(int a, int b) {
//        return 0;
//    }
//}

//after java 1.8



class Driver{
    static void main(String[] args) {
        Calc ops =(a,b) -> a+b;
        System.out.println(ops.add(4,5));
    }
}
