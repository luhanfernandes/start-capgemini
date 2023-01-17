/*
    3. Escreva um algoritmo para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia 
    total percorrida pelo autom�vel e o total de combust�vel gasto;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a distancia percorrida: ");
        float distancia = leitor.nextFloat();
        System.out.println("Digite o total de combustivel: ");
        float combustivel = leitor.nextFloat();
        
        System.out.println("O seu gasto medio foi de:" + calcularGasto(distancia, combustivel) + " KM/L");
    }
    
    public static float calcularGasto(float distancia, float combustivel){
        return distancia / combustivel;
    }
    
}
