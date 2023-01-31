/*
 30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */
package Exercicios;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio30 {
    
    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
        
       ArrayList<Integer> lista = new ArrayList<>();
       
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um valor: ");
            int numero = leitor.nextInt();
            lista.add(numero);
            
        }
        
        Collections.sort(lista);
        
        System.out.println(lista);
        
    }
    
}
