// Enunciado:
// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário.
// A seguir, mostre o número e o salário do funcionário.

package ExerciciosUdemy.ExerciciosSequenciais;

// Passo a Passo:
// 1. Declarar as variáveis
// 2. Ler os valores
// 3. Calcular o salário
// 4. Mostrar o resultado


import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para o programa aceitar o ponto ao invés da vírgula
        Scanner sc = new Scanner(System.in); // Para ler os valores

        // Declarando as variáveis
        int numeroFuncionario;
        double horasTrabalhadas, valorRecebidoHora, salarioTotal;

        // Lendo os valores
        System.out.println("Digite o número do funcionário: ");
        numeroFuncionario = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Digite o valor que recebe por hora: ");
        valorRecebidoHora = sc.nextDouble();

        // Calculando o salário
        salarioTotal = horasTrabalhadas * valorRecebidoHora;

        // Mostrando o resultado
        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.println("Salário total: R$ " + salarioTotal);

        sc.close(); // Fechando o objeto sc
    }
}
