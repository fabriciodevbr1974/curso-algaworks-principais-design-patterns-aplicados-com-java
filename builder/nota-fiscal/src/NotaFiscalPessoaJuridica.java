import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class NotaFiscalPessoaJuridica extends NotaFiscal {


  public NotaFiscalPessoaJuridica(int numero, Date dataEmissao, List<Produto> produtos) {
    super(numero, dataEmissao, produtos);
  }

  @Override
  public BigDecimal calcularImposto() {
    BigDecimal valorTotal = produtos.stream()
            .map(produto -> produto.getValor().multiply(new BigDecimal(produto.getQuantidade())))
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    return valorTotal.multiply(new BigDecimal("0.04"));
  }


}
