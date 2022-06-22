package SourceCode.Tugas;

import java.util.Scanner;
import java.util.Stack;

public class Tugas1FilmMain {
    public static void main(String[] args) {
        Stack<Tugas1Film> film = new Stack<Tugas1Film>();
        
        Scanner sc = new Scanner(System.in);;
        int pilih;
        do {
        System.out.println("**************************************");
        System.out.println("Data Film Layar Lebar Sepanjang Masa");
        System.out.println("**************************************");
        System.out.println("1. input Judul Film");
        System.out.println("2. Hapus Data Film Teratas");
        System.out.println("3. Cek Judul Film Teratas");
        System.out.println("4. Info Semua Judul Film");
        System.out.println("5. Keluar");
        System.out.println("**************************************");
        System.out.print("Pilihan: ");
        pilih = sc.nextInt();
        if (pilih == 1) {
        System.out.println("");
        String input = sc.nextLine();
        System.out.print("idFilm\t : ");
        String idFilm = sc.nextLine();
        System.out.print("Judul\t : ");
        String judul = sc.nextLine();
        System.out.print("tayang\t : ");
        String tayang = sc.nextLine();
        System.out.print("director : ");
        String director = sc.nextLine();
        Tugas1Film b = new Tugas1Film();
        film.push(b = new Tugas1Film(idFilm, judul, tayang, director));
        }
        if (pilih == 2) {
        film.pop();
        }
        if (pilih == 3) {
        System.out.println("Film{" + "idFilm=" + (film.get(film.size() - 1).idFilm) + ", " + "judul=" + (film.get(film.size() - 1).judul) + ", " + "tayang=" + (film.get(film.size() - 1).tayang) + ", " + "director=" + (film.get(film.size() - 1).director) + '}');
        }
        if (pilih == 4) {
            film.stream().forEach(b -> {
            System.out.println("Film{" + "idFilm=" + b.idFilm + ", " + "judul=" + b.judul + ", " + "tayang=" + b.tayang + ", " + "director=" + b.director + '}');
                });
            }
        } 
        while (pilih >= 1 && pilih <= 4);
        sc.close();
    }
}
