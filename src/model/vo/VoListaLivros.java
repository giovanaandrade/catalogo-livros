package model.vo;

import java.util.ArrayList;
import java.util.Iterator;

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

}
