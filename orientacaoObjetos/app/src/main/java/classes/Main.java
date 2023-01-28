package classes;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
              
    float peso;
    float altura;
    
    Scanner leitor = new Scanner(System.in);
    
    Pessoa Luhan = new Pessoa();
    
        System.out.println("DIgite o peso: ");
        Luhan.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura: ");
        Luhan.setAltura(leitor.nextFloat());
    
        System.out.println("IMC: " + Luhan.calcularIMC());
    }
    
}
