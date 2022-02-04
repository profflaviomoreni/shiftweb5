package br.com.fiap.shiftweb5.model.filters.mixin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.fiap.shiftweb5.model.ProdutoModel;

public interface CategoriaMixin {

	@JsonIgnore
	List<ProdutoModel> getProdutos();
	
}
