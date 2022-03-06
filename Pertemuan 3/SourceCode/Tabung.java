package SourceCode;

public class Tabung {
    int jari,tinggi;
    public Tabung(int j,int t){
        jari=j;
        tinggi=t;
    }
    public double luasPermukaan(){
        return 3.14*(jari*jari)*tinggi;
    }
    public double volume(){
        return 2*3.14*jari*(jari+tinggi);
    }
}
