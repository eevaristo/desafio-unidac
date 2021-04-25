package com.unidac.desafiounidac.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CPF;





@Entity
@Table(name="TB_LANCHE")
public class Lanche implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotEmpty (message = "Nome não pode ser vazio")
	private String nm_func;
	
	@CPF
	@NotEmpty (message = "CPF não pode ser vazio")
	@Column(name ="nr_cpf", unique=true)
	private String nr_cpf;
	
	
	@NotEmpty (message = "Lanche não pode ser vazio")
	@Column(name ="nm_lanche", unique=true)
	private String nm_lanche;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNm_func() {
		return nm_func;
	}
	public void setNm_func(String nm_func) {
		this.nm_func = nm_func;
	}
	public String getNr_cpf() {
		return nr_cpf;
	}
	public void setNr_cpf(String nr_cpf) {
		this.nr_cpf = nr_cpf;
	}
	public String getNm_lanche() {
		return nm_lanche;
	}
	public void setNm_lanche(String nm_lanche) {
		this.nm_lanche = nm_lanche;
	}
	
	
}
