/*
9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
package Exercicios;

import java.util.Scanner;


public class Exercicio09 {

    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o capital inicial: ");
        double capitalInicial = leitor.nextDouble();
        
        System.out.println("A quantidade de meses: ");
        int meses = leitor.nextInt();
        
        double novoSaldo = calcularJuros(capitalInicial, meses) + capitalInicial;
                
        System.out.println("Seu novo saldo e de: " + novoSaldo);
        
        
    }
    
    public static double calcularJuros(double capitalInicial, int meses){
        return (0.07 * meses) * capitalInicial;
    }
    
}
