package com.jotape.maratonajava.javacore.Bintroducaometodos.test;

import com.jotape.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.jotape.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "João";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 30;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);

        System.out.println("-----------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
