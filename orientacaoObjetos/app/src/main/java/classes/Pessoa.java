package classes;


public class Pessoa {
    
    private float peso;
    private float altura;
    
    public Pessoa(){
        
    }
    
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(float peso){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(float altura){
        return altura;
    }
}
