/*
 15. Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no intervalo entre 100 e 200
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um valor: ");
        int numero = leitor.nextInt();
        
        System.out.println(verificarValor(numero));
        
    }
    
    public static String verificarValor(int numero){
        if(numero >= 100 && numero <= 200){
            return "Esta entre os valores.";
        } else {
            return "Nao esta contido!";
        }
    }
    
}
