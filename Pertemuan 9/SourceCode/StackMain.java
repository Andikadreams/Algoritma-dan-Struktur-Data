package SourceCode;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        Scanner in1=new Scanner(System.in);
        Stack stk =new Stack(10);
    //     char pilih;
    //      do{
    //    System.out.print("Jenis: ");
    //    String jenis =sc.nextLine();
    //    System.out.print("Warna: ");
    //    String warna =sc.nextLine();
    //    System.out.print("Merk: ");
    //    String merk =sc.nextLine();
    //    System.out.print("Ukuran: ");
    //    String ukuran =sc.nextLine();
    //    System.out.print("Harga: ");
    //    double harga =sc.nextDouble();
       
    //    Pakaian p =new Pakaian(jenis,warna,merk,ukuran,harga);
    //    System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)?");
    //    pilih =sc.next().charAt(0);
    //    sc.nextLine();
    //    stk.push(p);
    //    }
    //    while (pilih == 'y');
    //    stk.print();
    //    stk.pop();
    //    stk.peek();
    //    stk.print();


    //Modifikasi Praktikum 1
       char keluar;
        do{
      System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      System.out.println("\t\t Operasi Stack ");
      System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      System.out.println("Menu");
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Peek");
      System.out.println("4. Print");
      System.out.println("5. GetMin");
      System.out.println("6. Keluar");
      System.out.print("Pilih Operasi: ");
      int menu =sc.nextInt();
      System.out.println("------------------------------------------------");
      switch (menu){
      case 1: 
         char pilih;
         do{
       System.out.print("Jenis  : ");
       String jenis =in1.nextLine();
       System.out.print("Warna  : ");
       String warna =in1.nextLine();
       System.out.print("Merk   : ");
       String merk =in1.nextLine();
       System.out.print("Ukuran : ");
       String ukuran =in1.nextLine();
       System.out.print("Harga  : ");
       double harga =in.nextDouble();
       
       Pakaian p =new Pakaian(jenis, warna, merk, ukuran, harga);
       System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)?");
       pilih =sc.next().charAt(0);
       sc.nextLine();
       stk.push(p);
       }while (pilih == 'y');
        break;
        case 2:
            stk.pop();
            break;
        case 3:
            stk.peek();
            break;
        case 4:
            stk.print();
            break;
    //Modifikasi Tugas 1     
        case 5:
            stk.getMin();
            break;
        case 6:
            System.out.println("=-=-=-=-TerimaKasih-=-=-=-=");
            break;
        default :
        System.out.println("Menu yang anda masukkan tidak ada!");
        break;
        }if(menu == 6){
        keluar ='t';
        }
        else{
            System.out.print("\nKembali ke Menu Utama (y/t)? ");
            keluar =sc.next().charAt(0);
        }
    }while(keluar == 'Y' || keluar == 'y');
    sc.close();
    in.close();
    in1.close();
    }
}
