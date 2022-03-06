package SourceCode;

public class maincoba2 {
    public static void main(String[] args) {
        coba2dimensi [][] coba = new coba2dimensi[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                coba[i][j]= new coba2dimensi();
                if(i==0&&j==0){
                coba[i][j].namaDepan="Andika";
                coba[i][j].namaBelakang="Ainur";
                }
                else if(i==1&&j==1){
                coba[i][j].namaDepan="Budi";
                coba[i][j].namaBelakang="Santoso";
                }
            }
        }
        for(int i=0;i<2;i++){
                System.out.println("Nama ke "+i);
                System.out.println("Nama depan : "+coba[i][i].namaDepan);
                System.out.println("Nama belakang : "+coba[i][i].namaBelakang);
            }
    }
}
