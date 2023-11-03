// Enunciado do exercício:
// Faça um programa para ler o valor do raio de um círculo.
// Depois mostrar o valor da área deste círculo.
//Fórmula da área: area = π . raio ^ 2(Raio elevado ao quadrado)
//Considere o valor de π = 3.14159

package ExerciciosUdemy.ExerciciosSequenciais;

// Passo a Passo:
// Primeiro será necessario importar a classe Scanner do pacote java.util
// Depois será necessario criar um objeto do tipo Scanner para ler os valores
// Depois será necessario declarar as variaveis do tipo double
// Depois será necessario ler o valor e armazenar na variavel
// Depois será necessario declarar uma variavel do tipo double para armazenar o valor da area
// Depois será necessario atribuir o valor da area a variavel area
// Depois será necessario imprimir a mensagem com o valor da area

import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // O locale serve para que o programa aceite o ponto como separador de casas decimais
        Scanner sc = new Scanner(System.in); // Criando objeto do tipo Scanner

        // Variaveis:
        double raioCirculo, resultadoAreaCirculo;

        // Lendo o valor e armazenando na variavel:
        System.out.println("Digite o valor do raio do circulo: ");
        raioCirculo = sc.nextDouble();

        // Atribuindo o valor da area a variavel area (Fazendo o calculo):
        resultadoAreaCirculo = 3.14159 * Math.pow(raioCirculo, 2);

        //OBS: Para fazermos o raio elevado ao quadrado, utilizamos o metodo pow da classe Math
        //OBS: O metodo pow recebe dois argumentos, o primeiro é o valor que queremos elevar ao quadrado, e o segundo é o valor do expoente

        // Imprimindo a mensagem com o valor da area:
        System.out.println("O valor da area do circulo é: " + resultadoAreaCirculo);

        // Fechando o objeto sc:
        sc.close();
    }
}
