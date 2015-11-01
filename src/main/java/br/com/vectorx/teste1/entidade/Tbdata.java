package br.com.vectorx.teste1.entidade;

import java.util.Calendar;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="tbdata")
public class Tbdata {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne 
	@JoinColumn(name="fkano") 
	private Tbano tbano;
	
	@ManyToOne 
	@JoinColumn(name="fktipo") 
	private Tbtipo tbtipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar datainicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar datafim;
	
	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tbano getTbano() {
		return tbano;
	}

	public void setTbano(Tbano tbano) {
		this.tbano = tbano;
	}

	public Tbtipo getTbtipo() {
		return tbtipo;
	}

	public void setTbtipo(Tbtipo tbtipo) {
		this.tbtipo = tbtipo;
	}

	public Calendar getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Calendar datainicio) {
		this.datainicio = datainicio;
	}

	public Calendar getDatafim() {
		return datafim;
	}

	public void setDatafim(Calendar datafim) {
		this.datafim = datafim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
