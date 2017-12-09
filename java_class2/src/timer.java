import com.sun.org.apache.xpath.internal.SourceTree;

public class timer {
    public static void main(String[] args) {
        if ( args.length != 4) {
            System.err.println("2 óra és perc értékre van szükségem az összehasonlításhoz");
            System.exit(1);
        }

        for( int i=0; i < args.length; i++) {
             try {
                 Integer.parseInt(args[i]);
             } catch (NumberFormatException e) {
                 System.out.println("A megadott paraméter nem szám");
                 System.exit(1);
             }
        }

        int firstHour = Integer.parseInt(args[0]);
        int secondHour = Integer.parseInt(args[2]);
        int firstMinute = Integer.parseInt(args[1]);
        int secondMinute = Integer.parseInt(args[3]);

        if ( firstHour > 23 || firstHour < 0 ) {
            System.out.println("Az első megadott óra nem megfelelő");
            System.exit(1);
        }
        if ( secondHour > 23 || secondHour < 0) {
            System.out.println("A második megadott óra nem megfelelő");
            System.exit(1);
        }
        if ( firstMinute > 59 || firstMinute < 0) {
            System.out.println("Az első megadott perc érték nem megfelelő");
            System.exit(1);
        }
        if ( secondMinute > 59 || secondMinute < 0) {
            System.out.println("A második megadott perc érték nem megfelelő");
            System.exit(1);
        }

        int hourPassed = secondHour - firstHour;
        int minutePassed = secondMinute - firstMinute;

        if (hourPassed < 0) {
            hourPassed =  24 + hourPassed;
        }

        if (minutePassed < 0 ) {
            hourPassed -= 1;
            minutePassed = 60 + minutePassed;
        }

        System.out.println("Az eltelt idő: " + hourPassed + "óra " + minutePassed + "perc.");
    }
}
