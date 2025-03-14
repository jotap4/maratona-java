package com.jotape.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.

*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

    String dataRecebimentoSalario = "10/03/2025";
    String endereço = "Salvador";
    double salario = 2000;
    String nome = "Jotape";

    String relatorio = "Eu "+nome+", morando no endereço "+endereço+", confirmo que recebi o salário de R$ "+salario+ ", na data "+dataRecebimentoSalario;
    System.out.println(relatorio);

    }
}

