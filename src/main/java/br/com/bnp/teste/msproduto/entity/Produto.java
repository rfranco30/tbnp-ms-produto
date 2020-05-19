package br.com.bnp.teste.msproduto.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.bnp.teste.msproduto.EStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "testebnp")
public class Produto {

	@Id
	@Column(columnDefinition = "bpchar")
	private String codProduto;
	private String desProduto;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "bpchar")
	private EStatus staStatus;
	
	@OneToMany
	@JoinColumn(name = "cod_produto")
	private List<ProdutoCOFIS> produtoCofisList;
}
