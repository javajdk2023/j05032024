package fuctura.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Aplicacao {

	public static void inserir(Connection conexao, String nome, String email, int idade) throws SQLException {
		System.out.println("Conectado Com sucesso!");
		// 1, 2, 3
		String comandoInsert = "insert into usuario (nome, idade, email) \r\n" + "values (?, ?, ?)";

		PreparedStatement pstm = conexao.prepareStatement(comandoInsert);

		pstm.setInt(2, idade);
		pstm.setString(1, nome);
		pstm.setString(3, email);

		pstm.execute();

		System.out.println("Registro Inserido  com sucesso!");
	}
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "123";

		var conexao = DriverManager.getConnection(url, username, password);
		
		//scanner 
		String nome = "";
		String email = "";
		int idade = 0;
		
		inserir(conexao, nome, email, idade);
		
		
		System.out.println("aui");
	}

	

}
