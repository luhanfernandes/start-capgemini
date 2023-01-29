/*
 25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
maior, e uma mensagem que são diferentes;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio25 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("DIgite o primeiro numero: ");
        int primeiroNumero = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundoNumero = leitor.nextInt();
        
        if(primeiroNumero == segundoNumero){
            System.out.println("Os números são iguais!");
        } else {
            if(primeiroNumero > segundoNumero){
                System.out.println("Eles são diferentes!");
                System.out.println("O número: " + primeiroNumero + " é maior!");
            } else {
                System.out.println("Eles são diferentes!");
                System.out.println("O número: " + segundoNumero + " é maior!");
            }
        }
        
        
    }
    
}
