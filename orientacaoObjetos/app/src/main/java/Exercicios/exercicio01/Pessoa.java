package Exercicios.exercicio01;

import java.util.Date;


public class Pessoa {
    
    private String nome;
    private int anoNascimento;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    
    public void imprimriDados(){
        System.out.println(this.getNome());
        System.out.println(this.getAnoNascimento());
        System.out.println(this.getAltura());
    }
    
    public int calcularIdade(){
       return 2023 - this.getAnoNascimento();
        
    }
    
    
}
