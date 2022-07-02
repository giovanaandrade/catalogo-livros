package model.bo;

import dao.DaoListaLivros;
import model.vo.VoListaLivros;

public class BoListaLivros {
	private DaoListaLivros dao;
	private VoListaLivros vo;

	public BoListaLivros(DaoListaLivros dao, VoListaLivros vo) {

		this.vo = vo;
	}

	public DaoListaLivros getDao() {
		return dao;
	}

	public void setDao(DaoListaLivros dao) {
		this.dao = dao;
	}

	public VoListaLivros getVo() {
		return vo;
	}

	public void setVo(VoListaLivros vo) {
		this.vo = vo;
	}
	
}
