package org.lessons.java.snack2;

public class MovimentiConto {
    public static void main(String[] args) {
        ContoBancario movimenti = new ContoBancario(3345);

        movimenti.Deposita(150);

        movimenti.Preleva(20);

        System.out.println("Saldo corrente: " + movimenti.SaldoCorrente() + " €");
    }
}
