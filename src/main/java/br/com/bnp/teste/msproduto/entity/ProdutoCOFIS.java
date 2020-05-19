package br.com.bnp.teste.msproduto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.bnp.teste.msproduto.EStatus;
import br.com.bnp.teste.msproduto.entity.pk.ProdutoCOFISPK;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto_cosif", schema = "testebnp")
@IdClass(ProdutoCOFISPK.class)
public class ProdutoCOFIS {
	
	
	@Id
	@Column(columnDefinition = "bpchar")
	private String codCosif;
	@Id
	@Column(name = "cod_produto", columnDefinition = "bpchar")
	private String codProduto;
	@Column(columnDefinition = "bpchar")
	private String codClasificacao;

	@Column(name = "sta_status", columnDefinition = "bpchar")
	@Enumerated(EnumType.STRING)
	private EStatus status;
}