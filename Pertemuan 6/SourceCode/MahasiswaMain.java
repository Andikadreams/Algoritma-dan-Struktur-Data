package SourceCode;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        DaftarMahasiswaBerprestasi list=new DaftarMahasiswaBerprestasi();
        Mahasiswa m1=new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2=new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3=new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4=new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5=new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        // System.out.println("Data Mahasiswa setelah sorting desc berdasakan IPK");
        // list.bubbleSort();
        // list.tampil();
        // System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK");
        // list.selectionSort();
        // list.tampil();
        // System.out.println("Data Mahasiswa setelah sorting asc berdasakan IPK");
        // list.insertionSort();
        // list.tampil();
        boolean pilih;
        System.out.println("1. Asc (Terkecil ke Terbesar)");
        System.out.println("2. Dsc (Terbesar ke Terkecil)");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Masukkan pilihan : ");
        int input=in.nextInt();
        if(input==1){
            pilih=true;
        }
        else{
            pilih=false;
        }
        System.out.println("Data Mahasiswa setelah sorting asc/dsc berdasarkan IPK");
        list.insertionSort(pilih);
        list.tampil();
        in.close();
    }
}
