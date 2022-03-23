package SourceCode;
import java.util.Scanner;
public class BemMain {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("===================================================");
        System.out.println("=-=-=-=-=Pemilihan Ketua BEM Tahun 2022=-=-=-=-=-=");
        System.out.println("===================================================");
        Bem ktBem=new Bem();
        Bem[] tabP=new Bem[ktBem.jumlahKandidat];
        for(int i=0;i<ktBem.jumlahKandidat;i++){
            tabP[i]=new Bem();
            System.out.print("Nama Kandidat ke- "+(i+1)+" : ");
            tabP[i].kandidat=in.nextLine();
        }
        System.out.println("========================================");
        for(int i=0;i<ktBem.jumlahKandidat;i++) {
            System.out.print("Masukkan Jumlah Suara kandidat ke-" +(i+1)+" : ");
            tabP[i].vote=in.nextInt();
            ktBem.jumlahVote+=tabP[i].vote;
        }
        System.out.println("========================================");
        int hasil=Bem.hitungHasil(ktBem.jumlahVote,tabP[0].vote,tabP[1].vote,tabP[2].vote,tabP[3].vote);
        if(hasil==0){
            System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
        }else{
            System.out.println("Ketua BEM yang terpilih adalah " +tabP[hasil-1].kandidat);
        }
        in.close();
    }
}
