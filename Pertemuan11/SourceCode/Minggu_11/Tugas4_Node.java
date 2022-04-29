package SourceCode.Minggu_11;

public class Tugas4_Node {
    String nim, nama;
    int absen;
    double ipk;
    Tugas4_Node next;
    Tugas4_Node(String nim, String nama, int absen, double ipk,Tugas4_Node berikutnya) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = berikutnya;
    }
}
