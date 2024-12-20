package org.lessons.java.snack3;

public class RegistroStudenti {
    private String[] registro;

    public RegistroStudenti(){
        registro = new String[0];
    }
    
    public void aggiungiStudente(String nome){
        String[] studentiPresenti = new String[registro.length + 1];

        for(int i = 0; i < registro.length; i++){
            studentiPresenti[i] = registro[i];
        }

        studentiPresenti[registro.length] = nome;
        registro = studentiPresenti;
    }

    public void stampaStudenti(){
        if (registro.length == 0) {
            System.out.println("Non ci sono studenti in classe");
        } else {
            for(String studente : registro){
                System.out.println(studente);
            }
        }
    }

}
