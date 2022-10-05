/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class KonversiNilai {
    public static void main(String[] args) {
        String nim, nama, prodi, matkul;
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("========Masukan Data=======");
        System.out.println("Masukkan NIM =");
               nim = masukan.nextLine();
               System.out.println("Masukkan Nama =");
               nama = masukan.nextLine();
               System.out.println("Matakuliah");
               matkul = masukan.nextLine();
               System.out.println("Masukkan Nilai Angka");
               nilai = masukan.nextInt();
              
//       ========MENGAMBIL PRODI DARI NIM substring
//               prodi = nim.substring(3);
//               System.out.println(prodi);
//               =======MENGAMBIL PRODI DARI NIM
                prodi = nim.substring(3, 5);
//                if (prodi.equals("52")){
//                System.out.println("Program Studi = S-1 TI");
//                 } else if (prodi.equals("51")){
//                System.out.println("Program Studi = S-1 SI");
//                } else if(prodi.equals("31")){
//                System.out.println("Program Studi = D-3 SI");
//                } else {
//                System.out.println("Program studi Tidak Tersedia");
//                }
   switch (prodi){
       case "52" :
               System.out.println("Program Studi S-1 TI");
               break ;
       case "51" :
               System.out.println("Program Studi S-1 SI");
               break ;
       case "31" :
               System.out.println("Program Studi D-3 SI");
               break ;
       default :
               System.out.println("Prodi Tidak Tersedia");
               break ;
   }           
    }
}            
    

