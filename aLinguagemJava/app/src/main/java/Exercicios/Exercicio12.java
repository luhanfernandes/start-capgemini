/*
 12. O custo de um carro novo ao consumidor � a soma do custo de f�brica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos s�o aplicados sobre o custo de f�brica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de f�brica de um carro e informe o custo ao consumidor do 
mesmo;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o custo de producao do carro: ");
        double custoCarro = leitor.nextDouble();
        
        System.out.println("O valor final do carro e: " + calcularCusto(custoCarro));
    }
    
    public static double calcularCusto(double custoCarro){
        return ((custoCarro * 0.45) + custoCarro)  * 0.28 + custoCarro;
    }
    
}
