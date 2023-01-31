package Exercicios.exercicio03;


public class Main {
    
    public static void main(String[] args) {
        
        BombaCombustivel bomba1 = new BombaCombustivel();
        
        System.out.println(bomba1.abastecerPorLitro(10));
        bomba1.alterarValor(5);
        System.out.println(bomba1.abastecerPorLitro(10));
        
        
    }
    
}
