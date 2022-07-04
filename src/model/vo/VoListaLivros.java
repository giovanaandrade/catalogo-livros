package model.vo;

import java.util.ArrayList;
import java.util.Collections;

public class VoListaLivros {
	private ArrayList<VoLivro> listaLivros;

	public VoListaLivros(ArrayList<VoLivro> listaLivros) {
		super();
		this.listaLivros = listaLivros;
	}

	public ArrayList<VoLivro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(ArrayList<VoLivro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	
	@Override
	public String toString() {
		ArrayList<String> livros = new ArrayList<String>();
		for (VoLivro livro : listaLivros) {
			livros.add(livro.getTitulo());
		}
		
		Collections.sort(livros);
		
		return livros.toString();
	}

}
