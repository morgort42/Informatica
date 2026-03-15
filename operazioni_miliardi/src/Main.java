import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci due numeri compresi tra 1 e 2 miliardi: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        n1 = 2000000000;
        n2 = 1000000000;
        System.out.println("La somma dei numeri e': " + (n1 + n2));
        System.out.println("La differenza dei numeri e': " + (n1 - n2));
        System.out.println("Il prodotto dei numeri e': " + (n1 * n2));

    }
}