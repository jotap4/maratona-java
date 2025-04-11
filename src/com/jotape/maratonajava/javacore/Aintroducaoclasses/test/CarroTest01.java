package com.jotape.maratonajava.javacore.Aintroducaoclasses.test;

import com.jotape.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Porsche";
        carro1.modelo = "911";
        carro1.ano = 1963;

        carro2.nome = "GTR";
        carro2.modelo = "R34";
        carro2.ano = 1998;

        carro1 = carro2;

        System.out.println("\nCarro 1: ");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("---------------");

        System.out.println("\nCarro 2: ");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
