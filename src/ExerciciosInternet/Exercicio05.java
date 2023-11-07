// Enunciado:
// Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

package ExerciciosInternet;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Definindo o local para US, para que o programa aceite o ponto como separador de casas decimais
        Scanner sc = new Scanner(System.in); // System.in é a entrada de dados via teclado

        // Variáveis do tipo double
        double salarioMinimo = 1293.20, salarioUsuario, resultado;

        // Entrada de dados
        System.out.println("Digite o valor do seu salario: ");
        salarioUsuario = sc.nextDouble();

        // Processamento de dados
        resultado = salarioUsuario / salarioMinimo;

        // Saída de dados
        System.out.printf("O seu salário é equivalente a %.2f salários mínimos", resultado);

        sc.close(); // Fechando o Scanner
    }
}
