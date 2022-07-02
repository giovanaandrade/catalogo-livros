package dao;

import model.vo.VoLivro;

public class DaoLivro {
	private VoLivro vo;

	public DaoLivro(VoLivro vo) {
		super();
		this.vo = vo;
	}

	public VoLivro getVo() {
		return vo;
	}

	public void setVo(VoLivro vo) {
		this.vo = vo;
	}
}
