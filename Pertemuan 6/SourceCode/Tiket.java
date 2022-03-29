package SourceCode;
public class Tiket {
    String maskapai,asal,tujuan;
    int harga;

    Tiket(String m,int h,String a,String t ){
        maskapai=m;
        harga=h;
        asal=a;
        tujuan=t;
    }
    void tampil(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" Sistem Pemesanan Tiket");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Nama Maskapai : "+maskapai);
        System.out.println("Harga         : Rp."+harga);
        System.out.println("Asal          : "+asal);
        System.out.println("Tujuan        : "+tujuan);
    }
}
