/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaske4;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class tugasJOptionpane {
    public static void main(String[] args) {
     
        
        String tanya = JOptionPane.showInputDialog("siapa nama anda?");
        String agama = JOptionPane.showInputDialog("apa agama anda?");
        String universitas = JOptionPane.showInputDialog("asal universitas?");
        String fakultas = JOptionPane.showInputDialog("apa fakultas yang anda pilih?");
        String prodi = JOptionPane.showInputDialog("apa jurusan yang anda pilih?");
        String semester = JOptionPane.showInputDialog("semester berapa anda sekarang?");
        String ipk = JOptionPane.showInputDialog("berapa ipk terakhir anda?");
        String usia = JOptionPane.showInputDialog("berapa usia anda sekarang?");
        String tahunlulus = JOptionPane.showInputDialog("tahun lulus anda?");
        String tinggibadan = JOptionPane.showInputDialog("berapa tinggi badan anda?");
        
        int jumlah = Integer.parseInt(usia);
        int banyakpeserta = 1200;
         double total = jumlah*banyakpeserta;
        
        System.out.println("siapa nama anda :" + tanya);
        System.out.println("apa agama anda :" + agama);
        System.out.println("asal universitas :" + universitas);
        System.out.println("apa fakultas yang anda pilih :" + fakultas);
        System.out.println("apa jurusan yang anda pilih :" + prodi);
        System.out.println("semester berapa anda sekarang :" + semester);
        System.out.println("berapa ipk terakhir anda :" + ipk);
        System.out.println("berapa usia anda sekarang :" + usia);
        System.out.println("tahun lulus anda :" + tahunlulus);
        System.out.println("berapa tinggi badan anda :" + tinggibadan);
    }
}
