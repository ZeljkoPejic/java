/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.ljetnizadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CODLasay
 */
public class Baza {

    private static Connection veza;

    public static Connection otvoriVezu() {

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            veza = DriverManager.getConnection("jdbc:mariadb://localhost/kuharica", "edunova", "edunova");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
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
