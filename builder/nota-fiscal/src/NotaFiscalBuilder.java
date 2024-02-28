import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscalBuilder {

  private int numero;
  private Date dataEmissao;
  private List<Produto> produtos = new ArrayList<>();
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public NotaFiscalBuilder setNumero(int numero) {
    this.numero = numero;
    return this;
  }

  public NotaFiscalBuilder setDataEmissao(String dataEmissao) throws ParseException {
    this.dataEmissao = sdf.parse(dataEmissao);
    return this;
  }

  public NotaFiscalBuilder addProduto(String nome, int quantidade, String valor) {
    this.produtos.add(new Produto(nome, quantidade, new BigDecimal(valor)));
    return this;
  }

  public NotaFiscalBuilder addProduto(String nome, int quantidade, double valor) {
    this.produtos.add(new Produto(nome, quantidade, BigDecimal.valueOf(valor)));
    return this;
  }

  // Factory Method para criar a instância correta de NotaFiscal
  public NotaFiscal buildNotaFiscalPessoaFisica() {
    return new NotaFiscalPessoaFisica(numero, dataEmissao, produtos);
  }

  public NotaFiscal buildNotaFiscalPessoaJuridica() {
    return new NotaFiscalPessoaJuridica(numero, dataEmissao, produtos);
  }


}
