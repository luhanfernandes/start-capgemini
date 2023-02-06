/*
 16. Escreva um algoritmo que leia o nome e as tr�s notas obtidas por um aluno durante o semestre. Calcular a 
sua m�dia (aritm�tica), informar o nome e sua men��o aprovado (media >= 7), Reprovado (media <= 5) e 
Recupera��o (media entre 5.1 a 6.9)
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio16 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.println("Informe a primeira nota: ");
        double primeiraNota = leitor.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double segundaNota = leitor.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double terceiraNota = leitor.nextDouble();
        
        System.out.println(verificarAprovacao(calcularMedia(primeiraNota, segundaNota, terceiraNota)));
        
        
    }
    
    public static double calcularMedia(double primeiraNota, double segundaNota, double terceiraNota){
        return (primeiraNota + segundaNota + terceiraNota) / 3;
    }
    
    public static String verificarAprovacao(double media){
        if(media >= 7){
            return "Aprovado!";
        } else if (media <= 5 ){
            return "Reprovado!";
        } else {
            return "Recuperacao!";
        }
    }
}
