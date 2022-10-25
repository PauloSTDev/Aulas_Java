package br.edu.imed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ListaViagens {

	public static List<Viagem> ObterViagem() {
		
		Connection con;
		
		List<Viagem> viagens = new ArrayList<Viagem>();
		
		try {
			System.out.println("SIm");
			String url = "jdbc:sqlite:C:\\Users\\afons\\compra.db";
			
			con = DriverManager.getConnection(url);
			
			String sql = "SELECT local, imagem, preco FROM viagem ";
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				Viagem v1 = new Viagem(rs.getString("local"), rs.getString("imagem"), rs.getString("preco"));
				Viagem.add(v1);
				System.out.println(v1.getlocal());
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return viagens;
	}
}
