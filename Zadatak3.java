package edunova;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Zadatak3 {

	public static void main(String[] args) throws SQLException {

		PreparedStatement izraz;
		int a;
		

		// u bazi obrisati sve smjerove koji u svom nazivu imaju parni broj
		izraz = Baza03.getVeza().prepareStatement("Select naziv from smjer where naziv like 'smjer%';");

		ResultSet rs = izraz.executeQuery();

		while (rs.next()) {

			a = Integer.parseInt(rs.getString(1).replaceAll("[^0-9]+", " ").trim());
			
			if (a % 2 == 0) {

				izraz = Baza03.getVeza().prepareStatement("delete from smjer where naziv = (?)");
				izraz.setString(1, "Smjer " + a);
				izraz.executeUpdate();
			}
			

		}

	}
}
