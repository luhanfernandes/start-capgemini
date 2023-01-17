/*
 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No finalinformar o nome do aluno e a sua média (aritmética);
 */
package Exercicios;

import java.util.Scanner;


public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.print("Primeira nota: ");
        float primeiraNota = leitor.nextFloat();
        
        System.out.println("Segunda nota: ");
        float segundaNota = leitor.nextFloat();
        
        System.out.println("Terceira nota: ");
        float terceiraNota = leitor.nextFloat();
        
        System.out.println(nome + "a sua media foi de: " + calcularMedia(primeiraNota, segundaNota, terceiraNota));
    }
    
    public static float calcularMedia(float primeiraNota, float segundaNota, float terceiraNota){
        return (primeiraNota + segundaNota + terceiraNota) / 3;
    }
    
}
