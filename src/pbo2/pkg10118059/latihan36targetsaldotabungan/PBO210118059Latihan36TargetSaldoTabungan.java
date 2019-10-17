/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan36targetsaldotabungan;

/**
 *
 * @author 
 *  Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tabungan = new Tabungan();
        
        tabungan.setSaldo(3500000);
        tabungan.setTargetSaldo(6000000);
        tabungan.setBunga(0.08);
        
        tabungan.hitungTarget();
    }
    
}
