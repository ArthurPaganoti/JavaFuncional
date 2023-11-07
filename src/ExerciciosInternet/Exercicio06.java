// Enunciado:
// Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

package ExerciciosInternet;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);  // Definindo o local para US, para que o programa aceite o ponto como separador de casas decimais
        Scanner sc = new Scanner(System.in); // System.in é a entrada de dados via teclado

        // Variáveis do tipo double
        double valor, resultado;

        // Entrada de dados
        System.out.println("Digite o valor do seu sálario para o reajuste: ");
        valor = sc.nextDouble();

        // Processamento de dados
        resultado = valor * 1.05; // 5% = 0.05

        // Saída de dados
        System.out.printf("O seu salário reajustado é de: %.2f", resultado);

        sc.close(); // Fechando o Scanner
    }
}
