package model.vo;

public class VoEdicao {
	private int numero;
	private int ano;
	private int codigoLivro;

	public VoEdicao(int numero, int ano, int codigoLivro) {
		super();
		this.numero = numero;
		this.ano = ano;
		this.codigoLivro = codigoLivro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

}
