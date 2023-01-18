/*
 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        
        int numero = leitor.nextInt();
        
        System.out.println(verificarNumero(numero));
        
    }
    
    public static String verificarNumero(int numero){
        if(numero > 10){
            return "Maior que 10!";
        } else if (numero == 10){
            return "Exatamente 10!";
        } else {
            return "Menor que 10!";
        }
    }
    
}
