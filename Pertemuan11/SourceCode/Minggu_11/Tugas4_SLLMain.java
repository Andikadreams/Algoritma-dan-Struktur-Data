package SourceCode.Minggu_11;
import java.util.Scanner;
public class Tugas4_SLLMain {
    public static void main(String[] args) {
        Tugas4_SingleLinkedList singLL = new Tugas4_SingleLinkedList();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        char pilih;
        int menu;
    do{
        System.out.println("Pilihan Menu");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Antrian Paling Depan");
        System.out.println("3. Lihat Antrian Paling Belakang");
        System.out.println("4. Mencari Data Mahasiswa Melalui Index");
        System.out.println("5. Mencari Data Mahasiswa Melalui NIM");
        System.out.println("6. Tampilkan Data");
        System.out.println("7. Hapus Data Terakhir");
        System.out.println("8. EXIT");
        System.out.print("Masukkan Pilihan Menu (1-8): ");
        menu = sc.nextInt();
        System.out.println("");
        if(menu < 1 || menu > 8){
            System.out.println("Masukkan Pilihan Menu Yang Benar!");
        }
    switch (menu){
        case 1:
        do{
            System.out.print("Masukkan NIM \t\t: ");
            String nim = st.nextLine();
            System.out.print("Nama Mahasiswa \t\t: ");
            String nama = st.nextLine();
            System.out.print("Absen Mahasiswa \t: ");
            int absen = in.nextInt();
            System.out.print("IPK Mahasiswa \t\t: ");
            double ipk = in.nextDouble();
            System.out.print("Apakah anda ingin menambah data baru? (y/n):");
            pilih = sc.next().charAt(0);
            singLL.tambahData(nim,nama,absen,ipk);
            System.out.println("");
            }while(pilih == 'y' || pilih == 'Y');
            break;
        case 2:
            singLL.AntrianTerdepan();
            System.out.println(" ");
            break;
        case 3:
            singLL.AntrianBelakang();
            System.out.println(" ");
            break;
        case 4:
            System.out.print("Masukkan Index Pada Data Yang Dicari : ");
            int idx = sc.nextInt();
            singLL.cariDataIndex(idx);
            System.out.println(" ");
            break;
        case 5:
            System.out.print("Masukkan NIM Mahasiswa Yang Ingin Dicari : ");
            String no = st.nextLine();
            singLL.cariDataNim(no);
            System.out.println(" ");
            break;
        case 6:
            singLL.print();
            System.out.println(" ");
            break;
            
        case 7:
            singLL.remove();
            System.out.println(" ");
            break;
            }
        }while(menu > 0 && menu < 8);
        System.out.println("Thank You:P");
    }
}