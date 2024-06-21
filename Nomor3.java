/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul1bab2;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Jam Kerja : ");
        int jam=scan.nextInt();
        
        int upah = 0;
        int lembur = 0;
        int denda = 0;
        
        final int minKerja = 50;
        final int upahPerJam = 5000;
        final int lemburPerJam = 6000;
        final int maxKerja = 60;
        final int dendaPerJam = 1000;
        
        if(jam >= minKerja && jam <= maxKerja ){
            upah=jam*upahPerJam;
        }
        else if (jam < minKerja){
            upah=jam*upahPerJam;
            denda= (minKerja-jam)*dendaPerJam;
        }
        else{
            upah=maxKerja*upahPerJam;
            lembur= (jam-maxKerja)*lemburPerJam;
        }
        
        int total = upah + lembur - denda;
        
        System.out.println("Upah\t= Rp. "+upah);
        System.out.println("Lembur\t= Rp. "+lembur);
        System.out.println("Denda\t= Rp. "+denda);
        System.out.println("----------------------------------");
        System.out.println("Total\t= Rp. "+ total);
    }
}
