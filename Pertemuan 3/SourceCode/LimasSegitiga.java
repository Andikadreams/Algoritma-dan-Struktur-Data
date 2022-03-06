package SourceCode;

public class LimasSegitiga {
    int alas,tinggi,tinggiLimas,sisiTegak;
    public LimasSegitiga(int a,int t,int tL,int sT){
        alas=a;
        tinggi=t;
        tinggiLimas=tL;
        sisiTegak=sT;
    }
    double luasPermukaan(){
        return 0.5*alas*tinggi+3*sisiTegak;
    }
    double volume(){
        return 0.3*(0.5*alas*tinggi)*tinggiLimas;
    }
    
}
