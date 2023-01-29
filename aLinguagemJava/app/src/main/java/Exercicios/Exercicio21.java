/*
 * 21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
   ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio21 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        char continuar = 'S';
        
        String nome;
        char sexo;
        int idade;
        int saude;
        
        int aptos = 0;
    
        while(continuar == 'S' || continuar == 's'){
            
            System.out.println("Informe seu nome: ");
            nome = leitor.nextLine();
            System.out.println("Informe o sexo: ");
            sexo = leitor.next().charAt(0);
            System.out.println("Digite sua idade: ");
            idade = leitor.nextInt();
            System.out.println("Informe a condição de saúde: 1) Boa | 2) Media | 3) Ruim: ");
            saude = leitor.nextInt();
            
            if(sexo == 'M' || sexo == 'm'){
                if(idade >= 18 && idade < 65){
                    if(saude == 1 || saude == 2){
                        System.out.println("Ingresso!");
                        aptos ++;
                    } else{
                        System.out.println("Dispensando por condições de saúde!");
                    }
                } else {
                    System.out.println("Dispensado pela idade!");
                }
            } else {
                System.out.println("Dispensado pelo sexo.");
            }
            
            
        }
        
    }
    
    
    
}
