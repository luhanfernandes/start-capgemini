/*
 19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio19 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int quantidadeHomem = 0;
        int quantidadeMulher = 0;
        
        for (int i = 0; i < 56; i++) {
            
            System.out.println("Informe seu nome: ");
            String nome = leitor.nextLine();
            System.out.println("Informe seu sexo: ");
            char sexo = leitor.next().charAt(1);
            
            if(sexo == 'M' || sexo == 'm'){
                System.out.println(nome + " voce e homem!");
                quantidadeHomem ++;
        } else if (sexo == 'F' || sexo == 'f'){
                System.out.println(nome + " voce e mulher!");
                quantidadeMulher++;
        }
                                                        
        }
        
        System.out.println("No total tivermos "+ quantidadeHomem + " e " + quantidadeMulher + "mulheres!");
    }
    
    
}
