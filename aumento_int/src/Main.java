import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero intero che vuoi aumentare di 10, 100 e 1000: ");
        int num = in.nextInt();
        System.out.println("I numeri sono: " + (num + 10) + ", " + (num + 100) + ", " + (num + 1000));

    }
}