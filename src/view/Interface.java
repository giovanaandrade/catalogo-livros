package view;

import java.sql.SQLException;
import java.util.Scanner;

import model.bo.BoListaLivros;
import model.vo.VoListaLivros;

public class Interface {
	public boolean mostrarMenu = true;
	Scanner entrada = new Scanner(System.in);
	private BoListaLivros bo;

	public Interface(BoListaLivros bo) {
		super();
		this.bo = bo;
	}

	public void apresentarInterface() throws SQLException {
		while (mostrarMenu) {
			this.mostrarMenuOpcoes();
			int opcao = entrada.nextInt();
			switch (opcao) {
			case 0:
				mostrarMenu = false;
				break;
			case 1:
				VoListaLivros lista = bo.getLista();
				System.out.println(lista);
				break;
			}

		}

	}

	public void mostrarMenuOpcoes() {
		System.out.println("1.Listar livros por ordem alfabética");
		System.out.println("0.Sair");
	}

}
