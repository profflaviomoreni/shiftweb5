package br.com.fiap.shiftweb5.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SHIFT5_Marca")
public class MarcaModel {

	@Id
	@Column(name = "ID_MARCA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MARCA_SEQ")
	@SequenceGenerator(name = "MARCA_SEQ", initialValue = 1, allocationSize = 1)
	private Long idMarca;
	
	@Column(name = "NOME_MARCA", length = 50, nullable = false)
	private String nomeMarca;

	@OneToMany(mappedBy = "marcaModel" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ProdutoModel> produtos;

	
	public Long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

	public List<ProdutoModel> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoModel> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
}
