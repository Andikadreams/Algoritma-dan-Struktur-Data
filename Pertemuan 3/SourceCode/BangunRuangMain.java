package SourceCode;
import java.util.Scanner;

public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan banyak Limas Segitiga : ");
        int k=in.nextInt();
        System.out.println("==========================");
        LimasSegitiga[] kArray = new LimasSegitiga[k];
        for(int i=0;i<kArray.length;i++){
            System.out.print("Masukkan alas ke- "+(i+1)+": ");
            int al=in.nextInt();
            System.out.print("Masukkan tinggi ke -"+(i+1)+": ");
            int ti=in.nextInt();
            System.out.print("Masukkan tinggi limas ke -"+(i+1)+": ");
            int tli=in.nextInt();
            System.out.print("Masukkan sisi tegak ke -"+(i+1)+": ");
            int sti=in.nextInt();
            kArray[i]=new LimasSegitiga(al, ti, tli, sti);
        }
        for(int i=0;i<kArray.length;i++){
            System.out.println();
            System.out.println("Limas Segitiga ke- "+(i+1));
            System.out.println("alas : "+kArray[i].alas);
            System.out.println("tinggi : "+kArray[i].tinggi);
            System.out.println("tinggi limas : "+kArray[i].tinggiLimas);
            System.out.println("sisi tegak : "+kArray[i].sisiTegak);
            System.out.println("Luas Permukaan ke- "+(i+1)+" : "+kArray[i].luasPermukaan());
            System.out.println("Volume ke- "+(i+1)+" : "+kArray[i].volume());
        }
        System.out.println();
        System.out.print("Masukkan banyak Kubus : ");
        int ku=in.nextInt();
        System.out.println("===========================");
        Kubus [] kbArray = new Kubus[ku];
        for(int i=0;i<kbArray.length;i++){
            System.out.print("Masukkan Sisi ke- "+(i+1)+" : ");
            int si=in.nextInt();
            kbArray[i]=new Kubus(si);
        }
        for(int i=0;i<kbArray.length;i++){
            System.out.println("Kubus ke- "+(i+1));
            System.out.println("Sisi : "+kbArray[i].sisi);
            System.out.println("Luas Permukaan ke- "+(i+1)+" : "+kbArray[i].luasPermukaan());
            System.out.println("Volume ke- "+(i+1)+" : "+kbArray[i].Volume());
        }
        System.out.println();
        System.out.print("Masukkan banyak Tabung : ");
        int ta=in.nextInt();
        System.out.println("======================");
        Tabung[] tabArray=new Tabung[ta];
        for(int i=0;i<tabArray.length;i++){
            System.out.print("Masukkan jari-jari ke- "+(i+1)+" : ");
            int jr=in.nextInt();
            System.out.print("Masukkan tinggi ke- "+(i+1)+" : ");
            int t=in.nextInt();
            tabArray[i]=new Tabung(jr, t);
        }
        for(int i=0;i<tabArray.length;i++){
            System.out.println();
            System.out.println("Tabung ke- "+(i+1));
            System.out.println("Jari-jari : "+tabArray[i].jari);
            System.out.println("Tinggi : "+tabArray[i].tinggi);
            System.out.println("Luas Permukaan ke- "+ (i+1)+" : "+tabArray[i].luasPermukaan());
            System.out.println("Volume ke- "+(i+1)+" : "+tabArray[i].volume());
        }
        in.close();
    }
}
