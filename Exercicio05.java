/*
Exercicio 05
Gerar o invertido de um número com três algarismos. (Exemplo: o invertido de 498 é 894). É um exercício de lógica simples, não é para usar if-else, nem validar o número.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, num01, num02, num03;
        System.out.print("digite um numero com 3 algarismos: ");
        num = scanner.nextInt();
        
        num01 = num % 10;
        num02 = (num / 10) % 10;
        num03 = num / 100;

        num = num01 * 100 +num02 * 10 + num03;

        System.out.println("segura esse mesmo numero com os algarismos invertidos: " + num);

        scanner.close();
    }    
}

//----------------------------------------------------------------