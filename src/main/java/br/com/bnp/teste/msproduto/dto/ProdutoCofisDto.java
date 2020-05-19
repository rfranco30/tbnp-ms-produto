package br.com.bnp.teste.msproduto.dto;

import br.com.bnp.teste.msproduto.entity.ProdutoCOFIS;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProdutoCofisDto {
	private String codCofis;
	private String codClasificacao;
	
	public ProdutoCofisDto(ProdutoCOFIS cofis) {
		this.setCodCofis(cofis.getCodCosif());
		this.setCodClasificacao(cofis.getCodClasificacao());
		
	}
}
