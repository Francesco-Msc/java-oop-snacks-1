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
            System.out.println("Hai depositato: " + importo + " €");
        } else{
            System.out.println("L'importo da depositare deve essere positivo");
        }
    }

    public void Preleva(double importo){
        if (importo > 0 && importo < saldo) {
            saldo -= importo;
            System.out.println("Hai prelevato: " + importo +" €");
        } else if (importo < 0){
            System.out.println("L'importo da prelevare deve essere positivo");
        } else {
            System.out.println("Fondi insufficenti nel saldo");
        }
    }

    public double SaldoCorrente(){
        return saldo;
    }
}
