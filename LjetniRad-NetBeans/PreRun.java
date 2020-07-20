/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.ljetnizadatak;

/**
 *
 * @author ...
 */
public class PreRun {

    private InputMethods input = new InputMethods();
    
    public PreRun() {

        while (true) {

            switch (izbornik()) {

                case 1:
                    input.unosOsobe();
                    break;
                case 2:
                    input.ispis();
                    break;
                case 3:
                    input.promjenaOsobe();
                    break;
                case 4:
                    input.brisanjeOsobe();
                    break;
                case 5:
                    input.goToAddress("https://github.com/ZeljkoPejic/hellojp22/blob/master/era.jpg");
                    break;
                case 6:
                    input.goToAddress("https://github.com/ZeljkoPejic/java/tree/master/LjetniRad-NetBeans");
                    break;
                case 7:
                    System.out.println("Doviđenja");
                    Baza.zatvoriVezu();
                    return;

            }
        }

    }

    private int izbornik() {

        System.out.println("******************************");
        System.out.println(" 1 - Kreiraj novu osobu");
        System.out.println(" 2 - Ispis svih osoba");
        System.out.println(" 3 - Promjena podataka osobe");
        System.out.println(" 4 - Obriši osobu");
        System.out.println(" 5 - Idi na ERA dijagram");
        System.out.println(" 6 - Idi na kod aplikacije");
        System.out.println(" 7 - Izlaz iz aplikacije");
        System.out.println("******************************");

        return input.akcija();
    }

}
