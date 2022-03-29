package SourceCode;
import java.util.Scanner;
public class MainTiket{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        TiketService dika=new TiketService();
        Tiket t1=new Tiket("Batik Air",750000,"Jakarta","Malang");
        Tiket t2=new Tiket("Garuda Indonesia", 1050000, "Balikpapan", "Jakarta");
        Tiket t3=new Tiket("Lion Air", 650000, "Bali", "Surabaya");
        Tiket t4=new Tiket("Susi Air", 100000, "Banjarmasin", "Surabaya");
        Tiket t5=new Tiket("Sriwijaya Air", 900000, "Surabaya", "Jakarta");

        dika.tambah(t1);
        dika.tambah(t2);
        dika.tambah(t3);
        dika.tambah(t4);
        dika.tambah(t5);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("   Data Sebelum Sorting");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        dika.tampilAll();
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("1. Ascending (BubbleSort)");
        System.out.println("2. Descending (SelectionSort)");
        System.out.print("Masukkan Pilihan Menu : ");
        int pil=in.nextInt();
        if(pil==1){
            System.out.println("=-=-=-=-=-Data Setelah Sorting Ascending-=-=-=-=-=-=");
            dika.bubbleSort();
            dika.tampilAll();
        }
        else{
            System.out.println("=-=-=-=-=-Data Setelah Sorting Descending-=-=-=-=-=-=");
            dika.selectionSort();
            dika.tampilAll();;
        }
        
        in.close();
    }
}