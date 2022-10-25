package br.edu.imed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {

	public static List<Usuario> obterUsuarios(){
		
		Connection con;
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			
			String url = "jdbc:sqlite:C:\\Users\\afons\\Users.db";
			
			con = DriverManager.getConnection(url);
			
			String sql = "SELECT nome, senha FROM usuario ";
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				Usuario u = new Usuario(rs.getString("nome"), rs.getString("senha"));
				usuarios.add(u);
			}
			
			//System.out.println("Ok!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return usuarios;
	}
}
