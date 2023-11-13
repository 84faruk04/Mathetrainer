import java.util.Random;

public class Mathetrainer {
    void starte() {
        EinUndAusgabe ea = new EinUndAusgabe();
        Random random = new Random();
        char generiereOperator;

        double Aufgabe;
        double Antwort;

        int AnzahlRichtigeAntworten = 0;

        while (AnzahlRichtigeAntworten < 10) {

            int wert1 = ea.zufall(0, 9);
            int wert2 = ea.zufall(0, 9);
            int operator = random.nextInt(2);

            if (operator == 0) {
                generiereOperator = '/';
                if (wert2 == 0) {
                    System.out.println("Division durch null nicht möglich");
                    return;
                }
                Aufgabe = wert1 / wert2;
            } else {
                generiereOperator = '*';
                Aufgabe = wert1 * wert2;
            }

            System.out.println("Geben sie das Ergebnis ein: " + wert1 + " " + generiereOperator + " " + wert2 + " = ");

            Antwort = ea.leseDouble();
            if (Antwort == Aufgabe) {
                System.out.println("Richtig!");
                AnzahlRichtigeAntworten = AnzahlRichtigeAntworten + 1;
                System.out.println("Korrekte Antworten: " + AnzahlRichtigeAntworten);
            } else {
                System.out.println("Leider falsch! Korrektes Ergebnis ist " + Aufgabe);
                System.out.println("Korrekte Antworten: " + AnzahlRichtigeAntworten);

            }
        }
        System.out.println("Ende des Mathetrainers");
    }
}
