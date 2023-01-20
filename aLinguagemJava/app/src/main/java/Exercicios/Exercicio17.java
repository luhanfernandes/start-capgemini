/*
 17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
(inclusive)
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int totalIntervalo = 0;
        //int numero;
                
        for (int i = 80; i > 0; i--) {
            System.out.print("Informe o " + i + " numero: ");
            int numero = leitor.nextInt();
            
            if(numero >= 10 && numero <= 150){
                totalIntervalo ++;
            }
            
        }
        
        System.out.println("Ao total tivemos " + totalIntervalo + " numeors no intervalo");
    }
}
