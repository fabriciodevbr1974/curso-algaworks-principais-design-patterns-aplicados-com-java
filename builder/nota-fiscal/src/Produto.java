import java.math.BigDecimal;

public class Produto {

  private String nome;
  private int quantidade;
  private BigDecimal valor;

  public Produto(String nome, int quantidade, BigDecimal valor) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.valor = valor;
  }

  // Getters
  public String getNome() {
    return nome;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public BigDecimal getValor() {
    return valor;
  }


}
