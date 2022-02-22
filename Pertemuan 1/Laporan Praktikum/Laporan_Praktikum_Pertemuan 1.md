# Laporan  Praktikum Pertemuan 1
## Nama : Andika Ainur Wibowo
## NIM  : 2141720238
## Kelas/No. Absen : TI-1F/07

Hasil dari Praktikum pertemuan 1

dapat mengimplementasikan  pemilihan,perulangan,array,dan fungsi dalam kode program java
berikut implementasi yang di 
maksud antara lain : 

### **2.2 Pemilihan**
**Waktu percobaan :  30 menit**

Materi pada praktikum ini telah dijelaskan pada  matakuliah Dasar Pemrograman,  Sehingga didalam  praktikum ini,  tidak akan dilakukan langkah-langkah percobaan. Jawablah pertanyaan-pertanyaan yang ada berikut ini : 
### **2.2.1 Praktikum Pemilihan**
**Pertanyaan**

1. Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai 
tugas, 35% nilai UTS dan 45% nilai UAS. Setiap nilai yang dimasukkan mempunyai batas nilai 
0 ‐ 100. Ketika nilai akhir sudah didapatkan selanjutnya lakukan konversi nilai dengan 
ketentuang sebagai berikut:

    <img src="kumpulan foto/fotono1.png">
Jika  Nilai Huruf yang didapatkan adalah A,B+,B+C+,C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS.

• Input dari program berupa komponen nilai tugas, UTS, UAS

**Code Program** 
```java
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
```
**Output Program**

<img src="kumpulan foto/Pemilihan.jpg">

## 2.3  Perulangan
**Waktu percobaan :  30 menit**

Materi pada praktikum ini telah dijelaskan pada matakuliah Dasar Pemrograman. Sehingga didalam praktikum ini, tidak akan dilakukan langkah-langkah percobaan. Jawablah pertanyaan-pertanyaan yang ada berikut ini : 

**2.3.1  Praktikum Perulangan**

**Pertanyaan**
1. Buatlah program yang dapat menampilkan nama hari dari senin hingga minggu secara berulang dengan jumlah hari sebesar n, dengan  n = 2 digit terakhir NIM anda. 
*bila n<10 maka  tambahkan 10 (n+=10)

Contoh:
Input  NIM: 2041720010  maka n=10
OUTPUT :  **senin selasa rabu kamis jumat sabtu minggu senin selasa rabu**

Contoh 2:
Input  NIM: 2041720002  maka n=12
OUTPUT :  **senin selasa rabu kamis jumat sabtu minggu senin selasa rabu kamis jumat** 

**Code Program** 
```java
import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Masukkan NIM : ");
        n=in.nextInt();
        System.out.println("=========================");
        n=n%100;
        if(n<10){
            n+=10;
        }
        System.out.println("n : "+n);
        for(int i=1;i<=n;i++){
            if(i%7==1){
                System.out.print("Senin ");
            }else if(i%7==2){
                System.out.print("Selasa ");
            }else if(i%7==3){
                System.out.print("Rabu " );
            }else if(i%7==4){
                System.out.print("Kamis ");
            }else if(i%7==5){
                System.out.print("jumat ");
            }else if(i%7==6){
                System.out.print("Sabtu ");
            }else{
                System.out.print("Minggu ");
            }
        }
        in.close();
    }
}
```
**Output Program**

<img src="kumpulan foto/Perulangan.jpg">

## 2.4  Array
**Waktu percobaan :  30 menit**

Materi pada praktikum ini telah dijelaskan pada matakuliah Dasar Pemrograman, sehingga didalam praktikum ini, tidak akan dilakukan langkah-langkah percobaan. Jawablah pertanyaan-pertanyaan yang ada berikut ini : 

**2.4.1 Praktikum Array**

**Pertanyaan**
1. RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga-bunga yang dijual selalu dicatat dengan rincian seperti berikut ini:

Baris = Cabang Toko, Kolom = Stock bunga pada hari x

<img src="kumpulan foto/fotobunga.png">
Rincian Harga Aglonema =75.000 , Keladi = 50.000, Alocasia =60.000, Mawar =10.000. Bantulah RoyalGarden dengan membuatkan program yang dapat menghitung :

A. Jumlah Stock berdasarkan jenis bunganya di seluruh Cabang 

B. Jika terdapat informasi tambahan berupa pengurangan stock karena bunga tersebut mati  pada cabang  RoyalGarden 1. Dengan rincian Aglonema  -1, Keladi  -2, Alocasia  -0, Mawar  -5. Maka berapakah total pendapatan dari RoyalGarden 1 jika semua Bunga 
Terjual Habis

