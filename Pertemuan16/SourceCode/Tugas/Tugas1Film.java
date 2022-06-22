package SourceCode.Tugas;

public class Tugas1Film {
    String idFilm;
    String judul;
    String tayang;
    String director;
    public Tugas1Film () {

    }
    public Tugas1Film (String idFilm, String judul, String tayang, String director) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.tayang = tayang;
        this.director = director;
    }
    public String toString() {
        return "Film{" + "idFilm= " + idFilm + ", judul=" + judul + ", tayang=" + tayang + ", director=" + director + '}';
    }
}
