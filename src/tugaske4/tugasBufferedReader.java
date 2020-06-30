/*
 * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaske4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class tugasBufferedReader {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
          
        String nama ;
        String agama ;
        String status ;
        String universitas ;
        String fakultas ;
        String prodi ;
        String semester ;
        double ipk ;
        double tinggibadan ;
        int usia ;
        int tahunlulusSMA ;
        
        System.out.println("===========");
        
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        
        System.out.println("apa agama yang anda anut?");
        agama = br.readLine();
        
        System.out.println("apa status anda sekarang?");
        status = br.readLine();
        
        System.out.println("apa nama universtitas anda?");
        universitas = br.readLine();
        
        System.out.println("apa fakultas yang anda pilih?");
        fakultas = br.readLine();
        
        System.out.println("apa prodi yang anda pilih?");
        prodi = br.readLine();
        
        System.out.println("semester berapa anda sekarang?");
        semester = br.readLine();
        
        System.out.println("berapa ipk terakhir yang anda dapatkan?");
        ipk = Double.parseDouble(br.readLine());
        
        System.out.println("berapa tinggi badan anda?");
        tinggibadan = Double.parseDouble(br.readLine());
        
        System.out.println("berapa usia anda sekarang?");
        usia = Integer.parseInt(br.readLine());
        
        System.out.println("tahun lulus pendidikan terhakir anda?");
        tahunlulusSMA = Integer.parseInt(br.readLine());
        
        System.out.println("===========");
        System.out.println("nama anda adalah :" + nama);
        System.out.println("agama yang anda anut adalah :" + agama);
        System.out.println("status anda sekarang adalah :" + status);
        System.out.println("nama universitas anda adalah :" + universitas);
        System.out.println("anda sekarang berada di fakultas :" + fakultas);
        System.out.println("prodi yang anda pilih adalah :" + prodi);
        System.out.println("anda sekarang semester :" + semester);
        System.out.println("ipk yang anda adalah :" + ipk);
        System.out.println("tinggi badan anda adalah :" + tinggibadan);
        System.out.println("usia anda sekarang adalah :" + usia);
        System.out.println("tahun lulus pendidikan terakhir anda adalah :" + tahunlulusSMA);
        
        
        
        
        
        
        
        
    }
}
