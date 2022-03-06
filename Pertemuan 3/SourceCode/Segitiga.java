package SourceCode;

public class Segitiga {
    public int alas,tinggi;
    
    Segitiga(int a,int t){
        alas = a;
        tinggi = t;
    }

    int hitungLuas(){
        return alas*tinggi/2;
    }
    double hitungKeliling(){
        return alas+alas+alas;
    }
}
