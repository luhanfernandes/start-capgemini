/*
4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
package Exercicios;

import java.util.Scanner;

public interface Exercicio04 {
    
   public static void main(String[] args) {
   
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite o nome do vendedor: ");
       String nome = leitor.nextLine();
       System.out.println("Informe o salario fixo: ");
       float salario = leitor.nextFloat();
       System.out.println("Digite o valor em vendas: ");
       float vendas = leitor.nextFloat();
       
       System.out.println(nome + " seu salario fixo e de: " + salario + ". Mas com a comissao ficou no valor de: " + calcularComissao(salario, vendas));
       
   }
   
   public static float calcularComissao(float salario, float vendas){
       return (vendas * 0.15f) + salario;
   }
    
}
