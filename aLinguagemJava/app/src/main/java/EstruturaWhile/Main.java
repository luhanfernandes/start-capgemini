
package EstruturaWhile;

import java.util.Scanner;

public class Main {
       
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int totalAlunos = 10;
        
        while (totalAlunos > 0) {

            String nomeALuno = leitor.nextLine();
            int idadeAluno = leitor.nextInt();
            
            System.out.println("O nome do aluno e: " + nomeALuno
            + " e sua idade e: " + idadeAluno);
            
            totalAlunos--;
        }
        
    }
}
