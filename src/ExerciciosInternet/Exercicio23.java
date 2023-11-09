// Enunciado:
//  Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
//  Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//
//Fórmula: distância = tempo x velocidade.
//
//            litros usados = distância / 12.

package ExerciciosInternet;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Definindo a localização para US para receber os dados com ponto
        Scanner sc = new Scanner(System.in); // Cria o objeto sc para receber dados do usuário

        // Variáveis
        double tempo;
        double velocidadeMedia;
        double distancia;
        double litrosUsados;

        // Pedindo para digitar o tempo e a velocidade média e armazenando nas variáveis
        System.out.println("Digite o tempo da viagem: ");
        tempo = sc.nextDouble();
        System.out.println("Digite a velocidade média: ");
        velocidadeMedia = sc.nextDouble();

        // Calculando a distância e a quantidade de litros usados
        distancia = tempo * velocidadeMedia;

        litrosUsados = distancia / 12;

        // Imprime a distância e a quantidade de litros usados
        System.out.printf("A distância percorrida é: %.2f%n", distancia);
        System.out.printf("A quantidade de litros usados é: %.2f%n", litrosUsados);

        sc.close(); // Fecha o objeto sc
    }
}
