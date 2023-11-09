// Enunciado:
// 2. Você precisa calcular o salário de um funcionário ao final do mês. No entanto, existem alguns
//fatores que podem incrementar ou decrementar o salário deste funcionário.
//• Se o funcionário faltou mais que 5 vezes no mês, ele deve ter o salário descontado em
//15%;
//• Para cada produto que o funcionário vendeu, você deve dar um bônus de R$10,00 por
//produto; No entanto se ele vendeu mais que 20 produtos no mês, o bônus é de $13,00
//por produto vendido.

package ExerciciosFaculdade;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Definindo o local para US para utilizar o ponto ao invés da vírgula
        Scanner scan = new Scanner(System.in); // Cria o objeto scan para receber dados do usuário

        // Variáveis
        int faltas;
        int vendas;
        double salario;
        double salarioFinal;
        double desconto = 0;
        double bonus = 0;

        // Pedindo para digitar a quantidade de faltas, vendas e o salário do funcionário e armazenando nas variáveis
        System.out.println("Digite a quantidade de faltas do funcionário: ");
        faltas = scan.nextInt();
        System.out.println("Digite a quantidade de vendas do funcionário: ");
        vendas = scan.nextInt();
        System.out.println("Digite o sálario do funcionário: ");
        salario = scan.nextDouble();

        bonus = 0; // Zerando a variável bonus para não acumular o valor caso o funcionário tenha vendido mais que 20 produtos

        if (faltas > 5) { // Se faltas for maior que 5
            desconto = salario * 0.15; // Desconto recebe o valor do salário * 0.15
        } else if (vendas >= 20) { // Se vendas for maior ou igual a 20
            bonus = vendas * 0.13; // Bonus recebe o valor de vendas * 0.13
        } else { // Se não
            bonus = vendas * 0.10; // Bonus recebe o valor de vendas * 0.10
        }

        salarioFinal = salario - desconto + bonus; // Salário final recebe o valor do salário - desconto + bonus
        System.out.println("O salário final do funcionário é: " + salarioFinal); // Imprime o salário final do funcionário

        scan.close(); // Fecha o objeto scan
    }
}
