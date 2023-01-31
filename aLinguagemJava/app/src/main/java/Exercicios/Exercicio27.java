/*
27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
clientes;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio27 {
    
    public static void main(String[] args) {
        
        int continuar = 1;
        float valorCarro;
        String combustivel;
        float desconto = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        while(continuar != 0){
            
            System.out.println("Digite o tipo de combustivel: ");
            combustivel = leitor.nextLine();
            
            System.out.println("Digite o valor do carro: ");
            valorCarro = leitor.nextFloat();
            
            
            
            if(combustivel.equalsIgnoreCase("gasolina")){
                desconto = valorCarro * 0.21f;
            } else if (combustivel.equalsIgnoreCase("alcool")){
                desconto = valorCarro * 0.25f;
            } else if (combustivel.equalsIgnoreCase("diesel")){
                desconto = valorCarro * 0.14f;
            }
            
            System.out.println("Você terá um desconto de: " + desconto);
            System.out.println("Você pagará: " + (valorCarro - desconto));
        
            System.out.println("Continuar: [0} para PARAR ou qualquer outro valor para continuar: ");
            
        }
        
    }
    
   
    
}
