package Exercicios500AlgoritmosResolvidos;

// prog teste
//imprima "raiz: ",raiz(64);
//imprima "\nraiz com exp e log e realint: ",realint(exp(1/2*log(64)));
//imprima "\nraiz com exp e log sem realint: ",exp(1/2*log(64));
//imprima "\n", formatar(sen(45*pi/180)+0.0001,3);
//imprima "\npotencia com exp e log e formatar: ",formatar(exp(
//3*log(8))+0.001,3);#continuacao
//imprima "\npotencia com exp e log sem formatar: ",exp(3*log(8));
//imprima "\npotencia com operador** e formatar: ",formatar(8**3,3);
//imprima "\nraiz cubica: ",exp(1/3*log(8));
//imprima "\nabsoluto: ",abs(-8);
//imprima "\nabsoluto: ",abs(8);
//imprima "\nconvertendo para inteiro 5.5: ",realint(5.5);
//imprima "\nconvertendo para inteiro 6.5: ",realint(6.5);
//imprima "\nconvertendo para inteiro 6.5 + 0.0001: ",realint(6.5+0.0001);
//imprima "\nconvertendo para inteiro 5.45: ",realint(5.45J;
//imprima "\nconvertendo para inteiro 5.51: ",realint(5.51);
//imprima "\nconvertendo para real 87: ",intreal(87);
//imprima "\nconvertendo para int 3/4: ",realint(3/4),"\n";
//fimprog

public class Algoritmo19 {
    public static void main(String[] args) {

        System.out.println("Raiz: " + (Math.sqrt(64)));
        System.out.println("Raiz com exp e log realint: " + ((int)Math.exp(1/2 * Math.log(64))));
        System.out.println("Raiz com exp e log sem realint: " + (Math.exp(1/2 * Math.log(64))));
        System.out.println("Formatar: " + (Math.sin((45 * 3.14159) / 180) + 0.0001));
        System.out.println("Potencia com exp e log sem formatar: " + (Math.exp(3 * Math.log(8)) + 0.001));
    }
}