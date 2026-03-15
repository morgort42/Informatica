import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero float: ");
        float n =  in.nextFloat();
        System.out.println("Il numero inserito diviso per un miliardo e': " + (n / 1000000000));

    }
}