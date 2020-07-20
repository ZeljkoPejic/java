/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.ljetnizadatak;

import java.awt.Desktop;
import java.net.URI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ...
 */
public class InputMethods {

    private static Scanner sc = new Scanner(System.in);
    private static final CRUDmetode crud = new CRUDmetode();

    public int akcija() {

        int izbor;
        String poruka = "----Krivi unos----";

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

    public void goToAddress(String url) {

        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI goTo = new URI(url);
            desktop.browse(goTo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String unosOIB(String poruka) {

        String oib;
        int a = 10;
        int kontrolni = 11;

        while (true) {

            System.out.print(poruka);
            oib = sc.nextLine();

            if (oib.isEmpty()) {
                return null;
            }

            if (oib.length() != 11) {
                System.out.println("----Krivi unos OIB-a----");
                continue;
            }

            try {
                Long.parseLong(oib);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 10; i++) {
                a = a + Integer.parseInt(oib.substring(i, i + 1));
                a = a % 10;
                if (a == 0) {
                    a = 10;
                }
                a *= 2;
                a = a % 11;
            }

            kontrolni = kontrolni - a;

            if (kontrolni == 10) {
                kontrolni = 0;
            }

            if (kontrolni == Integer.parseInt(oib.substring(10))) {
                return oib;
            } else {
                System.out.println("----Neispravan OIB----");
            }

        }

    }

    private int sifra(Integer redniBroj) {

        try {
            PreparedStatement query = Baza.otvoriVezu().prepareStatement("SELECT sifra FROM osoba;");

            ResultSet rs = query.executeQuery();

            while (rs.next()) {

                if (redniBroj.equals(rs.getRow())) {
                    return rs.getInt(1);
                }

            }
            
            System.out.println("----Osoba pod rednim brojem " + redniBroj + " ne postoji----");

        } catch (SQLException ex) {
            System.out.println("----Krivi unos----");
        }

        return 0;
    }

    // METODE KOJE OBRAĐUJU PODATKE OSOBE/A
    public void unosOsobe() {

        String ime = "", prezime = "", oib;

        while (ime.isEmpty() || !ime.matches(".*[a-zA-Z]+.*")) {

            System.out.print("Unesi ime: ");
            ime = sc.nextLine();
        }

        while (prezime.isEmpty() || !prezime.matches(".*[a-zA-Z]+.*")) {
            System.out.print("Unesi prezime: ");
            prezime = sc.nextLine();
        }

        oib = unosOIB("Unesi OIB: ");

        crud.createOsobe(ime, prezime, oib);

        System.out.println("Unos osobe je uspješno izvršen");

    }

    public void ispis() {

        crud.readOsobe();

    }

    public void promjenaOsobe() {

        Integer redniBroj;
        crud.readOsobe();
        
        while(true){
            System.out.print("Unesi redni broj osobe za promjenu: ");
            try{
                redniBroj = sifra(sc.nextInt());
                sc.nextLine();
                break;
            }catch(Exception e){
                System.out.println("----Krivi unos----");
                sc.nextLine();
            }
        }
        
        if (redniBroj.equals(0)) {
            return;
        }
        
        String ime = "", prezime = "", oib;

        while (ime.isEmpty() || !ime.matches(".*[a-zA-Z]+.*")) {

            System.out.print("Unesi novo ime: ");
            ime = sc.nextLine();
        }

        while (prezime.isEmpty() || !prezime.matches(".*[a-zA-Z]+.*")) {
            System.out.print("Unesi novo prezime: ");
            prezime = sc.nextLine();
        }

        oib = unosOIB("Unesi novi OIB: ");

        crud.updateOsobe(redniBroj, ime, prezime, oib);

        System.out.println("Promjena osobe je uspješno izvršena");
        
    }

    public void brisanjeOsobe() {

        Integer redniBroj;
        crud.readOsobe();
        
        while(true){
            System.out.print("Unesi redni broj osobe za brisanje: ");
            try{
                redniBroj = sifra(sc.nextInt());
                sc.nextLine();
                break;
            }catch(Exception e){
                System.out.println("----Krivi unos----");
                sc.nextLine();
            }
        }
       
        if (redniBroj.equals(0)) {
            return;
        }

        crud.deleteOsobe(redniBroj);
        
        System.out.println("Osoba je uspješno obrisana");
    }
}
