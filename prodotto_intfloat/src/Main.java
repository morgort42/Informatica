import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");
        int i = in.nextInt();
        System.out.println("Inserisci un numero float: ");
        float f = in.nextFloat();
        float prod = (float) i * f;
        System.out.println("Il prodotto tra i due numeri e': " + prod);

    }
}