package SourceCode;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner inS=new Scanner(System.in);
        Scanner ni=new Scanner(System.in);
        Scanner ip=new Scanner(System.in);
        Mahasiswa [] mahaArray=new Mahasiswa[3];
        for(int i=0;i<3;i++){
            mahaArray[i]=new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke- "+(i+1));
            System.out.print("Masukkan Nama\t: ");
            mahaArray[i].nama=inS.nextLine();
            System.out.print("Masukkan NIM\t: ");
            mahaArray[i].nim=ni.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            mahaArray[i].jenisKelamin=inS.nextLine();
            System.out.print("Masukkan IPK\t: ");
            mahaArray[i].ipk=ip.nextDouble();
            System.out.println();
        }
        for(int i=0;i<3;i++){
            System.out.println("Data Mahasiswa ke- "+(i+1));
            System.out.println("Nama\t: "+mahaArray[i].nama);
            System.out.println("NIM \t: "+mahaArray[i].nim);
            System.out.println("Jenis Kelamin : "+mahaArray[i].jenisKelamin);
            System.out.println("Nilai IPK : "+mahaArray[i].ipk);
            System.out.println();
        }
        inS.close();
        ni.close();
        ip.close();
    }
}
