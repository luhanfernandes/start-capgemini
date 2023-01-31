/*
 31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio31 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int A = leitor.nextInt();
        System.out.println("Digite o valor de B:");
        int B = leitor.nextInt();
        System.out.println("Digite o valor de C: ");
        String C = leitor.next();
        
        switch (C) {
            case "+":
                System.out.println(A+B);
                break;
            case "-":
                System.out.println(A-B);
                break;
            case "*":
                System.out.println(A*B);
                break;
            case "/":
                if (B == 0) {
                    System.out.println("1");
                    break;
                } else {
                    System.out.println(A/B);
                    break;
                }
                
            default:
                System.out.println("Operador invalido!");
        }
        
    }
    
}
