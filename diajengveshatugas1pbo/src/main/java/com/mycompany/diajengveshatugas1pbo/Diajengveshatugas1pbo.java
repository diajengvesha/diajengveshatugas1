/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diajengveshatugas1pbo;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Diajengveshatugas1pbo {


    
        
public static void main(String[] args) {
        double Nilai1;
        double Nilai2;
        double hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 =keyboard.nextInt();
//
       // penjumlahan
        hasil = Nilai1 + Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
       // pengurangan
        hasil = Nilai1 - Nilai2;
        System.out.println("Hasil = " + hasil);
//
         System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();     
        // perkalian
        hasil = Nilai1 * Nilai2;
        System.out.println("Hasil = " + hasil);
//
      System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
//        // Pembagian
        hasil = Nilai1 / Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = Nilai1 % Nilai2;
        System.out.println("Hasil = " + hasil);
        System.out.println("================================================");
        System.out.println("Operator Pembanding");
        double nilai1;
        double nilai2;
        Scanner input = new Scanner(System.in);
//

        //lebih besar
        System.out.print("Masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai2 = input.nextInt();
        System.out.println("Apakah 1 lebih besar dari 2? " + (nilai1 > nilai2));
        
//
        //lebih kecil
        System.out.print("Masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai1 = input.nextInt();
        System.out.println("Apakah 1 lebih besar dari 2? " + (nilai1 < nilai2));
        
//
        //sama dengan
        System.out.print("Masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai1 = input.nextInt();
        System.out.println("Apakah 1 sama dengan 2? " + (nilai1 == nilai2));
        
//        
        //tidak sama dengan
        System.out.print("Masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai1 = input.nextInt();
        System.out.println("Apakah 1 tidak sama dengan 2? " + (nilai1 != nilai2));
        
//
        //lebih besar atau sama dengan
        System.out.print("Masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai2 = input.nextInt();
        System.out.println("Apakah 1 lebih besar atau sama dengan dari 2? " + (nilai1 >= nilai2));
        
//        
        //lebih besar atau sama dengan
        System.out.print("Masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai1 = input.nextInt();
        System.out.println("Apakah 1 lebih kecil atau sama dengan dari 2? " + (nilai1 <= nilai2));
        System.out.println("==========================================");
        System.out.println("Operasi Bitwise");
        Scanner sc = new Scanner(System.in);
        int a, b ;
        
//        
        //operasi and
        System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();
        int c = a & b;
        System.out.println("Hasil operasi AND: " + c);
//        
        //operasi or
        System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();
        int d = a | b;
        System.out.println("Hasil operasi AND: " + d);
//
        //operasi xor
        System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();
        int e = a ^ b;
        System.out.println("Hasil operasi XOR: " + e);
        //operasi negasi
        System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b= sc.nextInt();
        int f = ~a;
        System.out.println("Hasil operasi negasi: " + f);
    //left shift
         System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();
        int g = a<<b;
        System.out.println("Hasil operasi Left Shift:"+g) ;
        //Right Shift
         System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();
        int h = a>>b;
        System.out.println("Hasil operasi Right Shift:"+h) ;
    }
}
        
        
        
   
