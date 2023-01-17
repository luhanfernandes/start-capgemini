/*
 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        int primeiraNota = leitor.nextInt();
        System.out.println("Digite a segunda nota:");
        int segundaNota = leitor.nextInt();
        
        System.out.println("A soma e: " + somar(primeiraNota, segundaNota));
    }
    
    public static int somar(int primeiraNota, int segundaNota){
        return primeiraNota + segundaNota;
    }
    
}
