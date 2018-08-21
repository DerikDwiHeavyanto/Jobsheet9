/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class latihan4 {
    public static int kec(int j, int w){
        int k=j/w;
                return k;
    }
    public static void main(String[] args){
        Scanner b =new Scanner (System.in);
        double k;
        System.out.print("Masukan Jarak : ");
        int j=b.nextInt();
        System.out.print("Masukan Waktu : ");
        int w=b.nextInt();
         k= kec(j,w);
        System.out.println("Kecepatan = " + k+ "Km/jam");
        
        
        
        
    }
}
