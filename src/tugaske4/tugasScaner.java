 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaske4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tugasScaner {
    public static void main(String[] args) {
        //type data yang saya gunakan
        String nama,alamat;
        int usia,tahunlusus;
        double tinggibadan;
        
        //new scenner
        Scanner keyboard = new Scanner(System.in);
        
        //output to user 
        System.out.println("!!! data peserta lomba robotika !!!");
        System.out.println(" nama mahasiswi ");
        //apa yang disimpan di type data
        nama = keyboard.nextLine();
        //tampilkan output
        System.out.println("agama: ");
        String agama = keyboard.nextLine();
        
        System.out.println("universitas");
        String universitas = keyboard.nextLine();
                
        System.out.println("fakultas");
        String fakultas = keyboard.nextLine();
        
        System.out.println("prodi");
        String prodi = keyboard.nextLine();
        
        System.out.println("semester");
        String semester = keyboard.nextLine();
        
        System.out.println("ipk");
        double ipk = keyboard.nextDouble();
        
        System.out.println("usia: ");
        usia = keyboard.nextInt();
        
        System.out.println("tahun lulus");
        int tahunlulus = keyboard.nextInt();
        
        System.out.println("tinggi badan");
        tinggibadan = keyboard.nextDouble();
        
        //output dari input
        System.out.println("---------");
        System.out.println("nama alamat: " + nama);
        System.out.println("agama: " + agama);
        System.out.println("asal universitas: " + universitas);
        System.out.println("fakultas: " + fakultas);
        System.out.println("prodi: " + prodi);
        System.out.println("semester: " + semester);
        System.out.println("ipk: " + ipk);
        System.out.println("usia: " + usia + "tahun");
        System.out.println("tahun lulus: " + tahunlulus);
        System.out.println("tinggi badan: " + tinggibadan);
        
        
    }
}
