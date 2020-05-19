package br.com.bnp.teste.msproduto.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.bnp.teste.msproduto.entity.Produto;
import br.com.bnp.teste.msproduto.entity.ProdutoCOFIS;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProdutoDTO {
	private String codProduto;
	private String descProduto;
	private List<ProdutoCofisDto> cofisList;
	
	public  ProdutoDTO (Produto prod) {
		this.setCodProduto(prod.getCodProduto()); 
		this.setDescProduto(prod.getDesProduto());
		prod.getProdutoCofisList().stream().forEach(this::addProdutoCofisDto);
	}
	
	public void addProdutoCofisDto(ProdutoCOFIS cofis) {
		if(this.cofisList == null) {
			this.setCofisList(new ArrayList<>());
		}
		this.getCofisList().add(new ProdutoCofisDto(cofis));
	}

}
