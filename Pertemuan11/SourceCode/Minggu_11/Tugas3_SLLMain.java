package SourceCode.Minggu_11;

public class Tugas3_SLLMain {
    public static void main(String[] args) {
        Tugas3_SingleLinkedList singLL = new Tugas3_SingleLinkedList();
        singLL.pushFirst("Bahasa");
        singLL.print();
        singLL.pushFirst("Android");
        singLL.print();
        singLL.pushFirst("Komputer");
        singLL.print();
        singLL.pushFirst("Basis Data");
        singLL.print();
        singLL.pushFirst("Matematika");
        singLL.print();
        singLL.pushFirst("Algoritma");
        singLL.print();
        singLL.pushFirst("Statistika");
        singLL.print();
        singLL.pushFirst("Multimedia");

        System.out.println("Isi stack : ");
        singLL.print();
        singLL.peek();
    }
}
