/*
 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de 
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius; 
 */
package Exercicios;

import java.util.Scanner;


public class Exercicio07 {
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Temperatura em Calsius: ");
        double celsius = leitor.nextDouble();
        
        System.out.println("A temperatura convertida e: " + converterTemperatura(celsius));
        
    }
    
    public static double converterTemperatura(double celsius){
        return (9*celsius + 160) / 5;
    }
    
}
