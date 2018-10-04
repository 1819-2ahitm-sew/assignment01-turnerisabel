import java.util.Scanner;

public class Turner_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Header

        System.out.println("Calculator\n==========");

        // Variablendeklaration

        String input = "";
        int ergebnis = 0;

        // Berechnung, nicht vollständig



        while (!input.equalsIgnoreCase("quit")){
            System.out.print("Eingabe: ");
            input = scanner.next();

            String array [] = input.split("");

            System.out.println("Berechnung: "+ergebnis);

            }
        }
    }

