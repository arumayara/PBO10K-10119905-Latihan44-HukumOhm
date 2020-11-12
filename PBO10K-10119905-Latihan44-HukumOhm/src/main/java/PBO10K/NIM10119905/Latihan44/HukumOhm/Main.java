/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan44.HukumOhm;

/**
 *
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program HukumOhm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai objBaterai = new Baterai(3, 12);
        System.out.println("=== Hukum Ohm ===");
        System.out.println("Kuat Arus yang mengalir pada suatu kawat penghantar \nakan berbanding lurus dengan beda potensial \npada ujung-ujung kawa penghantar tersebur \nasal suhu kawat dijaga konstan.");
        System.out.println("Kuat Arus : "+objBaterai.getKuatArus()+ " Ampere");
        System.out.println("Hambatan : "+objBaterai.getHambatan()+ " Ampere");
        System.out.println("Tegangan : "+objBaterai.hitungTegangan()+ " Volt");
    }
    
}
