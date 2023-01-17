package EstruturaCondicionalSe;

import java.util.Scanner;

public class Main {
       
    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
       float nota = leitor.nextFloat();
       
       if(nota >= 7){
           if(nota == 10){
               System.out.println("Parabéns! Nota máxima!");
           } else {
               System.out.println("Aprovado!");
           } 
       } else {
           System.out.println("Reprovado!");
       }
        
    }
    
    
    
    
}
