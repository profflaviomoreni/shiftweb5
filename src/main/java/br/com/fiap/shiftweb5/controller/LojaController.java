package br.com.fiap.shiftweb5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fiap.shiftweb5.model.CategoriaModel;
import br.com.fiap.shiftweb5.model.LojaModel;
import br.com.fiap.shiftweb5.model.MarcaModel;
import br.com.fiap.shiftweb5.model.ProdutoModel;
import br.com.fiap.shiftweb5.model.filters.mixin.CategoriaMixin;
import br.com.fiap.shiftweb5.model.filters.mixin.LojaProdutoMixin;
import br.com.fiap.shiftweb5.model.filters.mixin.MarcaMixin;
import br.com.fiap.shiftweb5.repository.LojaRepository;

@RestController
@RequestMapping("/loja")
public class LojaController {

	
	@Autowired
	public LojaRepository lojaRepository;
	
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<JsonNode> findById(@PathVariable("id") Long id) 
			throws JsonProcessingException {
		
		if ( lojaRepository.existsById(id) ) {
			LojaModel model = lojaRepository.findById(id).get();
			
			ObjectMapper mapper = new ObjectMapper()
					.addMixIn(ProdutoModel.class, LojaProdutoMixin.class)
					.addMixIn(CategoriaModel.class, CategoriaMixin.class)
					.addMixIn(MarcaModel.class, MarcaMixin.class);
			
			return ResponseEntity.ok( mapper.readTree( mapper.writeValueAsString(model) ) );
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	
}
