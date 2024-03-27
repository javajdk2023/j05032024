package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.model.Entidade;

public interface IDAO {
	void inserir(Connection conn, Entidade e);
}
