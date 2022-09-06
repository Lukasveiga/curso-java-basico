package com.lukas.aula52.exercicio;

public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage() {
        return "Agenda já está cheia.";
    }
    
}
