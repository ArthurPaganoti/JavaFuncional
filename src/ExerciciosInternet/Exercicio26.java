package ExerciciosInternet;

// As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
//
//a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
//b. Salários até R$ 280,00 (incluindo): aumento de 20%;
//c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
//d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
//e. Salários de R$ 1500,00 em diante: aumento de 5%
//Após o aumento ser realizado; informe na tela;
//
//a. O salário antes do reajuste;
//b. O percentual de aumento aplicado;
//c. O valor do aumento;
//d. O novo salário, após o aumento.

// Vamos precisar do Scanner para ler as informações digitadas e armazenar nas váriaveis.
// Vamos precisar das váriaveis: (double salario, reajusteSalario, novoSalario).
// Vamos pedir para o úsuario informar o seu sálario.
// Vamos armazenar esse sálario na váriavel.
// Vamos fazer as verificações:
// IF: Se o sálario digitado for menor ou igual a 280. Reajuste: (salario * 20) / 100. Novo Salario: salario + reajuste.
// ELSE IF: Se o sálario digitado for maior que 280 e menor ou igual a 700. Reajuste: (salario * 15) / 100. Novo Salario: salario + reajuste.
// ELSE IF: Se o sálario digitado for maior que 700 e menor ou igual a 1500. Reajuste: (salario * 10) / 100. Novo Salario: salario + reajuste.
// ELSE: Se não. Reajuste: (salario * 5) / 100. Novo Salario: salario + reajuste.

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario, reajusteSalario;

        System.out.println("Informe o sálario atual do colaborador:  ");
        salario = sc.nextDouble();

        if (salario <= 280) {
            System.out.println("Sálario antes do reajuste R$ " + salario);
            System.out.println("Percentual de aumento: 20%");
            reajusteSalario = (salario * 20) / 100;
            System.out.println("Valor do aumento R$ " + reajusteSalario);
            System.out.println("Novo sálario com aumento R$ " + (salario + reajusteSalario));
        } else if (salario > 280 && salario <= 700) {
            System.out.println("Sálario antes do reajuste R$ " + salario);
            System.out.println("Percentual de aumento: 15%");
            reajusteSalario = (salario * 15) / 100;
            System.out.println("Valor do aumento R$ " + reajusteSalario);
            System.out.println("Novo sálario com aumento R$ " + (salario + reajusteSalario));
        } else if (salario > 700 && salario <= 1500) {
            System.out.println("Sálario antes do reajuste R$ " + salario);
            System.out.println("Percentual de aumento: 10%");
            reajusteSalario = (salario * 10) / 100;
            System.out.println("Valor do aumento R$ " + reajusteSalario);
            System.out.println("Novo sálario com aumento R$ " + (salario + reajusteSalario));
        } else {
            System.out.println("Sálario antes do reajuste R$ " + salario);
            System.out.println("Percentual de aumento: 5%");
            reajusteSalario = (salario * 5) / 100;
            System.out.println("Valor do aumento R$ " + reajusteSalario);
            System.out.println("Novo sálario com aumento R$ " + (salario + reajusteSalario));
        }

        sc.close();
    }
}
