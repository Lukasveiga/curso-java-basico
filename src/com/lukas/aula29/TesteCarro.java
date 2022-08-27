package com.lukas.aula29;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro2 = new Carro("Audi", "A3");  // 'default' --> numPassageiros = 10; capCombustivel = 100; and consumoCombustivel = 0.2;
        Carro carro3 = new Carro();

        carro2.mostrarInfo();
        carro3.mostrarInfo();
        
    }
    
}
