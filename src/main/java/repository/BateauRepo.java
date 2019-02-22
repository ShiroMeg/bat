package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;



public class BateauRepo {
	
	private static final String url = "jdbc:mysql://localhost:3306/bateau?serverTimezone=Europe/Paris";
	private static final String user = "bat";
	private static final String password = "password";
	
	public static List<String> findAll() {
		MysqlDataSource ds = new MysqlDataSource();
//		String url = "jdbc:mysql://root@localhost:3306/bateau";
		ds.setUrl(url);
		ds.setUser(user);
		ds.setPassword(password);
		try (Connection conn = ds.getConnection();
				Statement st = conn.createStatement();
				ResultSet res = st.executeQuery("select * from bateau")) {
			List<String> bateaux = new ArrayList<String>();
			while (res.next()) {
				bateaux.add(res.getString("nom"));
			}
			return bateaux;
		} catch (SQLException e) {
			System.err.println("Erreur lecture MySQL :" + e.getMessage());
			return Collections.singletonList("MYSQL ERROR : " + e.toString() + " : " + e.getMessage());
		}
	}
}
