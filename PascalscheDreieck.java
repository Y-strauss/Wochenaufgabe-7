import java.util.Scanner;

public class PascalscheDreieck {

    private static long[][] pascalCache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Das Pascalsche Dreieck der Zahl:");
        int n = scanner.nextInt();
        scanner.close();

        pascalCache = new long[n + 1][n + 1];

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(pascal(row, col) + " ");
            }
            System.out.println(); 
        }
    }

    private static long pascal(int zeile, int spalte) {
        
        if (spalte == 0 || spalte == zeile) {
            return 1;
        }

       
        if (pascalCache[zeile][spalte] != 0) {
            return pascalCache[zeile][spalte];
        }

    
        long value = pascal(zeile - 1, spalte - 1) + pascal(zeile - 1, spalte);
        pascalCache[zeile][spalte] = value; 

        return value;
    }
}


