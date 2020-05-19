package br.com.bnp.teste.msproduto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bnp.teste.msproduto.dto.ProdutoDTO;
import br.com.bnp.teste.msproduto.entity.Produto;
import br.com.bnp.teste.msproduto.service.ProdutoService;

@RestController
@RequestMapping("produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;

	@GetMapping
	public ResponseEntity<List<ProdutoDTO>> getALL(){
		List<ProdutoDTO> listRetorno = new ArrayList<>();
		service.getAll().stream().forEach(prod->{
			listRetorno.add(new ProdutoDTO(prod));
		});
		return new ResponseEntity<List<ProdutoDTO>>(listRetorno,HttpStatus.OK);
	}
	
}
