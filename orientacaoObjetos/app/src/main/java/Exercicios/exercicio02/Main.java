package Exercicios.exercicio02;


public class Main {
    
    public static void main(String[] args) {
        
        ContaCorrente pe1 = new ContaCorrente(01, "Luhan");
        
        pe1.setSaldo(1500);
        
        System.out.println(pe1.getSaldo());
        pe1.Sacar(750);
        System.out.println(pe1.getSaldo());
        
    }
    
}
