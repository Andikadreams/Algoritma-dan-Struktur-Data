package SourceCode;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char keluar;
        Pangkat[] png = new Pangkat[5];
        png[0] =  new Pangkat(4,7);
        png[1] =  new Pangkat(3,6);
        png[2] =  new Pangkat(9,4);   
        png[3] =  new Pangkat(3,9);
        png[4] =  new Pangkat(10,2);
        do{
        System.out.println("===================================================");
        System.out.println("   Hitung Pangkat Brute Force dan Divide Conquer");
        System.out.println("===================================================");
        System.out.println("Menu Hitung: ");
        System.out.println("1. Hitung BruteFoce"); 
        System.out.println("2. Hitung Divide Conquer");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu : ");
        int menu=in.nextInt();
        switch (menu){
            case 1 :
            System.out.println("Hasil Pangkat dengan Brute Force");
             for (int i=0;i<png.length;i++){
                 System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
            break;
            case 2 :
            System.out.println("Hasil Pangkat dengan Divide and Conquer");
            for (int i=0;i<png.length;i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat +" adalah " +png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
            break;
            case 3 :
            break;
            default :
            System.out.println("Mohon maaf, Menu yang anda masukkan TIDAK ADA !");
            break;
            }if(menu == 3){
                keluar = 'T';
            }else{
                System.out.print("\nKembali ke Menu Utama ? [Y/T] : ");            
                keluar = in.next().charAt(0);
            }
        }while(keluar == 'Y' || keluar == 'y');
        System.out.println("============================="); 
        System.out.println("-=-=-=-Terima Kasih!-=-=-=-=-");
        System.out.println("============================="); 
        in.close();
    }
}
