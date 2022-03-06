package SourceCode;
import java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah : ");
        int inputan=input.nextInt();
        Tanah [] tanArray=new Tanah[inputan];
        System.out.println();
        for(int i=0;i<tanArray.length;i++){
            tanArray[i]=new Tanah();
            System.out.println("Tanah ke- "+(i+1));
            System.out.print("Panjang tanah : ");
            tanArray[i].panjang=input.nextInt();
            System.out.print("Lebar tanah : ");
            tanArray[i].lebar=input.nextInt();
        }
        System.out.println();
        int tanahTerluas=0;
        int pLuas=0;
        for(int i=0;i<tanArray.length;i++){
            System.out.println("Luas Tanah ke- "+(i+1)+" : "+tanArray[i].luasTanah());
            if(tanArray[i].luasTanah()>tanahTerluas){
                tanahTerluas=tanArray[i].luasTanah();
                pLuas=i;
            }
        }System.out.println("Tanah Terluas : "+"Tanah "+(pLuas+1));
        input.close();
    }
}
