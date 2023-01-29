/*
 * 20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        boolean continuar = true;
        int quantidadeAbaixoDoisMil = 0;
        
        
        
        while(continuar){
            
            System.out.println("Digite o ano do carro: ");
            int anoCarro = leitor.nextInt();
            System.out.println("Digite o valor original: ");
            float valorCarro = leitor.nextFloat();
            
            if(anoCarro < 2000){
                float desconto = valorCarro * 0.12f;
                System.out.println("Seu desconto será de: " + desconto);
                valorCarro = valorCarro - desconto;
                System.out.println("Você pagará: " + valorCarro);
                quantidadeAbaixoDoisMil ++;
            } else {
                float desconto = valorCarro * 0.07f;
                System.out.println("Seu desconto será de: " + desconto);
                valorCarro = valorCarro - desconto;
                System.out.println("Você pagará: " + valorCarro);
            }
            
            System.out.println("Deseja continuar?");
            char seguir = leitor.next().charAt(0);
            
            if(seguir == 'S' || seguir == 's'){
                continuar = true;
            } else {
                continuar = false;
            }
            
        }
        
        System.out.println(quantidadeAbaixoDoisMil);
        
    }
    
}
