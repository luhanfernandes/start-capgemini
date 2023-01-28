
package heranca;

import java.util.Date;


public class Main {
    
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        Motorista m = new Motorista();
        
        v.setNome("Luhan");
        v.setSalario(1500.0f);
        v.setCpf("123912312");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salário do vendedor é: " + v.calcularSalario());
        
    }
    
}
