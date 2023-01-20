/*
 4. Faça um algoritmo que receba "N" numeros e mostre positivo, negativo ou zero
para cada numero
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio24 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        char continuar = 'S';
        
        while(continuar == 's' || continuar == 'S'){
            
            System.out.println("Digite um numero: ");
            int numero = leitor.nextInt();
            
            System.out.println(verificarNumero(numero));
            
            System.out.println("Deseja continuar?");
            continuar = leitor.next().charAt(0);
        }
        
    }
    
    public static String verificarNumero(int numero){
        if(numero > 0){
            return "Positivo";
        } else if (numero < 0){
            return "Negativo";
        } else {
            return "Seu numero e zero!";
        }
    }
    
}
