package SourceCode;
import java.util.Scanner;
public class StrukBelanjaMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Scanner in =new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\t\tStruk Belanja");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Banyak Struk: ");
        int banyak = sc.nextInt();
        System.out.println("----------------------------------------------------");
        Belanja blj = new Belanja(banyak);

        int totalHarga = 0;
        int jml, harga;
        for (int i = 0; i < banyak; i++) {
        System.out.print("Nomor Transaksi: ");
        String id =in.nextLine();
        System.out.print("Tanggal Pembelian: ");
        String tanggal =in.nextLine();
        System.out.print("Nama Barang: ");
        String nb =in.nextLine();
        System.out.print("Jumlah Barang: ");
        jml = sc.nextInt();
        System.out.print("Harga Barang: ");
        harga = sc.nextInt();
        totalHarga =jml * harga;
        StrukBelanja bb =new StrukBelanja(id, tanggal, nb, jml,harga);
        blj.push(bb);
        System.out.print("Total Harga: "+ totalHarga);
        System.out.println();
        }

     char keluar;
     do{
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("\t\tMenu List");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("1. Menampilkan struk teratas");
    System.out.println("2. Mengambil 5 struk untuk ditukar kupon");
    System.out.println("3. Menampilkan sisa struk");
    System.out.println("4. Keluar");
    System.out.print("Pilih menu :");
    int menu =sc.nextInt();
    System.out.println("------------------------------------------------");
    switch (menu){
        case 1:
            blj.peek();
            blj.print();
            break;
        case 2:
            blj.pop();
            blj.pop();
            blj.pop();
            blj.pop();
            blj.pop();
            break;
        case 3:
            blj.print();
            break;
         case 4:
            System.out.println("------Terimakasih------");
            break;
            default :
            System.out.println("Menu yang anda masukkan tidak tersedia!!!");
            break;
        }   if(menu == 4) {keluar = 't';}
            else{
                System.out.print("\nKembali ke Menu Utama (y/t)? ");
                keluar = sc.next().charAt(0);
            }
        }       while(keluar == 'Y' || keluar == 'y');
        sc.close();
        in.close();
    }   
}
