public class ClienteBuilder {

  private Cliente instancia;

  public ClienteBuilder(){
    this.instancia = new Cliente();
  }

  public Cliente construir(){
    return this.instancia;
  }

  public ClienteBuilder setNome(String nome){
    instancia.setNome(nome);
    return this;
  }

  public ClienteBuilder setIdade(Integer idade){
    instancia.setIdade(idade);
    return this;
  }


}
