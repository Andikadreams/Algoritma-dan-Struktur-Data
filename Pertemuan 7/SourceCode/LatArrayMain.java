package SourceCode;
public class LatArrayMain{
    public static void main(String[] args){
        int bilangan[]={12,17,2,1,70,50,90,17,2,90};
        LatArray3 array=new LatArray3(bilangan);
        int jumlah=10;
        int max=0;
        System.out.println("====================================");
        System.out.println("-=-=-=-=-=-=-=-=DATA-=-=-=-=-=-=-=-=");
        array.tampil();
        array.selectionSort();
        System.out.println("====================================");
        System.out.println("         Setelah di sorting");
        System.out.println("====================================");
        array.tampil();
        System.out.println("====================================");
        array.nilaiTerbesar();
        array.Search(max, 0, jumlah - 1);
        array.tampilPosisi(max);
    }
}
