package com.jotape.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        //(condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro jotape." : "Ainda não tenho condiçoes, mas vou ter!";

        System.out.println(resultado);
    }
}
