package br.com.tdd.model;

public class Pedido {

	private Integer idProduto;
	private Integer qtdaPedido;
	private boolean aVista;
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public Integer getQtdaPedido() {
		return qtdaPedido;
	}
	public void setQtdaPedido(Integer qtdaPedido) {
		this.qtdaPedido = qtdaPedido;
	}
	public boolean isaVista() {
		return aVista;
	}
	public void setaVista(boolean aVista) {
		this.aVista = aVista;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (aVista ? 1231 : 1237);
		result = prime * result + ((idProduto == null) ? 0 : idProduto.hashCode());
		result = prime * result + ((qtdaPedido == null) ? 0 : qtdaPedido.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (aVista != other.aVista)
			return false;
		if (idProduto == null) {
			if (other.idProduto != null)
				return false;
		} else if (!idProduto.equals(other.idProduto))
			return false;
		if (qtdaPedido == null) {
			if (other.qtdaPedido != null)
				return false;
		} else if (!qtdaPedido.equals(other.qtdaPedido))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pedido [idProduto=" + idProduto + ", qtdaPedido=" + qtdaPedido + ", aVista=" + aVista + "]";
	}
	
	
	
}
