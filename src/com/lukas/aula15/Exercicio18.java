package com.lukas.aula15;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exercicio18 {

    public static void main(String[] args) {

        String data = "31/13/2020";
        checkData(data);
        
    }

    public static void checkData(String strData) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        sdf.setLenient(false);

        try {
            sdf.parse(strData);
            System.out.println("Data válida.");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Data inválida.");
        }
    }
}