**Code Program**
```java
public class Array{
public static void main(String[] args) {
        int [][]toko={
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };   
        int aglonema=0,keladi=0,alocasia=0,mawar=0;
        int harga_aglo=75000;
        int harga_Kel=50000;
        int harga_alo=60000;
        int harga_ma=10000;
        for(int i=0;i<toko.length;i++){
            for(int j=0;j<toko[0].length;j++){
                switch(j){
                    case 0:
                    aglonema+=toko[i][0];
                    break;
                    case 1:
                    keladi+=toko[i][1];
                    break;
                    case 2:
                    alocasia+=toko[i][2];
                    break;
                    case 3:
                    mawar+=toko[i][3];
                    break;
                }
            }
        }
        int total=0;
        total+=keladi+aglonema+alocasia+mawar;
        System.out.println("Total Stock seluruh cabang: "+total);
        System.out.println("Stock bunga Aglonema : "+aglonema);
        System.out.println("Stock bunga Keladi : "+keladi);
        System.out.println("Stock bunga Alocasia : "+alocasia);
        System.out.println("Stock bunga Mawar : "+mawar);
        int ryl_aglo=0,ryl_kel=0,ryl_alo=0,ryl_ma=0;
        int ryl1=0;
        ryl_aglo=aglonema-14;
        ryl_kel=keladi-30;
        ryl_alo=alocasia-31;
        ryl_ma=mawar-31;
        for(int i=0;i<1;i++){
            ryl1=ryl_aglo*harga_aglo+ryl_kel*harga_Kel+ryl_alo*harga_alo+ryl_ma*harga_ma;
        }
        System.out.println("Total penjualan Royal Garden 1 : "+ryl1);
}
}
```
**Output Program**

<img src="kumpulan foto/Array.jpg">

## 2.5 Fungsi
**Waktu percobaan :  30 menit**

Materi pada praktikum ini telah dijelaskan pada matakuliah Dasar Pemrograman, sehingga didalam praktikum ini, tidak akan dilakukan langkah-langkah percobaan. 
Jawablah pertanyaan-pertanyaan yang ada berikut ini :

**2.5.1 Praktikum Fungsi**

**Pertanyaan**
1. Buatlah fungsi untuk menampilkan array stock bunga sesuai tabel yang terdapat pada pertanyaan praktikum bagian 2.4.
2. Buatlah fungsi untuk pada pertanyaan bagian 2.4 untuk mengetahui berdasarkan jenis bunganya di seluruh Cabang

**Code Program**
```java
public class fungsi {
    public static java.util.Scanner in=new java.util.Scanner(System.in);
        static int [][]bunga={
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
    public static void main(String[] args) {
        tampilanTabel();
        menghitungStock();
    }
    static void tampilanTabel(){
        System.out.println("===================================================================================");
        System.out.println("\t\tAglonema    |   Keladi    |      Alocasia    |   Mawar");
        System.out.println("===================================================================================");
        System.out.println("Royal Garden 1 =    "+bunga[0][0]+"\t\t  "+bunga[0][1]+"\t    \t   "+bunga[0][2]+"   \t  "+bunga[0][3]);
        System.out.println("Royal Garden 2 =    "+bunga[1][0]+"\t\t  "+bunga[1][1]+"\t    \t   "+bunga[1][2]+"   \t   \t "+bunga[1][3]);
        System.out.println("Royal Garden 3 =    "+bunga[2][0]+"\t\t  "+bunga[2][1]+"\t    \t   "+bunga[2][2]+"   \t  "+bunga[2][3]);
        System.out.println("Royal Garden 4 =    "+bunga[3][0]+"\t\t  "+bunga[3][1]+"\t    \t   "+bunga[3][2]+"   \t  "+bunga[3][3]);
    }
    static void menghitungStock(){
        boolean sukses=true;
        while (sukses){
        System.out.println("Ingin melihat stock bunga apa?");
        System.out.println("1. Alognema");
        System.out.println("2. Keladi");
        System.out.println("3. Alocasia");
        System.out.println("4. Mawar");
        System.out.println("5. Keluar");
        System.out.print("Pilihan menu :");
        int x=in.nextInt();
        if(x==1){
            int alog=0;
        for(int i=0;i<bunga.length;i++){
            for(int j=0;j<bunga[0].length;j++){
                if(j==0){
                    alog+=bunga[i][j];
                    
                }
            }
        }System.out.println("Stok Bunga Alognema : "+alog);
        }
        if(x==2){
            int keladi=0;
            for(int i=0;i<bunga.length;i++){
                for(int j=0;j<bunga[0].length;j++){
                    if(j==1){
                        keladi+=bunga[i][j];
                    }
                }
            }System.out.println("Stok Bunga Keladi : "+keladi);
        }
        if(x==3){
            int alocasia=0;
            for(int i=0;i<bunga.length;i++){
                for(int j=0;j<bunga[0].length;j++){
                    if(j==2){
                        alocasia+=bunga[i][j];
                    }
                }
            }System.out.println("Stok Bunga Keladi : "+alocasia);
        }
        if(x==4){
            int mawar=0;
            for(int i=0;i<bunga.length;i++){
                for(int j=0;j<bunga[0].length;j++){
                    if(j==3){
                        mawar+=bunga[i][j];
                    }
                }
            }System.out.println("Stok Bunga Keladi : "+mawar);
        }
        else if(x==5){
            sukses=false;
        }
    }
    }
}
```
**Output Program**

