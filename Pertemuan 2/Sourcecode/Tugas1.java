public class Tugas1 {
    public static void main(String[] args) {
        tugas1app a1=new tugas1app();
        a1.nama="Laptop";
        a1.hargaSatuan=200000;
        a1.jumlah=5;
        int x = a1.hitungHargaTotal();
        int y = a1.hitungDiskon(x);
        int z = a1.hitungHargaBayar(x, y);
        System.out.println("Nama Barang   : "+a1.nama);
        System.out.println("Harga Satuan  : "+a1.hargaSatuan);
        System.out.println("Jumlah Barang : "+a1.jumlah);
        System.out.println("Harga Total   : "+x);
        System.out.println("Diskon        : "+y);
        System.out.println("Total Bayar   : "+z);
    }
}
class tugas1app{
    String nama;
    int hargaSatuan,jumlah;

    int hitungHargaTotal(){
      return hargaSatuan*jumlah;
    }
    int hitungDiskon(int n){
        int totalDiskon=0;
        if(n>100000){
            totalDiskon=n*10/100;
        }
        else if(n>50000 && n<=100000){
            totalDiskon=n*5/100;
        }
        else{
            System.out.print("Maaf anda tidak mendapat diskon");
        }
        return totalDiskon;
    }
    int hitungHargaBayar(int total,int diskon){
        int hargaBayar=0;
        hargaBayar=total-diskon;
        return hargaBayar;
    }
}