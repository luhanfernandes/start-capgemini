/*
 28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d.10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
vai aumentar sua folha de pagamento;
 */
package Exercicios;

import java.util.Scanner;
    
public class Exercicio28 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        float salario;
        float salarioMinimo;
        float aumentoFolha = 0;
        
        System.out.println("Digite o valor atual do salário minimo: ");
        salarioMinimo = leitor.nextFloat();
        
        for (int i = 0; i < 584; i++) {
            
            System.out.println("Informe o valor do salário atual: ");
            salario = leitor.nextFloat();
            
            System.out.println("Informe seu nome: ");
            nome = leitor.next();
            
            System.out.println(nome + " você terá um reajuste de: " + calcularReajuste(salario, salarioMinimo)
            + " e seu novo salário será de: " + (calcularReajuste(salario, salarioMinimo) + salario));
            
            aumentoFolha += calcularReajuste(salario, salarioMinimo);
            
            
        }       
        
        System.out.println("A empresa aumentará cerca de " + aumentoFolha + " reais.");
        
    }
    
    public static float calcularReajuste(float salario, float salarioMinimo){
            if(salario < salarioMinimo * 3){
                return salario * 0.50f;
            } else if (salario >= salarioMinimo * 3 && salario < salarioMinimo * 10){
                return salario * 0.20f;
            } else if (salario > salarioMinimo * 10 && salario < salarioMinimo * 20){
                return salario * 0.15f;
            } else {
                return salario * 0.10f;
            }
        }
    
}
