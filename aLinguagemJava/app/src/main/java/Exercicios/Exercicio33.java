/*
 33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
 */
package Exercicios;

import java.util.Scanner;


public class Exercicio33 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nível do professor: ");
        int nivelProfessor = leitor.nextInt();
        System.out.println("Digite a quantidade de horas dadas: ");
        int horas = leitor.nextInt();
        
        System.out.println(calcularSalario(nivelProfessor, horas));
        
        
        }
    
    public static int calcularSalario(int nivelProfessor, int horas){
        if(nivelProfessor == 1){
            return horas * 12;
        } else if (nivelProfessor == 2){
            return horas* 17;
        } else if (nivelProfessor == 3){
            return horas * 25;
        } else{
            return 0;
        }
    }
    
    
    
}
