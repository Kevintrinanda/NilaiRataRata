/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10117008latihan21;

/**
 *
 * @author ASUS
 *  Nama         : Kevin Trinanda
 * Kelas        : IF-1 V
 * NIM          : 10117008
 * Deskripsi    : Program ini akan membantu kita menentukan rata-rata nilai mahasiswa
 */
import java.util.Scanner;
public class PBO10117008Latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int array[], i, n;
    array = new int[100];
    float rata, total=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan Banyaknya Mahasiswa : ");
    n = scan.nextInt();
    for(i = 1; i <= n; i++){
      System.out.print("Nilai Mahasiswa Ke-"+ i +" : ");
      array[i] = scan.nextInt();
      total = total + array[i];
    }
    rata = total/n;
   
    System.out.println("Maka, Rata-rata Nilainya adalah : " + rata);
    System.out.println("Developed by : Kevin Trinanda");
    }
    
}
