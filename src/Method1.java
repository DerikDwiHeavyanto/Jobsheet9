/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Method1 {
    public static int hitung(int a,int b){
        int c = b+a;
        return c;
    }
    public static void main (String[] args){
        int c;
        int bil1=12, bil2=12;
        
        c = hitung (bil1,bil2);
        System.out.println("Hasil : "+c);
    }
    
}
