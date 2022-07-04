package model.bo;

import java.sql.SQLException;

import dao.DaoListaLivros;
import model.vo.VoListaLivros;

public class BoListaLivros {
	private DaoListaLivros dao;

	public BoListaLivros(DaoListaLivros dao) {
		this.dao = dao;
	}

	public DaoListaLivros getDao() {
		return dao;
	}

	public void setDao(DaoListaLivros dao) {
		this.dao = dao;
	}

	public VoListaLivros getLista() throws SQLException {
		return this.getDao().getListaLivrosByName();
	}
}
