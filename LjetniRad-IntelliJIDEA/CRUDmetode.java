package pejic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDmetode {

    private PreparedStatement izraz;

    private void createOsoba(String ime, String prezime, String oib){

        try {
            izraz = Baza.spojiNaVezu().prepareStatement("INSERT INTO osoba (ime, prezime, OIB)" +
                    " VALUES (?,?,?)");

            izraz.setString(1, ime);
            izraz.setString(2, prezime);
            izraz.setString(3, oib);

            izraz.executeUpdate();
            izraz.clearParameters();
            izraz.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void readOsoba(){

        int redniBroj=0;

        try{
            izraz = Baza.spojiNaVezu().prepareStatement("SELECT * FROM osoba");

            ResultSet rs = izraz.executeQuery();

            while(rs.next()){
                System.out.println((++redniBroj)+". " + rs.getString("ime") + " "+ rs.getString("prezime")+ " OIB: "+rs.getString("OIB"));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }


}
