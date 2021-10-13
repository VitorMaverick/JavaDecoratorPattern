package cenarioImposto.imposto;

import java.math.BigDecimal;

import cenarioImposto.orcamento.Orcamento;

public class ICMS extends AbstractImposto {

	public ICMS(AbstractImposto proximo) {
		super(proximo);
	}

	public BigDecimal efetuaCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
