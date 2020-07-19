/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CODLasay
 */
public class CRUDmetode {
    
    public void createOsoba(String ime, String prezime, String oib){
        
        try {
            PreparedStatement query = Baza.otvoriVezu().prepareStatement("INSERT INTO osoba (ime,prezime,OIB)" + " VALUES (?,?,?)");
            
            query.setString(1, ime);
            query.setString(1, prezime);
            query.setString(1, oib);
            
            query.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CRUDmetode.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void readOsobe(){
        int redniBroj=1;
        String oib;
        try {
            PreparedStatement query = Baza.otvoriVezu().prepareStatement("SELECT * FROM osoba;");
                        
            ResultSet rs = query.executeQuery();
                                  
            while(rs.next()){
                if(rs.getString(4)==null){
                    oib = "nije unešen";
                }else{
                    oib = rs.getString(4);
                }
                System.out.println((redniBroj++)+". "+rs.getString(2)+" "+rs.getString(3)+" "+"OIB: "+oib);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CRUDmetode.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
