package consulta.livros;

import java.sql.SQLException;

import dao.DaoConexao;
import dao.DaoListaLivros;

public class ConsultaLivros {

	public static void main(String[] args) throws SQLException{
		DaoConexao conexao = new DaoConexao();
		DaoListaLivros dao = new DaoListaLivros(conexao);
		System.out.println(dao.getListaLivrosByName());
	}
 
}
