package org.lessons.java.snack2;

public class ContoBancario {
    int numeroConto;
    private double saldo;

    public ContoBancario(int numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    public void Deposita(double importo){
        if (importo > 0) {
            saldo += importo;
            System.out.println("Hai depositato " + importo + " €");
        } System.out.println("L'importo da depositare deve essere positivo");
    }
}
