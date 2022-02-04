package br.com.fiap.shiftweb5.model.filters.mixin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.fiap.shiftweb5.model.LojaModel;

public interface LojaMixin {

	
	@JsonIgnore
	List<LojaModel> getLojas();
	
}
