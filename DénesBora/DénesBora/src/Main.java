public class Main {
    private static void kiirBor(Bor bor) {
        System.out.println(bor);
    }


    public static void main(String[] args) {

        Bor[] pince = new Bor[2];
        int n = 0;

        for (int i = 0; i < args.length; i++) {
            if ( args[i].equals("Aszu") ) {
                pince[n] = new Aszu(Integer.parseInt(args[i+1]), Integer.parseInt(args[i+2]));
                i+=3;
                n++;
            } else {
                pince[n] = new Bor(args[i], Integer.parseInt(args[i+1]));
                i+=2;
                n++;
            }
        }
        for(Bor bor: pince) {
            System.out.println(bor);
        }

    }

}
