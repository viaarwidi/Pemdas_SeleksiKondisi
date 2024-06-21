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
public class Nomor2 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Berat badan(Kg): ");
        double b=scan.nextDouble();
        System.out.print("Tinggi badan(m): ");
        double t=scan.nextDouble();
        
        System.out.println(" ");
        double IMT= b/(t*t);
        System.out.print("IMT = "+IMT);
        
        if(IMT <= 18.5){
        System.out.print("\t Termasuk Kurus");
        }
        else if(18.5 < IMT && IMT <= 25){
        System.out.print("\t Termasuk Normal");
        } 
        else if(25 < IMT && IMT <= 30){
            System.out.print("\t Termasuk Gemuk");
        }
        else{
            System.out.print("\t Termasuk Kegemukan");
        }
    }
}
