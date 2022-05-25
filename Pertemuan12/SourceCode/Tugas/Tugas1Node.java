package SourceCode.Tugas;

public class Tugas1Node {
    String nama;
    int nomor;
    Tugas1Node prev, next;

    Tugas1Node(Tugas1Node prev, int nomor, String nama, Tugas1Node next) {
        this.prev = prev;
        this.nama = nama;
        this.nomor = nomor;
        this.next = next;
    }
}
