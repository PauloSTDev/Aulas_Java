package br.edu.imed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CadastroUsuario {

	public static void cadastrarUsuario(Usuario u) {
		
		Connection con;
		
		try {
			
			String url = "jdbc:sqlite:C:\\Users\\afons\\Users.db";
			
			con = DriverManager.getConnection(url);
						
			String sql = "INSERT INTO usuario(nome, senha) VALUES(?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, u.getNome());
			ps.setString(2, u.getSenha());
			ps.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
