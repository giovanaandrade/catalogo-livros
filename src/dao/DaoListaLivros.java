package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.vo.VoListaLivros;
import model.vo.VoLivro;

public class DaoListaLivros {
	private VoListaLivros vo;
	private DaoConexao conexao;
	private ArrayList<VoLivro> listaLivros = new ArrayList<VoLivro>();

	public DaoListaLivros(DaoConexao conexao) {
		super();
		this.conexao = conexao;
	}

	public VoListaLivros getVo() {
		return vo;
	}

	public void setVo(VoListaLivros vo) {
		this.vo = vo;
	}

	public VoListaLivros getListaLivrosByName() throws SQLException {
		Statement statement = conexao.getConexao().createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM livro");
		while (resultSet.next()) {
			String titulo = resultSet.getString("Titulo");
			int codigo = resultSet.getInt("Codigo");
			VoLivro livro = new VoLivro(codigo, titulo);
			listaLivros.add(livro);
		}
		vo = new VoListaLivros(listaLivros);
		return vo;
	}

}
