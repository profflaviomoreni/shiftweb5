package br.com.fiap.shiftweb5.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.shiftweb5.model.MarcaModel;
import br.com.fiap.shiftweb5.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>  {

	public List<ProdutoModel> findByMarcaModelIn(Set<MarcaModel> marcas);
	
	public List<ProdutoModel> findByNomeContains(String partName);
	
}
