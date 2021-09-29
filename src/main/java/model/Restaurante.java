package model;

public class Restaurante {
	private String nome;
	private String endereco;
	private String tipoComida;
	
	private int faixaPreco;
	private int classificacao;
	
    public Restaurante(String nome, String endereco, String tipoComida, 
                int faixaPreco, int classificacao) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTipoComida(tipoComida);
        this.setFaixaPreco(faixaPreco);
        this.setClassificacao(classificacao);
    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public int getFaixaPreco() {
		return faixaPreco;
	}

	public void setFaixaPreco(int faixaPreco) {
		this.faixaPreco = faixaPreco;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
}