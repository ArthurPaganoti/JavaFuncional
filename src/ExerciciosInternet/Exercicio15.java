// Enunciado:
// Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
//

package ExerciciosInternet;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Para ler o que o usuário digitar

        int anoAtual, anoNascimento; // Variaveis

        // Pedindo informação pro úsuario e armazenando nas váriaveis
        System.out.println("Digite o ano em que você está: ");
        anoAtual = sc.nextInt();
        System.out.println("Digite o ano em que você nasceu: ");
        anoNascimento = sc.nextInt();

        // Exibindo o resultado na tela juntamente com os calculos e devidas converções
        System.out.println("Você está a: " + (anoAtual - anoNascimento) + " anos vivo, parabéns");
        System.out.println("Você está a: " + ((anoAtual - anoNascimento) * 12) + " meses vivo, parabéns");
        System.out.println("Você está a: " + ((anoAtual - anoNascimento) + 365) + " dias vivo, parabéns");

        sc.close(); // Fechando o objeto Scanner
    }
}
