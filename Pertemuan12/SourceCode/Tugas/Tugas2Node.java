package SourceCode.Tugas;

public class Tugas2Node {
    String id,judulFilm;
    Double rating;
    Tugas2Node prev, next;

    Tugas2Node(Tugas2Node prev,String id,String judulFilm,Double rating,Tugas2Node next) {
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}
