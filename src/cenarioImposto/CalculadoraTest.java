package cenarioImposto;

import cenarioImposto.imposto.AbstractImposto;
import cenarioImposto.imposto.CalculadoraDeImpostos;
import cenarioImposto.imposto.ICMS;
import cenarioImposto.imposto.ISS;
import cenarioImposto.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraTest {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 6);
        AbstractImposto imposto = new ICMS(new ISS(null));
        BigDecimal desconto = CalculadoraDeImpostos.calcular(orcamento, imposto);
        System.out.println(desconto);
    }

}
