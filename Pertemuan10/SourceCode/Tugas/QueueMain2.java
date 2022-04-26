package SourceCode.Tugas;
import java.util.Scanner;
public class QueueMain2 {
    public static void menu(){
        System.out.println("Masukkan Operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position berdasarkan NIM");
        System.out.println("7. Cari Mahasiswa berdasarkan Index");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue = ");
        int n =sc.nextInt();
        int pilih;
        Queue2 antri=new Queue2(n);
        do{
            menu();
            pilih =sc.nextInt();
            switch (pilih){
                case 1:
                    sc.nextLine();
                    System.out.print("Nama = ");
                    String nama =sc.nextLine();
                    System.out.print("NIM = ");
                    String nim =sc.nextLine();
                    System.out.print("Nomer Absen = ");
                    int absen =sc.nextInt();
                    System.out.print("IPK = ");
                    double ipk =sc.nextDouble();
                    Mahasiswa p =new Mahasiswa(nama, nim, absen, ipk);
                    antri.Enqueue(p);
                    break;
                case 2:
                    Mahasiswa data =antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.nim) && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Antrian Yang Keluar = " + data.nama + " " + data.nim + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang Dicari = ");
                    String cari_Nim =sc.next();
                    antri.peekPosition(cari_Nim);
                    break;
                case 7:
                    System.out.print("Masukkan Index / Antrian yang ingin dicari datanya = ");
                    int cariindex =sc.nextInt();
                    antri.printMahasiswa(cariindex);
                    break; 
            }
        } while (pilih > 0 || pilih < 8);
    }
}

