/*
 1.Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */
package Exercicios.exercicio01;


public class Main {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.setNome("Luhan");
        pessoa1.setAnoNascimento(2001);
        pessoa1.setAltura(1.80f);
        
        pessoa1.imprimriDados();
        System.out.println(pessoa1.calcularIdade());
        
        
    }
    
}
