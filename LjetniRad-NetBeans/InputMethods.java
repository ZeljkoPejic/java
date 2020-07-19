/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.ljetnizadatak;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

/**
 *
 * @author CODLasay
 */
public class InputMethods {

    private static Scanner sc = new Scanner(System.in);
    private static CRUDmetode crud = new CRUDmetode();

    public static int akcija() {

        int izbor;
        String poruka="Krivi unos";

        while (true) {
            try {
                System.out.print("Odaberi akciju: ");
                izbor = sc.nextInt();
                sc.nextLine();
                
                if (izbor <= 7 && izbor >= 1) {
                    return izbor;
                }
                System.out.println(poruka);
                
            } catch (Exception e) {
                System.out.println(poruka);
                sc.nextLine();
            }
        }

    }

    public static void goToAddress(String url) {

        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI goTo = new URI(url);
            desktop.browse(goTo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void ispis(){
        
        crud.readOsobe();
        
    }
    
    

}
