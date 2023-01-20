/*
 18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio18 {
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 75; i > 0; i--) {
            
            System.out.println("Digite a idade: ");
            int idade = leitor.nextInt();
            
            System.out.println(verificarIdade(idade));
        }
        
        
    }
    
    public static String verificarIdade(int idade){
        if(idade >= 18){
            return "Maior de idade!";
        } else {
            return "Menor de idade!";
        }
    }
    
}
