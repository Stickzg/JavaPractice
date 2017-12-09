public class matrix {
    public static void main(String[] args) {
        int tomb[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};

        for (int i = 0; i <= tomb.length - 1; i++) {
            for (int j = 0; j <= tomb[i].length - 1; j++) {
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();
        }
        int n = 0;
        int tomb2[][];
        tomb2 = new int[10][10];

        for (int i = 0; i < tomb2.length; i++) {
            for (int j = 0; j < tomb2[i].length; j++) {
                tomb2[i][j] =n;
                n++;
            }
        }
        for (int i = 0; i <= tomb2.length - 1; i++) {
            for (int j = 0; j <= tomb2[i].length - 1; j++) {
                System.out.print(tomb2[i][j] + " ");
            }
            System.out.println();
        }
    }
}