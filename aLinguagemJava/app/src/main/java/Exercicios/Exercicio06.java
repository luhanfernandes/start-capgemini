/*
 6. Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores de forma que a vari�velApasse a 
possuir ovalor da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A.Apresentar osvalores 
trocados;
 */
package Exercicios;

import java.util.Scanner;


public class Exercicio06 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Valor de A: ");
        int valorA = leitor.nextInt();
        System.out.println("Valor de B: ");
        int valorB = leitor.nextInt();
        
        int valorC = valorB;
        valorB = valorA;
        valorA = valorC;
        
        System.out.println("Os novos valores sao: " + valorA + " , " + valorB);
        
    }
   
}
    

