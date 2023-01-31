/*
 3.Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
 */

package Exercicios.exercicio03;


public class BombaCombustivel {
    
    private String tipoCombustivel = "Gasolina";
    private float valorLitro = 5.76f;
    private float quantidadeCombustivel = 100.0f;

    
    
    public float abastecerPorValor(float valor){
        return valor / this.valorLitro;
    }
    
    public float abastecerPorLitro(float litro){
        return this.valorLitro * litro;
    }
    
    public void alterarValor(float valorLitro){
        this.valorLitro = valorLitro;
    }
    
    public void alterarCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void alterarQuantidade(float quantidadeCombustivel){
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    
    
}
