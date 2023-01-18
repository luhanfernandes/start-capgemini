/*
 11. Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor de venda. Sabe-se que o 
pre�o de custo receber� um acr�scimo de acordo com um percentual informado pelo usu�rio;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o preco de custo: ");
        double precoCusto = leitor.nextDouble();
        
        System.out.println("O preco ideal de venda do seu produto e: " + calcularAcrescimo(precoCusto) );
    }
    
    public static double calcularAcrescimo(double precoCusto){
        return (precoCusto * 0.10) + precoCusto;
    }
    
}
