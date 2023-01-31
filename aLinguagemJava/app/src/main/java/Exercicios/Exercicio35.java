/*
 35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio35 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual tipo de cliente: ");
        String cliente = leitor.next();
        
        System.out.println("KW gasto: ");
        float kw = leitor.nextFloat();
        
        
        switch (cliente) {
            case "residencia":
                System.out.println(kw * 0.60f);
                break;
            case "comercio":
                System.out.println(kw * 0.48f);
                break;
            case "industria":
                System.out.println(kw * 1.29f);
                break; 
        }
        
    }
    
    
}


           
 