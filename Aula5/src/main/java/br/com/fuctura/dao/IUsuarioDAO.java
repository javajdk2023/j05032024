package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fuctura.model.Usuario;

public interface IUsuarioDAO {
	void inserir(Connection conn, Usuario u) throws SQLException;
}
