/*
 22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, a média de preço de custo e do preço de venda;
 */
package Exercicios;

import java.util.Scanner;


public class Exercicio22 {
    
    public static void main(String[] args) {
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Informe o preço de custo: ");
            float precoCusto = leitor.nextFloat();
            mediaCusto += precoCusto;
            System.out.println("Informe o preço de venda: ");
            float precoVenda = leitor.nextFloat();
            mediaVenda += precoVenda;
            
            System.out.println("Você produziu por: " + precoCusto);
            System.out.println("Você vendeu por: " + precoVenda);
            
            if(precoVenda - precoCusto < 0){
                System.out.println("Vocẽ teve prejuízo!");
            } else if (precoVenda - precoCusto > 0){
                System.out.println("Você teve lucro!");
            } else {
                System.out.println("Você saiu empatado!");
            }
                                   
        }
        
        System.out.println("A sua media de custo foi: " + mediaCusto / 4);
        System.out.println("A sua media de venda foi: " + mediaVenda / 4);
        
    }
    
}
