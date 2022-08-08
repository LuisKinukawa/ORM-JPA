package br.com.fiap.smartcities.domain;



import java.util.Calendar;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import javax.persistence.Table;

import javax.persistence.Temporal;

import javax.persistence.TemporalType;

 

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;


@Entity
@Table(name="tbl_cliente2")
public class Cliente2 {
	
	@Id
	@Column(name = "cliente_celular", length=11,nullable=false)
	private int celular;
	
	@Column(name = "nome_cliente",length = 50, nullable=false)
	private String nome;
	
	@Column(name = "nome_bar",length = 50, nullable=false)
	private String bar;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="dh_criacao")
	private Calendar dataCriacao;
	
	@Column(name = "nome_cerveja",length = 50, nullable=false)
	private String cerveja;
	
	@Column(name = "consumo_cerveja",length = 50, nullable=false)
	private float consumo;

	@Column(name = "preco_cerveja",length = 50, nullable=false)
	private float preco;
	
	@Formula(value="consumo_cerveja*preco_cerveja")
	private Float total;
	
	@Formula(value="(select avg(consumo_cerveja) from tbl_cliente2 where cliente_celular=22001101)")
	private Float media_consumo;

	@Formula(value="(select avg(preco_cerveja) from tbl_cliente2 where cliente_celular=22001101)")
	private Float media_preco_cerveja;

	
	public Cliente2(int celular, String nome, String bar, Calendar dataCriacao, String cerveja, float consumo,
			float preco, Float total, Float media_consumo, Float media_preco_cerveja) {
		super();
		this.celular = celular;
		this.nome = nome;
		this.bar = bar;
		this.dataCriacao = dataCriacao;
		this.cerveja = cerveja;
		this.consumo = consumo;
		this.preco = preco;
		this.total = total;
		this.media_consumo = media_consumo;
		this.media_preco_cerveja = media_preco_cerveja;
	}



	public Cliente2() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public String getCerveja() {
		return cerveja;
	}


	public void setCerveja(String cerveja) {
		this.cerveja = cerveja;
	}


	public float getConsumo() {
		return consumo;
	}


	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public Float getTotal() {
		return total;
	}


	public void setTotal(Float total) {
		this.total = total;
	}


	public String getBar() {
		return bar;
	}


	public void setBar(String bar) {
		this.bar = bar;
	}


	public Float getMedia_consumo() {
		return media_consumo;
	}


	public void setMedia_consumo(Float media_consumo) {
		this.media_consumo = media_consumo;
	}


	public Float getMedia_gasto() {
		return media_preco_cerveja;
	}


	public void setMedia_gasto(Float media_gasto) {
		this.media_preco_cerveja = media_gasto;
	}


	public int getCelular() {
		return celular;
	}
	
	
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	

}
