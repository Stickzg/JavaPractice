public class Singletonee {

    private static Singletonee thisInstance;

    public static Singletonee getThisInstance () {
        if ( thisInstance == null ) {
            thisInstance = new Singletonee();
        }
        return thisInstance;
    }

    private Singletonee(){
        System.out.println("LLétrejövök");
    }

}
