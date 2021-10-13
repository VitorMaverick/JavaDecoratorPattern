package cenarioImposto.imposto;

import java.math.BigDecimal;

import cenarioImposto.orcamento.Orcamento;

public class CalculadoraDeImpostos {


	public static BigDecimal calcular(Orcamento orcamento, AbstractImposto imposto) {

		return imposto.calcular(orcamento);
	}

}
