// Enunciado:
// Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

package ExerciciosInternet;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Definindo o local para US, para que o programa aceite o ponto como separador de casas decimais
        Scanner sc = new Scanner(System.in); // System.in é a entrada de dados via teclado

        //  Variáveis do tipo double
        double notaUm, notaDois, notaTres, mediaFinal;

        // Entrada de dados
        System.out.println("Digite a nota um: ");
        notaUm = sc.nextDouble();
        System.out.println("Digite a nota dois: ");
        notaDois = sc.nextDouble();
        System.out.println("Digite a nota três: ");
        notaTres = sc.nextDouble();

        // Processamento de dados
        mediaFinal = (notaUm + notaDois + notaTres) / 3;

        System.out.println("A média das notas é: " + mediaFinal); // Saída de dados

        sc.close(); // Fechando o Scanner
    }
}
