package pejic.ljetnizadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// singleton
public class Baza {

	private static Connection veza;
	private static final String DSN="jdbc:mariadb://localhost/kuharica";
	private static final String KORISNIK="edunova";
	private static final String LOZINKA="edunova";
	
	
	
	public static Connection otvoriVezu() {
		
		if(veza==null) {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				veza = DriverManager.getConnection(DSN,KORISNIK,LOZINKA);
				
							
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return veza;
	}
	
	public static void zatvoriVezu() {
		
		try {
			veza.close();
		} catch (Exception e) {
			
			
		}
	}
	
	
	
}