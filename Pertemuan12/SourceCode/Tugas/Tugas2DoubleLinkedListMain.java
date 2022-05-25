package SourceCode.Tugas;
import java.util.Scanner;
public class Tugas2DoubleLinkedListMain {
    public static void menu() {
        System.out.println("DAFTAR FILM LAYAR LEBAR");
        System.out.println("=====================================");
        System.out.println("1.  Tambah Data Awal");
        System.out.println("2.  Tambah Data Akhir");
        System.out.println("3.  Tambah Data Index Tertentu");
        System.out.println("4.  Hapus Data Pertama");
        System.out.println("5.  Hapus Data Terakhir");
        System.out.println("6.  Hapus Data Tertentu");
        System.out.println("7.  Cetak");
        System.out.println("8.  Cari ID Film");
        System.out.println("9.  Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("=====================================");
    }

    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner ins = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        int menu = 0, index;
        String id,judulFilm,inputan;
        Double rating;

        Tugas2DoubleLinkedList dll = new Tugas2DoubleLinkedList();

        while (menu != 10) {
            menu();
            menu = sc.nextInt();
            System.out.println("=====================================");

            try {
                switch (menu) {
                    case 1:
                        System.out.println("Masukkan Data Film Posisi Awal");
                        System.out.print("Id Film : ");
                        id = ins.nextLine();
                        System.out.print("Judul Film : ");
                        judulFilm = in.nextLine();
                        System.out.print("Rating : ");
                        rating = sc.nextDouble();
                        dll.addFirst(id, judulFilm, rating);
                        break;
                    case 2:
                        System.out.println("Masukkan Data Film Posisi Akhir");
                        System.out.print("ID Film : ");
                        id = ins.nextLine();
                        System.out.print("Judul Film : ");
                        judulFilm = in.nextLine();
                        System.out.print("Rating : ");
                        rating = sc.nextDouble();
                        dll.addLast(id, judulFilm, rating);
                        break;
                    case 3:
                        System.out.println("Tambah Data Indeks tertentu");
                        System.out.print("ID FIlm : ");
                        id = ins.nextLine();
                        System.out.print("Judul Film : ");
                        judulFilm = in.nextLine();
                        System.out.print("Rating : ");
                        rating = sc.nextDouble();
                        System.out.print("Masukkan posisi index : ");
                        index = sc.nextInt();
                        dll.add(id, judulFilm, rating, index);
                        break;
                    case 4:
                        System.out.println("Hapus Data Pertama");
                        dll.removeFirst();
                        break;
                    case 5:
                        System.out.println("Hapus Data Terakhir");
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.println("Hapus Data Tertentu");
                        System.out.print("Masukkan posisi index : ");
                        index = sc.nextInt();
                        dll.remove(index);
                        break;
                    case 7:
                        System.out.println("Cetak Data");
                        dll.print();
                        System.out.println("Size : " + dll.size());
                        break;
                    case 8:
                        System.out.println("Cari Id Film");
                        System.out.print("Masukkan data ID Film yang ingin dicari : ");
                        inputan = i.nextLine();
                        dll.search(inputan);
                        break;
                    case 9:
                        System.out.println("Urut Data Rating Film-DESC");
                        dll.sort();
                        break;
                    case 10:
                        System.out.println("Keluar Program");
                        break;
                }
                System.out.println();
                } catch (Exception e) {
            }
        }
        sc.close();
        in.close();
        ins.close();
        i.close();
    }
}
