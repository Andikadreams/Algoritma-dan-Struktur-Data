package SourceCode;
import java.util.Scanner;
import java.util.TimeZone;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long awal=System.currentTimeMillis(); 
        System.out.println("Waktu awal : "+String.valueOf(awal)+" milidetik");
        System.out.println("===============================================");
        System.out.print("Masukkan jumlah elemen  yang ingin dihitung : ");
        int elemen = in.nextInt();
        Faktorial [] fk=new Faktorial[elemen];
        for(int i=0;i<elemen;i++){
            fk[i]=new Faktorial();
            System.out.print("Masukkan niai data ke- "+(i+1)+" : ");
            fk[i].nilai=in.nextInt();
        }
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
    }
    long akhir=System.currentTimeMillis(); 
        System.out.println("Waktu akhir : "+String.valueOf(akhir)+" milidetik");
        long elapsedTime=akhir-awal;
        System.out.println("exceution time:"+String.valueOf(elapsedTime)+"milidetik");
    System.out.println("===============================================");
    in.close();
}
}
