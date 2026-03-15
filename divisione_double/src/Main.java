import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero double: ");
        double n = in.nextDouble();
        System.out.println("Il numero diviso per mille miliardi e': " + (n / 1000000000000));

    }
}