/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo1;

/**
 *
 * @author diajeng 
 */
import java.util.Scanner;

public class Pbo1 {

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

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai 1: ");
        int nilai1 = input.nextInt();

        System.out.print("Masukkan nilai 2: ");
        int nilai2 = input.nextInt();
        
        System.out.println("Apakah 1 lebih besar dari 2? " + (nilai1 > nilai2));
        System.out.println("Apakah 1 lebih kecil dari 2? " + (nilai1 < nilai2));
        System.out.println("Apakah 1 sama dengan 2? " + (nilai1 == nilai2));
        System.out.println("Apakah 1 tidak sama dengan 2? " + (nilai1 != nilai2));
        System.out.println("Apakah 1 lebih besar atau sama dengan 2? " + (nilai1 >= nilai2));
        System.out.println("Apakah 1 lebih kecil atau sama dengan 2? " + (nilai1 <= nilai2));
        System.out.println("============================================================");
        System.out.println("Operator Bitwise");
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();

        // Operasi bitwise
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~a;

        // Output hasil operasi bitwise
        System.out.println("Hasil operasi AND: " + c);
        System.out.println("Hasil operasi OR: " + d);
        System.out.println("Hasil operasi XOR: " + e);
        System.out.println("Hasil operasi negasi: " + f);
    }
}
    
