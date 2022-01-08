package techproed.jdbcOrnekler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Query01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1- ilgili driveri yuklemeliyiz
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2-- baglanti olusturmaliyiz
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "Hsnbsry0909+");
		
		//3-SQL komutlari icin bir Statement nesnesi  olustur
		
		Statement st=con.createStatement();
		
		//4-- SQL ifadeleri yazabilir ve calistirabiliriz.
		
		ResultSet veri=st.executeQuery("SELECT isim,maas FROM personel WHERE id=123456789");
		
		// 5-- sonuclari aldik ve isledik
		
		while (veri.next()) {
			System.out.println(veri.getString("isim")+" "+veri.getInt("maas"));
		}
		
		
		
		
		

	}

}
