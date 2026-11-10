import java.util.*;
public class DLTest {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int age = sc.nextInt();
        try{
            eligible(age);
        }catch (CanNotDriveException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("thanks for applying for DL ");
        }


    }
    public static void eligible(int age) throws CanNotDriveException{
        if(age < 18){
            throw new CanNotDriveException("Not eligible for DL ");
        }
        System.out.println("Can apply for Dl ");
    }
}
