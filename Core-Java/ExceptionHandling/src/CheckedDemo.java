import java.io.FileReader;

public class CheckedDemo {
    static void main(String[] args) {
        FileReader f = new FileReader("harsh.jpg");
        //it get compiled but for javac CheckedDemo.java but at runtime ir will throw at filenot found exception and it is checked excption

    }
}
