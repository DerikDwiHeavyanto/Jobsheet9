
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class latihan4 {
    public static int kec (int j, int w)
    {
        int k = j/w;
        return k;
        
    }
    public static void main (String[] args){
        Scanner qq=new Scanner(System.in);
        System.out.print("Masukan Jarak: ");
        int b=qq.nextInt();
        System.out.print("Waktu tempuh: ");
        int v=qq.nextInt();
        double k;
         k=kec(b,v);
        System.out.println("kecepatan: "+k+"Km/s");
        
        
    }
    
}
