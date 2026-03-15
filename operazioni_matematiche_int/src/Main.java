import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero intero su cui verranno effettuate operazioni: ");
        int n =  in.nextInt();
        int molt = n * 100;
        int divis = n / 10;
        int resto = n % 3;
        System.out.println("I risultati sono: " + molt + ", "+ divis + ", " + resto);

    }
}