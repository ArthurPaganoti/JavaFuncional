// Enunciado:
// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

package ExerciciosUdemy.EstruturaFor;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os dados

        int numero, contadorUm = 0, contadorDois = 0, valor; // Variaveis

        // Pedindo para o úsuario digitar um número e armazenando na variavel
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) { // Loop para deixar que o úsuario digite o número de que digitou anteriormente

            System.out.println("Digite um valor: "); // Pedindo para o úsuario digitar um valor
            valor = sc.nextInt();

            if (valor >= 10 && valor <= 20) { // Verificando se o valor digitado está entre 10 e 20
                contadorUm++; // Incrementando o contador
            } else { // Caso não esteja entre 10 e 20
                contadorDois++; // Incrementando o contador
            }
        }
        // Exibindo os resultados
        System.out.println(contadorUm + " in");
        System.out.println(contadorDois + " out");

        sc.close(); // Fechando o objeto Scanner
    }
}
