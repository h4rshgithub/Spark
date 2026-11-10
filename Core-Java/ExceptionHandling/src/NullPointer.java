public class NullPointer {
    static void main(String[] args) {
        String name = null;
        try {
            int len = name.length();

        }
        catch (NullPointerException e){
            System.out.println("nullpointer exception ");
        }

    }
}
