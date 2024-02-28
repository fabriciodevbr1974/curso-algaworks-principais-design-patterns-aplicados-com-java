import java.text.ParseException;

public class Main {

  public static void main(String[] args) {
    try {
      NotaFiscalBuilder builder = new NotaFiscalBuilder()
              .setNumero(123)
              .setDataEmissao("25/10/2023")
              .addProduto("Produto 1", 2, "15.50")
              .addProduto("Produto 2", 1, 30.0); // Exemplo com valor double

      NotaFiscal notaFiscalPF = builder.buildNotaFiscalPessoaFisica();
      NotaFiscal notaFiscalPJ = builder.buildNotaFiscalPessoaJuridica();

      System.out.println("Valor total PF: " + notaFiscalPF.calcularValorTotal());
      System.out.println("Valor total PJ: " + notaFiscalPJ.calcularValorTotal());
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

}
