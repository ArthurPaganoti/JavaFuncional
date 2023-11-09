// Enunciado:
// 3. Você precisa desenvolver um sistema que permita o usuário digitar vários números inteiros,
//positivos ou negativos. Ao final, quando o usuário digita o valor -1, o programa deve calcular e
//exibir:
//○ A quantidade de números digitados pelo usuário;
//○ O maior número digitado;
//○ O menor número digitado;
//○ A média dos números digitados;
//Para esse exercício você NÃO deve trabalhar com vetores ou ArrayList.

package ExerciciosFaculdade;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria o objeto sc para receber dados do usuário

        // Variáveis
        int numero;
        int quantidadeNumeros = 0;
        int maiorNumero = 0;
        int menorNumero = 0;
        int soma = 0;
        double media = 0;


        while (true) { // Enquanto for verdadeiro

            // Pedindo para digitar um número e armazenando na variável
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            if (numero == -1) { // Se o número for igual a -1
                break; // Para o loop
            }

            quantidadeNumeros++; // Incrementa a quantidade de números
            soma += numero; // Soma recebe a soma + o número digitado

            if (quantidadeNumeros == 1) { // Se a quantidade de números for igual a 1
                maiorNumero = numero; // Maior número recebe o número digitado
                menorNumero = numero; // Menor número recebe o número digitado
            } else { // Se não
                if (numero > maiorNumero) { // Se o número for maior que o maior número
                    maiorNumero = numero; // Maior número recebe o número digitado
                } else if (numero < menorNumero) { // Se não, se o número for menor que o menor número
                    menorNumero = numero; // Menor número recebe o número digitado
                }
            }

            media = soma / quantidadeNumeros; // Média recebe a soma / quantidade de números
        }

        // Imprime a quantidade de números, o maior número, o menor número e a média
        System.out.println("A quantidade de números digitados é: " + quantidadeNumeros);
        System.out.println("O maior número digitado é: " + maiorNumero);
        System.out.println("O menor número digitado é: " + menorNumero);
        System.out.println("A média dos números digitados é: " + media);

        sc.close(); // Fecha o objeto sc
    }
}
