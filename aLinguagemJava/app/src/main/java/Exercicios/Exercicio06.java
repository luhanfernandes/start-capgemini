/*
 6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a 
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores 
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
    

