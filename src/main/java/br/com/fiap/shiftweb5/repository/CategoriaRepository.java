package br.com.fiap.shiftweb5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.shiftweb5.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

	
	public List<CategoriaModel> findByAtivo(Boolean ativo);
	
	
}
