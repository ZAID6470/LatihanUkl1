/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl1;

/**
 *
 * @author MOKLET-2
 */
public class Latihanukl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        int selisih = 5;
        int jumlahsuku = 10;
        int nilaisuku;
        int total = 0;
        
        System.out.println("Deret Aritmatika");
        
        for(int i=1; i<=jumlahsuku; i++){
            
            nilaisuku = a;
            a += selisih;
            
            System.out.println("Suku ke - "+i+ " : " + nilaisuku);
            
            total += nilaisuku;
        }
        
        System.out.println("Total Nilai = " +total);
    }
    
}
