package org.lessons.java.snack1;

public class Studente {
    private String nome;
    private String cognome;
    private int età;

    public Studente(String nome, String cognome, int età){
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public String datiStudente(){
        return nome +" "+ cognome +", "+ età +" Anni";
    }
}
