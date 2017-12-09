import java.util.Scanner;

public class divideable_by_2_or_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kérek egy számot");
        int n = reader.nextInt();
        reader.close();

        if ( n % 2 == 0 && n % 3 ==0) {
            System.out.println("A szám oszható 2-vel és 3-al.");
        } else if ( n % 2 == 0) {
            System.out.println("A szám osztható 2-vel.");
        } else if ( n % 3 == 0) {
            System.out.println("A szám osztható 3-al.");
        } else {
            System.out.println("A szám nem osztható 2-vel vagy 3-al.");
        }
    }
}
