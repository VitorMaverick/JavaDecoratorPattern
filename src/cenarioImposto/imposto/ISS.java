package cenarioImposto.imposto;

import java.math.BigDecimal;

import cenarioImposto.orcamento.Orcamento;

public class ISS extends AbstractImposto {

	public ISS(AbstractImposto proximo) {
		super(proximo);
	}

	public BigDecimal efetuaCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
