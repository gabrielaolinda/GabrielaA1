package br.tp1.gabriela.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Cosmeticos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private TipoCosmetico tipo;
	private Double preco;
	@ManyToOne
	@JoinColumn(name = "id_marca")
	private Marca marca;
	private LocalDate dataRecebimento;
	private Double quantidade;
	

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TipoCosmetico getTipo() {
		return tipo;
	}
	public void setTipo(TipoCosmetico tipo) {
		this.tipo = tipo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public LocalDate getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(LocalDate dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	
	

}
