package br.com.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.mvc.mudi.model.Pedido;
import br.com.mvc.mudi.model.StatusPedido;

public class RequisicaoPedidoDTO {
	@NotBlank(message = "O nome do produto é obrigatório")
	private String nomeProduto;
	@NotBlank(message = "A URL do produto é obrigatório")
	private String urlProduto;
	@NotBlank(message = "A URL da imagem do produto é obrigatório")
	private String urlImagem;
	@NotBlank(message = "A Descrição o produto é obrigatório")
	private String descrProduto;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescrProduto() {
		return descrProduto;
	}
	public void setDescrProduto(String descrProduto) {
		this.descrProduto = descrProduto;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(getNomeProduto());
		pedido.setUrlProduto(getUrlProduto());
		pedido.setUrlImagem(getUrlImagem());
		pedido.setDescrProduto(getDescrProduto());
		pedido.setStatus(StatusPedido.AGUARDANDO);
		return pedido;
	}
	
	
}
