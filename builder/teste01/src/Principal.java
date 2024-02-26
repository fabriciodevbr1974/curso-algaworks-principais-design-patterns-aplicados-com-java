public class Principal {

  public static void main(String[] args) {
    Cliente cliente = new ClienteBuilder()
            .setNome("Fabricio")
            .setIdade(50)
            .construir();

    System.out.println(cliente);

  }
}


