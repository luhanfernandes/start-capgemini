/*
8. Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em real (R$) de um valorlido em 
d�lar (US$). O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m aquantidade de d�lares 
dispon�veis com ousu�rio;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
              
        System.out.println("Cotacao do dolar: ");
        float cotacao = leitor.nextFloat();
        
        System.out.println("Quantidade de dolares: ");
        float dolares = leitor.nextFloat();
        
        System.out.println("A sua quantidade em R$: " + converterMoeda(cotacao, dolares));
        
    }
    
    public static float converterMoeda(float cotacao, float dolares){
        return cotacao * dolares;
    }
}
