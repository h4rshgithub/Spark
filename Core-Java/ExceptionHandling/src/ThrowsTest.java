import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsTest {
    static void main(String[] args) {
      try {
          m1();

      }catch (FileNotFoundException e ){
          System.out.println("File not exist ");
      }
      catch (Exception e1){
          System.out.println(e1.toString());
      }
      finally {
          System.out.println("Finally");
      }
    }
    public static void m1() throws FileNotFoundException{
        m2();
        System.out.println("Hi i am m1 ");
    }
    public static void m2() throws FileNotFoundException{
        m3();
        System.out.println("Hi i am m2 ");
    }
    public static void m3() throws FileNotFoundException {
        FileReader  f1 = new FileReader("harsh.txt");

    }
}
