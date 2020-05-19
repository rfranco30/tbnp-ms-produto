package br.com.bnp.teste.msproduto;

public enum EStatus {
	A("Ativo"), I("Inativo");

	String desc;

	EStatus(String desc) {
		this.desc = desc;
	}
}
