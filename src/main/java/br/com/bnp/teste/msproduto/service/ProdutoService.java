package br.com.bnp.teste.msproduto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bnp.teste.msproduto.entity.Produto;
import br.com.bnp.teste.msproduto.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public List<Produto> getAll(){
		return produtoRepository.findAll();
	}
	
}