<img src="kumpulan foto/Fungsi.jpg">

## 3. Tugas
**Waktu  pengerjaan :  50 menit**
1. Sebuah jasa cuci pakaian Smile Laundry memiliki aturan biaya seperti beriku ini 
Output Program

- Tarif untuk setiap 1kg pakaian adalah Rp. 4.500,  –
- Jika customer mencucikan baju lebih dari 10 kg maka  :  customer akan mendapatkan diskon  5%.

Pada hari ini laundy tersebut hanya memiliki 4 customer yaitu Ani, Budi, Bina, dan Cita. Ani membawa 4kg pakaian, budi membawa 15kg pakaian, Bina membawa  6kg, dan terakir Cita membawa 11kg. Berapakah pendapat Smile laundry pada hari itu? Buatlah programnya

**Code Program**
``` java
public class tugas1 {
    public static void main(String[] args) {
        int harga=4500;
        String [] pelanggan={"ani","budi","bina","cita"};
        double diskon =0.05;
        double totalpendapatan=0;
        int [] berat={4,15,6,11};
        double [] totalh=new double [4];
        for(int i=0;i<berat.length;i++){
            if(berat[i]>10){
                totalh[i]=(berat[i]*harga)-(berat[i]*harga*diskon);
            }else{
                totalh[i]=berat[i]*harga;
            }
        }
        for(int i=0;i<pelanggan.length;i++){
            System.out.println("Berat cucian "+pelanggan[i]+" = "+berat[i]);
            System.out.println("Total bayar "+pelanggan[i]+" = "+totalh[i]);
        }for(int i=0;i<pelanggan.length;i++){
            totalpendapatan+=totalh[i];
        }
        System.out.println("Total pendapatan laundry : "+totalpendapatan);
    }
}
```
**Output Program**

<img src="kumpulan foto/Tugas no1.jpg">

#### 2. Buat Program untuk menghitung rumus kecepatan, jarak, dan waktu

Berikut adalah persamaan untuk menghitung rumus tersebut :

<img src="kumpulan foto/fotono2.png"> 

**Code Program**
```java
public class tugas2 {
    
    public static java.util.Scanner in=new java.util.Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("PROGRAM MENGHITUNG KECEPATAN/JARAK/WAKTU");
        System.out.println("========================================");
        System.out.println("Ingin menghitung apa ? (kecepatan/jarak/waktu)");
        System.out.print("Masukkan pilihan anda : ");
        String input=in.nextLine();
        if(input.equals("kecepatan")){
            kecepatan();
        }else if(input.equals("jarak")){
            jarak();
        }else{
            waktu();
            }
        }
    static void kecepatan(){
        System.out.print("Masukkan jarak (km): ");
        double s =in.nextInt();
        System.out.print("Masukkan waktu (/jam): ");
        double t=in.nextInt();
        double total=s/t;
        System.out.println("Kecepatan yang di dapat adalah : "+total+" km/jam");
    }
    static void jarak(){
        System.out.print("Masukkan kecepatan (km/jam): ");
        int v=in.nextInt();
        System.out.print("Masukkan waktu (/jam): ");
        int t=in.nextInt();
        int total=v*t;
        System.out.println("Kecepatan yang di dapat adalah : "+total+" km");
    }
    static void waktu(){
        System.out.print("Masukkan jarak (km): ");
        double s =in.nextInt();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double v=in.nextInt();
        double total=s/v;
        System.out.println("Kecepatan yang di dapat adalah : "+total+" jam");
    }
}
```
**Output Program**

<img src="kumpulan foto/Tugas no2.jpg">
