/*
Exericio 06
Ler 2 valores (x e y), que representam as coordenadas de um ponto no Plano Cartesiano. A seguir, determine a qual quadrante o ponto pertence ou, se ele está sobre algum eixo, ou na origem
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("digite o valor da coordenada X: ");
        x = scanner.nextInt();
        System.out.println("agora digite o valor da coordenada Y: ");
        y = scanner.nextInt();
        
        if (x == 0 && y == 0) {
            System.out.println("ta na origem");
        } else if (x == 0) {
            System.out.println("ta no eixo Y");
        } else if (y == 0) {
            System.out.println("ta no eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("ta no 1o quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("ta no 2o quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("ta no 3o quadrante");
        } else {
            System.out.println("ta no 4o quadrante");
        }
        
        scanner.close();
        }
}

//----------------------------------------------------------------