public class References {

    private static void swap1(int number1, int number2) {
        int oldNumber1 = number1;
        number1 = number2;
        number2 = oldNumber1;
    }

    private static void swap2(int[] array) {
        int oldFirstElement = array[0];
        array[0] = array[1];
        array[1] = oldFirstElement;
    }

    private static void swap3(int[] array1, int[] array2) {
        int[] oldArray1 = array1;
        array1 = array2;
        array2 = oldArray1;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        swap1(n1, n2);

        System.out.println(n1); // Ausgabe:20
        System.out.println(n2); // Ausgabe:10
        /*
        Begründung: durch die Methode swap1 wird n1 mit n2 vertauscht und n2 wird durch Oldnumber1 getauscht


         */

        int[] v1 = {1, 2};

        swap2(v1);

        System.out.println(v1[0]); // Ausgabe: 2
        /*
        Begründung: durch die Methode swap2 werden die Werte innerhalb des Arrays getauscht


         */

        int[] v2 = {1, 2};
        int[] v3 = {3, 4};

        swap3(v2, v3);

        System.out.println(v2[0]); // Ausgabe: 1
        System.out.println(v3[0]); // Ausgabe: 3
        /*
        Begründung: durch swap 3 werden die Werte nur lokal im Stack getauscht, aber das hat kein Einfluss auf die Funktion, weshalb v3[0] und v2[0] unverändert bleiben


         */
    }
}
