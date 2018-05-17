package br.com.tdd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_produto")
public class Produto {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "valor")
	private double preco;
	
	@Column(name = "qtda_estoque")
	private Integer qtdaEstoque;
	
	public Produto(Integer id, double preco, Integer qtdaEstoque) {
		this.id = id;
		this.preco = preco;
		this.qtdaEstoque = qtdaEstoque;
		
	}
	
	public Produto() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdaEstoque() {
		return qtdaEstoque;
	}
	public void setQtdaEstoque(int qtdaEstoque) {
		this.qtdaEstoque = qtdaEstoque;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + qtdaEstoque;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (qtdaEstoque != other.qtdaEstoque)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", preco=" + preco + ", qtdaEstoque=" + qtdaEstoque + "]";
	}
	
	

}
