public class CatchSkip {
    static void main(String[] args) {
        try {
            System.out.println("Hi I  am try ");
        }
        catch (Exception e){
            System.out.println(" Hi as there is no eroor in try block i catch will get skipped ");
        }
        finally{
            System.out.println("mai to finally hu hamesha he chalunga ");
        }
    }
}
