package ExerciciosInternet;


// Faça um programa que apresente o menu de opções a seguir, que permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verificar a possibilidade de opção inválida e não se preocupar com as restrições, como salário inválido.
//
//Menu de opções:
//
//1. Novo salário
//2. Férias
//3. Décimo terceiro
//4. Sair
//Digite a opção desejada :
//
//Na Opção 1: receber o salário de um funcionário, calcular e mostrar o novo salário usando as regras a seguir.
//
//Salários	Percentagem de aumento
//Até R$ 350,00	15%
//De R$ 350,00 a R$ 600,00	10%
//Acima de R$ 600,00	5%
//Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor de suas férias. Sabe-se que as férias equivalem ao seu salário acrescido de l/Ê.
//
//Na opção 3: receber o salário de um funcionário e o número de meses de trabalho na empresa, no máximo 12, calcular e mostrar o valor do décimo terceiro. Sabe-se que o décimo terceiro equivale ao seu salário multiplicado pelo número de meses de trabalho dividido por 12.
//
//Na opção 4: sair do programa.

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opçao = 0;

        double salario, novoSalario, ferias, decimoTeceiro;
        int mesesTrabalhados;

        while (opçao != 4) {

            System.out.println("Selecione alguma das opções abaixo");
            System.out.println("1-) Novo sálario");
            System.out.println("2-) Férias");
            System.out.println("3-) Décimo terceiro");
            System.out.println("4-) Sair");
            opçao = sc.nextInt();

            switch (opçao) {

                case 1:
                    System.out.println("Digite o sálario: ");
                    salario = sc.nextDouble();

                    if (salario <= 350.00) {
                        novoSalario = (salario * 15) / 100;
                        salario += novoSalario;
                        System.out.println("Novo sálario: R$" + salario);
                    } else if (salario > 350.00 && salario <= 600.00) {
                        novoSalario = (salario * 10) / 100;
                        salario += novoSalario;
                        System.out.println("Novo sálario: R$" + salario);
                    } else {
                        novoSalario = (salario * 5) / 100;
                        salario += novoSalario;
                        System.out.println("Novo sálario: R$" + salario);
                    }
                    break;

                case 2:
                    System.out.println("Digite o sálario: ");
                    salario = sc.nextDouble();
                    ferias = salario + (salario / 3);
                    System.out.println("Valor das férias: R$" + ferias);
                    break;

                case 3:
                    System.out.println("Digite o sálario: ");
                    salario = sc.nextDouble();
                    System.out.println("Informe os meses trabalhados: ");
                    mesesTrabalhados = sc.nextInt();
                    decimoTeceiro = (salario * mesesTrabalhados) / 12;
                    System.out.println("Décimo terceiro: R$" + decimoTeceiro);
                    break;

                default:
                    System.out.println("Selecione alguma opção valida!");
                    break;
            }
        }
    }
}