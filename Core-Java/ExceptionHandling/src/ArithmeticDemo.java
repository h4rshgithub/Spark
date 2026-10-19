public class ArithmeticDemo {
    static void main(String[] args) {
        System.out.println("beforre handling ");
//        int a = 10/0;
        try {
            int a = 10 /0;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }finally {
            System.out.println("Mai finally hu");
        }
        System.out.println("After handling ");

    }
}
