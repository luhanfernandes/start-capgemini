package ComandosLeituraGravacao;

import java.util.Scanner;

public class Main {
    
    Scanner leitor = new Scanner(System.in);
    
    int idade = leitor.nextInt();
    float cotacaoDolar = leitor.nextFloat();
    double cotacaoEuro = leitor.nextDouble();
    String nome = leitor.nextLine(); //Ler a linha inteira
    String codigoRua = leitor.next(); //Ler a primeira palavra
    
}
