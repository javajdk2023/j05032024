package fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fuctura.model.Usuario;

public class UsuarioDAO {

	public static void inserir(Connection conexao, Usuario usu) throws SQLException {
		System.out.println("Conectado Com sucesso!");
		// 1, 2, 3
		String comandoInsert = "insert into usuario (nome, idade, email) \r\n" + "values (?, ?, ?)";

		PreparedStatement pstm = conexao.prepareStatement(comandoInsert);

		pstm.setInt(2, usu.getIdade());
		pstm.setString(1, usu.getNome());
		pstm.setString(3, usu.getEmail());

		pstm.execute();

		System.out.println("Registro Inserido  com sucesso!");
		
		
	
		
		
	}
	
	
	public List<Usuario> consultarPorNome(Connection conexao, Usuario u) throws SQLException {
		
		String comandoDeConsulta = "select * from usuario where nome LIKE = ?";
		
		PreparedStatement pstm = 
				conexao.prepareStatement(comandoDeConsulta);
		
		pstm.setString(1, u.getNome());
		
		ResultSet resultadoConsulta =  pstm.executeQuery();
		
		
		
		List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
		
		while(resultadoConsulta.next()) {
			//vai entrar no loop se tiver dados
			//
			int codigoUsuario = resultadoConsulta.getInt("codigo");
			String nomeUsuario = resultadoConsulta.getString("nome");
		
			Usuario resultadoObjeto = new Usuario();
			resultadoObjeto.setCodigo(codigoUsuario);
			resultadoObjeto.setNome(nomeUsuario);
			
			listaDeUsuarios.add(resultadoObjeto);
		}
		
		return listaDeUsuarios;

		
		
		
	}
	
	public  Usuario consultar(Connection conexao, Usuario u) throws SQLException {
		//Vamos consultar todos os usuarios
		
				String comandoDeConsulta = "select * from usuario where codigo = ?";
				
				PreparedStatement pstm = 
						conexao.prepareStatement(comandoDeConsulta);
				
				pstm.setInt(1, u.getCodigo());
				
				
				ResultSet resultadoConsulta =  pstm.executeQuery();
				
				Usuario resultadoObjeto = new Usuario();
				
				while(resultadoConsulta.next()) {
					//vai entrar no loop se tiver dados
					//
					int codigoUsuario = resultadoConsulta.getInt("codigo");
					String nomeUsuario = resultadoConsulta.getString("nome");
					
					resultadoObjeto.setCodigo(codigoUsuario);
					resultadoObjeto.setNome(nomeUsuario);
					
				}
				
				
				return resultadoObjeto;
	}	
	
}
