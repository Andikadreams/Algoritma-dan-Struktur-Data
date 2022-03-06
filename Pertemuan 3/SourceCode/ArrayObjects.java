package SourceCode;
import java.util.Scanner;
public class ArrayObjects{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak persegi panjang : ");
        int k=sc.nextInt();
        PersegiPanjang [] ppArray = new PersegiPanjang[k];
    for(int i=0;i<k;i++){
        ppArray[i]=new PersegiPanjang();
        System.out.println("Persegi Panjang ke-"+i);
        System.out.print("Masukkan Panjang: ");
        ppArray[i].panjang=sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        ppArray[i].lebar=sc.nextInt();
    }
    for(int i=0;i<k;i++){
        System.out.println("Persegi Panjang ke-"+i);
        System.out.println("Panjang : "+ppArray[i].panjang+", Lebar : "+ppArray[i].lebar);
    }
    sc.close();
}
}