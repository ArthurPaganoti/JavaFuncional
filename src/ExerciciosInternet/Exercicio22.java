// Enunciado:
//  Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
//  valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. ]
//  Imprima na tela o salário líquido final.

package ExerciciosInternet;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Configurando a linguagem para inglês para aceitar ponto ao invés de vírgula
        Scanner sc = new Scanner(System.in); // Cria o objeto sc para receber dados do usuário

        // Variáveis
        double valorHoraAula;
        int numeroAulasLecionadas;
        double percentualDescontoInss;
        double salarioLiquido;

        // Pedindo para digitar o valor da hora aula, a quantidade de aulas lecionadas no mês e o percentual de desconto do INSS e armazenando nas variáveis
        System.out.println("Entre com o valor da hora aula: ");
        valorHoraAula = sc.nextDouble();
        System.out.println("Entre com a quantidade aulas lecionadas no mês: ");
        numeroAulasLecionadas = sc.nextInt();
        System.out.println("Digite o percentual de desconto do INSS: ");
        percentualDescontoInss = sc.nextDouble();

        // Calculando o salário líquido final
        salarioLiquido = (valorHoraAula * numeroAulasLecionadas) - ((valorHoraAula * numeroAulasLecionadas) * (percentualDescontoInss / 100));

        // Imprime o salário líquido final
        System.out.printf("O salário líquido final é: %.2f", salarioLiquido);

        sc.close(); // Fecha o objeto sc
    }
}
