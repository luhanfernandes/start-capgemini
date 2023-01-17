/*
8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares 
disponíveis com ousuário;
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
