/*
 10. A Loja Mam�o com A��car est� vendendo seus produtos em5(cinco)presta��es sem juros. Fa�a um 
algoritmo que receba um valor de uma compra e mostre o valor das presta��es
 */
package Exercicios;

import java.util.Scanner;


public class Exercicio10 {
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor da compra: ");
        double valorCompra = leitor.nextDouble();
        System.out.println("Informa a quantidade de prestacoes: ");
        int prestacoes = leitor.nextInt();
        
        System.out.println("Voce pagara o valor de: " + calcularPrestacoes(valorCompra, prestacoes) + " por " + prestacoes + " meses!");
        
        
    }
    
    public static double calcularPrestacoes(double valorCompra, int prestacoes){
        return valorCompra / prestacoes;
    }
    
}
