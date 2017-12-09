import java.util.Scanner;

public class masodfoku_egyenlet {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Kérek 3 számot a másodfokú egyenlethez");
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        reader.close();

        double discriminant = Math.sqrt(b * b - 4 * a * c);

        if (Double.isNaN(discriminant)) {
            System.out.println("Nincs valós gyök");
            System.exit(1);
        } else {
            double gyok1 = 0 - (b + discriminant / (2 * a));
            double gyok2 = b - discriminant / (2 * a);
            System.out.println("Az első gyök: " + gyok1);
            System.out.println("A második gyök: " + gyok2);
        }
    }
}
