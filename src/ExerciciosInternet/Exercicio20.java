// Enunciado:
// Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

package ExerciciosInternet;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os dados

        // Variaveis
        int numero;

        // Pedindo para o úsuario digitar um número e armazenando na variavel
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        // Exibindo a tabuada do número digitado
        for(int i = 1; i<= 10; i++) { // Loop para imprimir a tabuada de 1 até 10
        System.out.println(numero + " x " + i + " = " + numero * i);
        }
        sc.close();
    }
}
