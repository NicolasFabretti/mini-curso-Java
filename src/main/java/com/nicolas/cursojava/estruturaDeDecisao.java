package com.nicolas.cursojava;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class estruturaDeDecisao {
    static void main(String[] args) throws ParseException {
        numeroPar();
        stringIgual();
        date();
    }

    private static void numeroPar() {
        int numero = 3;

        if(numero % 2 == 0){
            System.out.println("par");
        }else{
            System.out.println(("não é par"));

        }
    }

    private static void stringIgual() {
        String frase = "Today is Monday";

        //equals() Verifica se é exatamente igual.
        //equalsIgnoreCase() Ignora maiúsculas/minúsculas.
        //startsWith()  endsWith()

        if(frase.contains("Monday")){
            System.out.println("Sadness");
        }else{
            System.out.println(("fortunately"));
        }
    }

    private static void date() throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyy").parse("17/04/2026");

        if(date.before(new Date()) ){
            System.out.println("That day has already passed.");
        }else{
            System.out.println(("That day is yet to come."));
        }
    }


}
