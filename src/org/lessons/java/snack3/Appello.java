package org.lessons.java.snack3;

public class Appello {
    public static void main(String[] args) {
        RegistroStudenti appello = new RegistroStudenti();

        appello.aggiungiStudente("Giulia");
        appello.aggiungiStudente("Flippo");
        appello.stampaStudenti();
    }
}