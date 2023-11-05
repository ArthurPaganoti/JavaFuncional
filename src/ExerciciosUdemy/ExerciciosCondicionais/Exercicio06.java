// Enuncaido:
// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

package ExerciciosUdemy.ExerciciosCondicionais;

// Passo a Passo:
// 1. Declarar as variáveis do tipo inteiro
// 2. Ler os valores
// 3. Verificar se os valores são multiplos
// 4. Imprimir o resultado

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Definindo o local como US para usar o ponto ao invés da vírgula
        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os valores

        // Variáveis
        double valorIntervalo;

        // Pede pro úsuario digitar o valor e armazena na variável
        System.out.println("Digite um valor para verificar se está no intervalo: ");
        valorIntervalo = sc.nextDouble();

        // Verificando se o valor está no intervalo
        if (valorIntervalo >= 0 & valorIntervalo <= 25) {
            System.out.println("O valor: " + valorIntervalo + " está no intervalo [0,25]");
        } else if (valorIntervalo > 25 & valorIntervalo <= 50) {
            System.out.println("O valor: " + valorIntervalo + " está no intervalo [25,50]");
        } else if (valorIntervalo > 50 & valorIntervalo <= 75) {
            System.out.println("O valor: " + valorIntervalo + " está no intervalo [50,75]");
        } else if (valorIntervalo > 75 & valorIntervalo <= 100) {
            System.out.println("O valor: " + valorIntervalo + " está no intervalo [75,100]");
        } else {
            System.out.println("O valor digitado está fora de intervalo");
        }
        sc.close(); // Fechando o objeto scanner.
    }
}