package com.jotape.maratonajava.javacore.Aintroducaoclasses.test;

import com.jotape.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Sheila";
        professor.idade = 40;
        professor.sexo = 'F';

        System.out.println("Nome: " +professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
