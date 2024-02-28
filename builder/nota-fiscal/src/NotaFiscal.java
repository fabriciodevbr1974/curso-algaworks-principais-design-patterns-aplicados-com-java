import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public abstract class NotaFiscal {

  protected int numero;
  protected Date dataEmissao;
  protected List<Produto> produtos;

  public NotaFiscal(int numero, Date dataEmissao, List<Produto> produtos) {
    this.numero = numero;
    this.dataEmissao = dataEmissao;
    this.produtos = produtos;
  }

  public abstract BigDecimal calcularImposto();

  // Método para calcular o valor total da nota (produtos + imposto)
  public BigDecimal calcularValorTotal() {
    BigDecimal totalProdutos = produtos.stream()
            .map(produto -> produto.getValor().multiply(new BigDecimal(produto.getQuantidade())))
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    return totalProdutos.add(calcularImposto());
  }

  // Getters
  public int getNumero() {
    return numero;
  }

  public Date getDataEmissao() {
    return dataEmissao;
  }

  public List<Produto> getProdutos() {
    return produtos;
  }


}
