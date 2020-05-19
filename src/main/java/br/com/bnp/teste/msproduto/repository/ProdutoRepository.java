package br.com.bnp.teste.msproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bnp.teste.msproduto.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String>{
	
}
