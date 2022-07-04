package consulta.livros;

import java.sql.SQLException;

import dao.DaoConexao;
import dao.DaoListaLivros;
import model.bo.BoListaLivros;
import view.Interface;

public class ConsultaLivros {

	public static void main(String[] args) throws SQLException {
		DaoConexao conexao = new DaoConexao();
		DaoListaLivros dao = new DaoListaLivros(conexao);
		BoListaLivros bo = new BoListaLivros(dao);
		Interface inter = new Interface(bo);
		inter.apresentarInterface();
	}

}
