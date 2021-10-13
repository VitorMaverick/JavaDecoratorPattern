package cenarioImposto.imposto;

import cenarioImposto.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class AbstractImposto {
    private AbstractImposto proximo;

    public AbstractImposto(AbstractImposto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal desconto = this.efetuaCalculo(orcamento);
        if(proximo != null) {
            desconto = desconto.add(proximo.efetuaCalculo(orcamento));
        }
        return desconto;
    }

    abstract BigDecimal efetuaCalculo(Orcamento orcamento);
}
