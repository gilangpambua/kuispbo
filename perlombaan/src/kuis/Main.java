/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;
import java.util.Scanner;
import kuis.inter.animasi;
import kuis.inter.surat;
/**
 *
 * @author USER
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double pilih;
        String nama, asal;
        int p,pp;
        double ac = 0,kon = 0;
        double krea = 0,sinema = 0;
        double ss = 0,is = 0,kreati = 0,pkb = 0;
        System.out.println("Gilang Pappa' Tanto Pambua");
        System.out.println("123200027");
        do{         
        System.out.println("--------------");
        System.out.println("| Menu Utama |");
        System.out.println("--------------");
        System.out.println("SILAHKAN MEMILIH");
        System.out.println("1. Kategori Animasi");
        System.out.println("2. Kategori Surat");
        System.out.println("3. Hasil Akhir");
        System.out.println("4. Ubah Nilai");
        System.out.println("5. Keluar");    
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        if(pilih==1){
            System.out.println("KATEGORI ANIMASI");
            System.out.print("Masukkan Nama : ");
            nama = input.next();
            System.out.print("Masukkan Asal Sekolah : ");
            asal = input.next();
            System.out.print("Masukkan Nilai");
            System.out.print("1. Nilai Alur Cerita : ");
            ac = input.nextDouble();
            System.out.print("2. Nilai Konten : ");
            kon = input.nextDouble();
            System.out.print("3. Niai Kreativitas : ");
            krea = input.nextDouble();
            System.out.print("4. Nilai Sinematografi : ");
            sinema = input.nextDouble();
        }
        else if(pilih==2){         
            System.out.println("KATEGORI Menulis Surat");
            System.out.print("Masukkan Nama : ");
            nama = input.next();
            System.out.print("Masukkan Asal Sekolah : ");
            asal = input.next();
            System.out.println("Masukkan Nilai");
            System.out.print("1. Nilai Struktur Surat : ");
            ss = input.nextDouble();
            System.out.print("2. Nilai Isi Surat : ");
            is = input.nextDouble();
            System.out.print("3. Niai Kreativitas : ");
            kreati = input.nextDouble();
            System.out.print("4. Nilai Penerapan Kaidah Bahasa : ");
            pkb = input.nextDouble();
        }
        else if(pilih==3){
            System.out.println("Hasil Akhir");
            System.out.println("1. Kategori Animasi");
            System.out.println("2. Kategori Menulis Surat");
            System.out.print("Pilih : ");
            pp = input.nextInt();
            if(pp==1){
                peserta Peserta = new peserta(ac,kon,krea,sinema);
                System.out.println("Total = " + ac + kon + krea + sinema);
            }
            else if (pp==2){
                peserta Peserta = new peserta(ss,is,kreati,pkb);
                System.out.println("Total = " + ss + is + kreati + pkb);
            }
        }
        else if(pilih==4){
            System.out.print("Ulangi? (Ya=1)(No=0) : ");
            p = input.nextInt(); 
        }
        else if(pilih==5){
            System.exit(0);
        }
        else{
            System.out.println("PILIHAN INPUTAN SALAH");
        }
            System.out.print("Ulangi? (Ya=1)(No=0) : ");
            p = input.nextInt();        
        }while(p==1);
    }
    
}