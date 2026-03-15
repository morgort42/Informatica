import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero intero, uno float e uno double: ");
        int i = in.nextInt();
        float f = in.nextFloat();
        double d = in.nextDouble();
        System.out.println("I numeri inseriti sono: " + d );
    }
}