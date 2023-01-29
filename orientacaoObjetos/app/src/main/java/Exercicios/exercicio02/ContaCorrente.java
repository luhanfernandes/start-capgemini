/*
 2.Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package Exercicios.exercicio02;


public class ContaCorrente {
    
    private int numeroConta;
    private String nomeUsuario;
    private int saldo;
    
    public ContaCorrente(int numeroConta, String nomeUsuario){
        this.numeroConta = numeroConta;
        this.nomeUsuario = nomeUsuario;
    }
    
    public ContaCorrente(int numeroConta, String nomeUsuario, int saldo){
        this.numeroConta = numeroConta;
        this.nomeUsuario = nomeUsuario;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    public void alterarNome(String novoNome){
        this.nomeUsuario = novoNome;
    }
    
    public void Depositar (int Deposito){
        this.saldo += Deposito;
    }
    
    public void Sacar(int Saque){
        this.saldo -= Saque;
    }
    
    
}
