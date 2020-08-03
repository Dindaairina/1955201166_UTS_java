/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2dimensi;

/**
 *
 * @author HP
 */
public class array2Dimensi {
    public static void main(String[] args) {
        String names[][] ={
            {"Mojokerto ","Malang","Kediri","Blitar"},
            {"dinda","vitri","puput","okta"}
        };
        int jumlah[] = {
            2,3,4
        };
        
        System.out.println(names[0][0] + names[1][0] +"membeli buku" + jumlah [0]);
        System.out.println(names[0][1] + names[1][1] +"membeli pensil" + jumlah [1]);
        System.out.println(names[0][2] + names[1][2] +"membeli penghapus" + jumlah [2]);
    }
}
