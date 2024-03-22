package fuctura.aplicacao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import fuctura.dao.UsuarioDAO;
import fuctura.model.Usuario;

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
		
		
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.inserir(conexao, u);
		
		
		System.out.println("finalizou o inserir");
		
		Usuario u2 = new Usuario();
		u2.setCodigo(5);
		
		Usuario u3 = userDAO.consultar(conexao, u2);
		
		System.out.println("Cod. Usuario:" + u3.getCodigo());
		System.out.println("Nome Usuário: " + u3.getNome());
		
		Usuario u4 = new Usuario();
		u4.setNome("Mari");
		
		List<Usuario> resultadoConsulta = 
				userDAO.consultarPorNome(conexao, u4);
		
		for(int i = 0; i < resultadoConsulta.size(); i++) {
			Usuario usu = resultadoConsulta.get(i);
			System.out.println("Cod. Usuario:" + usu.getCodigo());
			System.out.println("Nome Usuário: " + usu.getNome());
		}
	}

	
	

}
