import java.util.Scanner;
public class Pemilihan{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
    System.out.println("==============================");
    System.out.print("Masukkan Nilai Tugas: ");
    int tugas=in.nextInt();
    System.out.print("Masukkan Nilai UTS: ");
    int uts=in.nextInt();
    System.out.print("Masukkan Nilai UAS: ");
    int uas=in.nextInt();
    double nilaiAkhir;
    nilaiAkhir=(0.45*uas+0.35*uts+0.2*tugas);
    System.out.println("Nilai Akhir : "+nilaiAkhir);
    String nilaiHuruf;
    if(nilaiAkhir>80 && nilaiAkhir<=100){
        nilaiHuruf="A";
    }else if(nilaiAkhir>73 && nilaiAkhir<=80){
        nilaiHuruf="B+";
    }else if(nilaiAkhir>65 && nilaiAkhir<=73){
        nilaiHuruf="B";
    }else if(nilaiAkhir>60 && nilaiAkhir<=65){
        nilaiHuruf="C+";
    }else if(nilaiAkhir>50 && nilaiAkhir<=60){
        nilaiHuruf="C";
    }else if(nilaiAkhir>=39 && nilaiAkhir<=50){
        nilaiHuruf="D";
    }else{
        nilaiHuruf="E";
    }
    System.out.println("Nilai Huruf : "+nilaiHuruf);
    System.out.println("==============================");
    if(nilaiHuruf.equals("A")||nilaiHuruf.equals("B+")||nilaiHuruf.equals("B")||nilaiHuruf.equals("C+")||nilaiHuruf.equals("C")){
        System.out.println("SELAMAT LULUS");
    }else{
        System.out.println("TIDAK LULUS");
        in.close();
    }
}
}