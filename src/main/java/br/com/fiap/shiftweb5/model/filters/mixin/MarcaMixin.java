package br.com.fiap.shiftweb5.model.filters.mixin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.fiap.shiftweb5.model.CategoriaModel;
import br.com.fiap.shiftweb5.model.MarcaModel;
import br.com.fiap.shiftweb5.model.ProdutoModel;

public interface MarcaMixin {

	@JsonIgnore
	List<ProdutoModel> getProdutos();
	
}
