// Enunciado:
// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo

package ExerciciosUdemy.EstruturaFor;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os dados

        int numero; // Variavel para armazenar o número digitado pelo úsuario

        // Pedindo para o úsuario digitar um número e armazenando na variavel
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) { // Loop para deixar que o úsuario digite o número de que digitou anteriormente

                System.out.println(i + " " + (i * i) + " " + (i * i * i)); // Exibindo o número, o quadrado e o cubo do número
        }
        sc.close(); // Fechando o objeto Scanner
    }
}
