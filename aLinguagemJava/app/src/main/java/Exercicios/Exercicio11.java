/*
 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
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
