package pejic.ljetnizadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Baza {

    private static Connection veza;

    public static Connection spojiNaVezu(){

        if(veza.equals(null)) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
               veza = DriverManager.getConnection("jdbc:mariadb://localhost/kuharica","edunova","edunova");




            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

        }

        return veza;
    }

    public static void zatvoriVezu(){
        try{
            veza.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }


}
