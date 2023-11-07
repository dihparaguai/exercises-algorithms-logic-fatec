/* 
Exercicio 04
Calcular e exibir o valor do volume de uma lata de óleo, depois de ler seu raio e sua altura.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double alt, raio, volume;
        System.out.print("digite a altura da lata de oleo: ");
        alt = scanner.nextDouble();
        System.out.print("agora, digite o raio: ");
        raio = scanner.nextDouble();   

        volume = Math.PI * Math.pow(raio, 2) * alt;

        System.out.printf("o volume e: %.2f", volume);

        scanner.close();
    }   
}

//----------------------------------------------------------------