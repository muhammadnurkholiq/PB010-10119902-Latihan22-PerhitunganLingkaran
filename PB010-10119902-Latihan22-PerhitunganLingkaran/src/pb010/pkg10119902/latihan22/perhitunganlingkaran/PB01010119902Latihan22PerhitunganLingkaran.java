/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 * 
 * @author
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF-10K
 * NIM      : 10119902
 * Deskripsi Program : Program ini berisi program untuk Menghitung Perhitungan Lingkaran
 * 
 */

public class PB01010119902Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double diameter, jariJari, luas, keliling;
        double phi = 3.14;
        boolean isPassed = false;
        String luasString, kelilingString;

        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");

        while(true) 
        {
            try 
            {
                diameter = Double.parseDouble(scanner.next());
                break;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Nilai diameter tidak sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }

        jariJari = diameter / 2;
        luas = phi * jariJari * jariJari;
        keliling = 2 * phi * jariJari;

        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran\t\t= %.0f cm%n", jariJari);
        System.out.printf("Luas Lingkaran\t\t\t= %s cm%n", luas);
        System.out.printf("Keliling lingkaran\t\t= %s cm%n", keliling);
    }
    
}

