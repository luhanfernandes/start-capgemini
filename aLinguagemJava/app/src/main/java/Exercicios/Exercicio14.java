/*
 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        int primeiroNumero = leitor.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int segundoNumero = leitor.nextInt();
        
        System.out.println(verificiarMaior(primeiroNumero, segundoNumero));
    }
    
    public static String verificiarMaior(int primeiroNumero, int segundoNumero){
        if(primeiroNumero > segundoNumero){
            return "O " + primeiroNumero + " e maior!";
        } else if(segundoNumero > primeiroNumero){
            return "O " + segundoNumero + " e maior!";
        } else {
            return "Ambos numeros sao iguais!";
        }
    }
}
