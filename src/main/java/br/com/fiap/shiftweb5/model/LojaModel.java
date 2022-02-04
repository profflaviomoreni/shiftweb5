package br.com.fiap.shiftweb5.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "SHIFT5_LOJA")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="idLoja")
public class LojaModel {

	private Long idLoja;
	private String nomeLoja;
	private List<ProdutoModel> produtos;

	public LojaModel() {
	}

	public LojaModel(Long idLoja, String nomeLoja) {
		super();
		this.idLoja = idLoja;
		this.nomeLoja = nomeLoja;
	}

	@Id
	@Column(name = "ID_LOJA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOJA_SEQ")
	@SequenceGenerator(name = "LOJA_SEQ", initialValue = 1, allocationSize = 1)
	public Long getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(Long idLoja) {
		this.idLoja = idLoja;
	}

	@Column(name = "NOME_LOJA")
	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	@ManyToMany( mappedBy = "lojas", fetch = FetchType.EAGER)
	public List<ProdutoModel> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoModel> produtos) {
		this.produtos = produtos;
	}

	
	

}
