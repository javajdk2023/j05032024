package br.com.fuctura.aplicacao;

import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fuctura.dao.IUsuarioDAO;
import br.com.fuctura.dao.impl.UsuarioDAOImpl;
import br.com.fuctura.dao.impl.UsuarioDAONuvem;
import br.com.fuctura.model.Usuario;

public class Aplicacao {
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "123";

		var conexao = DriverManager.getConnection(url, username, password);
		
		//scanner 
		String nome = "";
		String email = "";
		int idade = 0;
		
		Usuario u = new Usuario();
		u.setNome(nome);
		u.setIdade(idade);
		u.setEmail(email);
		
		boolean nuvem = true;
		
		IUsuarioDAO dao = null;
		
		if(nuvem) {
			dao = new UsuarioDAONuvem();
		}else {
			dao = new UsuarioDAOImpl();
		}
		
		dao.inserir(conexao, u);
		
	}
	
}
