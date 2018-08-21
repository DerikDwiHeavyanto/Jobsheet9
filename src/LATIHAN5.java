
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
public class LATIHAN5 {
   public static int hasil(int bil1,int bil2,int bil3,int gol){
       if(bil1>bil2 && bil1 > bil3){
           gol = bil1;
           
       }else if (bil2>bil1 && bil2 > bil3){
           gol = bil2;
       }else {
           gol = bil3;
       }
       return gol;
   }
    
   public static void main (String[] args){
       Scanner kk= new Scanner (System.in);
       
       System.out.print("Masukan bilangan I : ");
       int bil1 =kk.nextInt();
       System.out.print("Masukan bilangan II: ");
       int bil2 =kk.nextInt();
       System.out.print("Masukan bilangan III: ");
       int bil3 =kk.nextInt();
     int h = 0;
     int hhh= hasil(bil1,bil2,bil3,h);
      
      
      System.out.println("Yang terbesar adalah bilangan = " +hhh);
   }
}
