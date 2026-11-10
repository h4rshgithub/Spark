public class ChildparentException {
    static void main(String[] args) {
        String name = null;
        try {
            int len = name.length();

        }
        catch (NullPointerException e){
            System.out.println("nullpointer exception ");
        }
        catch (Exception  e){
            System.out.println("Exception");
        }
        // in hiercahry child will be at top and parent will be at bottom
    }
}
