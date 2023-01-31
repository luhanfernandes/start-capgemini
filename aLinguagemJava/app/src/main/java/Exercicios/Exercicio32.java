/*
 32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
outros dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
C. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;




 */
package Exercicios;

import java.util.Scanner;
        
public class Exercicio32 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiero lado: ");
        int ladoA = leitor.nextInt();
        System.out.println("Digite o segundo lado: ");
        int ladoB = leitor.nextInt();
        System.out.println("DIgite o terceiro lado: ");
        int ladoC = leitor.nextInt();
        
        if(ladoA+ladoB > ladoC && ladoB+ladoC > ladoA && ladoC+ladoA > ladoB){
            
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("É um triangulo equilátero!");
            } else if(ladoA != ladoB && ladoB != ladoC){
                System.out.println("É um triangulo escaleno!");
            } else {
                System.out.println("É um triangulo isoceles!");
            }
            
        } else {
            System.out.println("Não pode ser um triangulo!");
        }
        
    }
    
}
