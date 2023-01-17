/*
 2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
dos dois números lidos;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundoNumero = leitor.nextInt();
        
        System.out.println("A soma e: " + somar(primeiroNumero, segundoNumero));
        System.out.println("A subtracao e: " + subtrair(primeiroNumero, segundoNumero));
        System.out.println("A multiplicacao e: " + multiplicar(primeiroNumero, segundoNumero));
        System.out.println("A divisao e: " + dividir(primeiroNumero, segundoNumero));
    }
    
    public static int somar(int primeiroNumero, int segundoNumero){
        return primeiroNumero + segundoNumero;
    }
    
    public static int subtrair(int primeiroNumero, int segundoNumero){
        return primeiroNumero - segundoNumero;
    }
    
    public static int multiplicar (int primeiroNumero, int segundoNumero){
        return primeiroNumero * segundoNumero;
    }
    
    public static int dividir (int primeiroNumero, int segundoNumero){
        return primeiroNumero / segundoNumero;
    }
    
}
