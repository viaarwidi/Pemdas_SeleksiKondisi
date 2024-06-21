/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul1bab2;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
            System.out.println("Menu :");
            System.out.println("1. menghitung luas dan keliling persegi panjang\n" +
                               "2. menghitung luas dan keliling lingkaran\n" +
                               "3. menghitung luas dan keliling segitiga");
        System.out.print( "Pilihan anda :" );
        int pilihan = scan.nextInt(); //berfungsi untuk menginput 'pilihan' kita dengan tipe data integer
        System.out.print( "Masukkan a :" );
        int a = scan.nextInt(); //
        System.out.print( "Masukkan b :" );
        int b = scan.nextInt();
        System.out.print( "Masukkan r :" );
        int r = scan.nextInt();
        
        double LPP,KllPP,LL,KllL,LS,KllS;
        
        switch (pilihan) {
            case 1 :{ //blok kasus pertama dari switch statement 
            LPP = a*b; //variable yang menyimpan rumus operasi hitung luas Persegi Panjang 
            KllPP = 2*(a+b); //variable yang menyimpan rumus operasi hitung keliling Persegi Panjang 
                System.out.println(" ");//untuk memberi spasi enter pada output
            System.out.println("Keliling persegi panjang:" +KllPP +"cm");//print out hasil perhitungan variable KllPP
            System.out.println("Luas persegi panjang    :" +LPP+ "cm2");//print out hasil perhitungan variable LP
            }
            break;
            case 2 :{
             LL = Math.PI*Math.pow(r, 2);
             KllL = Math.PI*r*2; 
                 System.out.println(" ");
            System.out.println("Keliling lingkaran:" +KllL +" cm");
            System.out.println("Luas lingkaran    :" + LL + "cm2");
            }
            break;
            case 3 :{
             LS = a*b/2;
             KllS = a+b+ Math.sqrt(a*a+b*b); 
                 System.out.println(" ");
            System.out.println( "Keliling segitiga:" +KllS +"cm");
            System.out.println( "Luas segitiga    :" +LS +"cm2");
            }
            break;
            default:
            {
                 System.out.println(" ");
               System.out.println("Data tak ditemukan, program dihentikan ...");
            }
               break;
        }
     
    }
}
