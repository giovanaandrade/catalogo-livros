package model.vo;

public class VoLivro {
	private int codigo;
	private String titulo;

	public VoLivro(int codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
