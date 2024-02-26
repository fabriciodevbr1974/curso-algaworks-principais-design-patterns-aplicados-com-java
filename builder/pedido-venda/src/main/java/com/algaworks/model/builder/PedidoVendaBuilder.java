package com.algaworks.model.builder;

import com.algaworks.model.Cliente;
import com.algaworks.model.ItemPedido;
import com.algaworks.model.PedidoVenda;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoVendaBuilder {

  private PedidoVenda instancia;

  public PedidoVendaBuilder(){
    this.instancia = new PedidoVenda();
  }

  public PedidoVenda construir(){
    return this.instancia;
  }

  public PedidoVendaBuilder comClienteVip(String nome){
    definirCliente(nome, true);
    return this;
  }

  public PedidoVendaBuilder comClienteNormal(String nome){
    definirCliente(nome, false);
    return this;
  }

  public PedidoVendaBuilder comItem(String nome, Integer quantidade, BigDecimal valor){
    ItemPedido itemPedido = new ItemPedido();
    itemPedido.setNome(nome);
    itemPedido.setQuantidade(quantidade);
    itemPedido.setValorUnitario(valor);

    if(this.instancia.getItensPedido() == null){
      this.instancia.setItensPedido(new ArrayList<ItemPedido>());
    }

    this.instancia.getItensPedido().add(itemPedido);

    return this;

  }

  private void definirCliente(String nome, boolean b) {
    Cliente cliente = new Cliente();
    cliente.setNome(nome);
    cliente.setVip(true);
    this.instancia.setCliente(cliente);
  }

  public PedidoVendaBuilderValido comNumero(String numero) {
    this.instancia.setNumero(numero);
    return new PedidoVendaBuilderValido(instancia);
  }



}
