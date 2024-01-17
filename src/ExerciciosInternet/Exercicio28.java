package ExerciciosInternet;

// Levar para o projeto principal.

// Uma agência bancária possui vários clientes que podem fazer investimentos com rendimentos mensais, conforme a tabela a seguir:
//
//Tipo	Descrição	Rendimento mensal
//1	Poupança	1,5%
//2	Poupança plus	2%
//3	Fundos de renda	4%
//Faça um programa que leia o código do cliente, o tipo da conta e o valor investido e que calcule e mostre o rendimento mensal de acordo com o tipo do investimento. Ao final do programa mostre o total de juros pagos. A leitura terminará quando o código do cliente digitado for menor ou igual a 0.

// Vamos precisar do scanner.
// Vamos iniciar com a váriavel códigoCliente = -1;
// Vamos para o laço while: enquanto o codigoCliente for diferente de 0.
// Vamos fazer um menu de opções com os tipos de redentimentos
// Vamos chamar a váriavel codigoCliente para armazenar a opção digitada.
// Podemos utilizar a estrutura switch case com o codigoCliente.
// case 0: Se a opção digitada pelo úsario tiver sido 0, já encerramos direto o programa com um break.
// case 1:

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoCliente = -1;
        double valorInvestimento, calculoInvestimento;

        while (codigoCliente != 0) {

            System.out.println("Bem-Vindo. Selecione o tipo de rendimento que deseja");
            System.out.println("1-) Poupança");
            System.out.println("2-) Poupança Plus");
            System.out.println("3-) Fundos de renda");
            System.out.println("0-) Sair");
            codigoCliente = sc.nextInt();

            switch (codigoCliente) {

                case 1:
                    System.out.println("Informe o valor que deseja investir: ");
                    valorInvestimento = sc.nextDouble();
                    calculoInvestimento = (valorInvestimento * 1.5) / 100;
                    System.out.println("Lucro por mês: " + calculoInvestimento);
                    break;

                case 2:
                    System.out.println("Informe o valor que deseja investir: ");
                    valorInvestimento = sc.nextDouble();
                    calculoInvestimento = (valorInvestimento * 2.0) / 100;
                    System.out.println("Lucro por mês: " + calculoInvestimento);
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja investir: ");
                    valorInvestimento = sc.nextDouble();
                    calculoInvestimento = (valorInvestimento * 4.0) / 100;
                    System.out.println("Lucro por mês: " + calculoInvestimento);
                    break;

                default:
                    System.out.println("Selecione uma opção valida!");
                    break;
            }
        }
    }
}
