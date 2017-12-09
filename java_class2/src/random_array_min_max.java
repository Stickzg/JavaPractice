import java.util.Random;

public class random_array_min_max {
    public static void main(String[] args) {

        Random rand = new Random();

        int  n = rand.nextInt(50) + 1;

        int[] tomb = new int[100];

        for(int i = 0; i <  tomb.length; i++) {
            tomb[i] = (int)(Math.random()*50+1);
        }
        int min = tomb[0];
        int max = tomb[0];

        for ( int i = 0; i < tomb.length; i++) {
            if (tomb[i] > max ) {
                max = tomb[i];
            } if (tomb[i] < min) {
                min = tomb[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}