package edunova;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Zadatak3 {

	public static void main(String[] args) throws SQLException {

		PreparedStatement izraz;
		int broj, sifra;
		
		

		// u bazi obrisati sve smjerove koji u svom nazivu imaju parni broj
		izraz = Baza03.getVeza().prepareStatement("Select sifra, naziv from smjer where naziv regexp '[0-9]';");
				
		ResultSet rs = izraz.executeQuery();
		
		izraz = Baza03.getVeza().prepareStatement("delete from smjer where sifra = (?);");
		
		while (rs.next()) {

			
			broj = Integer.parseInt(rs.getString(2).replaceAll("[^0-9]+", " ").trim());
			
			
			if (broj % 2 == 0) {
				
				sifra = rs.getInt(1);
				
				izraz.setInt(1, sifra);
				izraz.executeUpdate();
			}
			
		}
		rs.close();
		izraz.close();
		
	}
}

		

	// u bazi obrisati sve smjerove koji u svom nazivu imaju parni broj

//	public static void main(String[] args) {
//
//		try {
//			PreparedStatement izraz = Baza03.getVeza().prepareStatement("select sifra, naziv from smjer");
//			ResultSet rs = izraz.executeQuery();
//			String naziv;
//			String[] djelovi;
//			int broj;
//			List<Integer> zaBrisanje = new ArrayList<Integer>();
//			while (rs.next()) {
//				naziv = rs.getString("naziv");
//				System.out.println(naziv);
//				djelovi = naziv.split(" ");
//				for (String s : djelovi) {
//					System.out.println("\t" + s);
//					try {
//						broj = Integer.parseInt(s);
//						if (broj % 2 == 0) {
//							System.out.println("Dodao u brisanje");
//							zaBrisanje.add(rs.getInt("sifra"));
//							break;
//						}
//					} catch (Exception e) {
//
//					}
//				}
//			}
//			rs.close();
//			izraz.close();
//			izraz = Baza03.getVeza().prepareStatement("delete from smjer where sifra=?");
//			for (Integer sifra : zaBrisanje) {
//				izraz.clearParameters();
//				izraz.setInt(1, sifra);
//				izraz.executeUpdate();
//			}
//			izraz.close();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}


