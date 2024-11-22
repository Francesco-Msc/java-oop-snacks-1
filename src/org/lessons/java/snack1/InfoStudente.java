package org.lessons.java.snack1;

public class InfoStudente {
    public static void main(String[] args) {
        Studente NuovoStudente = new Studente("Filippo", "Rossi", 24);

        System.out.println(NuovoStudente.datiStudente());
    }
}
