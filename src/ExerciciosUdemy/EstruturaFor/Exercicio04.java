// Enunciado:
// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

package ExerciciosUdemy.EstruturaFor;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os dados

        int numero; // Variavel para armazenar o número digitado pelo úsuario
        double numerador, denominador, divisao; // Variaveis

        // Pedindo para o úsuario digitar um número e armazenando na variavel
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) { // Loop para deixar que o úsuario digite o número de que digitou anteriormente

            // Pedindo para o úsuario digitar um numerador e um denominador e armazenando nas variaveis
            System.out.println("Digite o numerador: ");
            numerador = sc.nextDouble();
            System.out.println("Digite o denominador: ");
            denominador = sc.nextDouble();

            if (denominador != 0) { // Verificando se o denominador é diferente de zero
                divisao = numerador / denominador; // Calculando a divisão
                System.out.println("Resultado da divisão: " + divisao); // Exibindo o resultado
            } else { // Caso o denominador seja igual a zero
                System.out.println("Divisão impossivel");
            }
        }
        sc.close(); // Fechando o objeto Scanner
    }
}
