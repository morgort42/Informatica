import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        String nome, luogo_n, provincia_n;
        char sesso;
        int anno_n, mese_n, giorno_n;

        String cogn = "Bugatti";
        String codice = "XYZ";
        int conta_cons = 0;
        int conta_lettere;
        cogn = cogn.toUpperCase();
        for (int i = 0; i < cogn.length(); i++) {
            if (cogn.charAt(i) == 'A' || cogn.charAt(i) == 'B' || cogn.charAt(i) == 'C' || cogn.charAt(i) == 'D' || cogn.charAt(i) == 'E' || cogn.charAt(i) == 'F' || cogn.charAt(i) == 'G' || cogn.charAt(i) == 'H' || cogn.charAt(i) == 'I' || cogn.charAt(i) == 'J' || cogn.charAt(i) == 'K' || cogn.charAt(i) == 'L' || cogn.charAt(i) == 'M' || cogn.charAt(i) == 'N' || cogn.charAt(i) == 'O' || cogn.charAt(i) == 'P' || cogn.charAt(i) == 'Q' || cogn.charAt(i) == 'R' || cogn.charAt(i) == 'S' || cogn.charAt(i) == 'T' || cogn.charAt(i) == 'U' || cogn.charAt(i) == 'V' || cogn.charAt(i) == 'W' || cogn.charAt(i) == 'X' || cogn.charAt(i) == 'Y' || cogn.charAt(i) == 'Z') {

            }
            if (cogn.charAt(i) == 'B' || cogn.charAt(i) == 'C' || cogn.charAt(i) == 'D' || cogn.charAt(i) == 'F' || cogn.charAt(i) == 'G' || cogn.charAt(i) == 'H' || cogn.charAt(i) == 'J' || cogn.charAt(i) == 'K' || cogn.charAt(i) == 'L' || cogn.charAt(i) == 'M' || cogn.charAt(i) == 'N' || cogn.charAt(i) == 'P' || cogn.charAt(i) == 'Q' || cogn.charAt(i) == 'R' || cogn.charAt(i) == 'S' || cogn.charAt(i) == 'T' || cogn.charAt(i) == 'V' || cogn.charAt(i) == 'W' || cogn.charAt(i) == 'X' || cogn.charAt(i) == 'Z') {
                conta_cons++;
            }
        }
        if (conta_cons >= 3){
            int cont = 0;
            int i = 0;
            do {
                if (cogn.charAt(i) == 'B' || cogn.charAt(i) == 'C' || cogn.charAt(i) == 'D' || cogn.charAt(i) == 'F' || cogn.charAt(i) == 'G' || cogn.charAt(i) == 'H' || cogn.charAt(i) == 'J' || cogn.charAt(i) == 'K' || cogn.charAt(i) == 'L' || cogn.charAt(i) == 'M' || cogn.charAt(i) == 'N' || cogn.charAt(i) == 'P' || cogn.charAt(i) == 'Q' || cogn.charAt(i) == 'R' || cogn.charAt(i) == 'S' || cogn.charAt(i) == 'T' || cogn.charAt(i) == 'V' || cogn.charAt(i) == 'W' || cogn.charAt(i) == 'X' || cogn.charAt(i) == 'Z') {
                    codice = codice.replace(codice.charAt(cont), cogn.charAt(i));
                    cont++;
                }
            i++;
            }while(cont < 3);
        } else {


        }



        System.out.println(codice);
    }
}