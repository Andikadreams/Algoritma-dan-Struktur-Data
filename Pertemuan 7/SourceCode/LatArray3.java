package SourceCode;
public class LatArray3{
     int[] data;
     int max=0;
     int posisi;
     int jumlah=0;

    LatArray3(int arr[]){
        data=arr;
    }

    void tampil(){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"  ");
        }
        System.out.println();
    }
    void selectionSort(){
        for(int i=0;i<data.length-1;i++){
            int idxMin=i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]>data[idxMin]){
                    idxMin=j;
                }
            }
            int tmp=data[idxMin];
            data[idxMin]=data[i];
            data[i]=tmp;
        }
    }
    int Search(int cari, int left, int right){
        int mid;
        if(right >=left){
            mid=(left+right)/2;
            if(cari==data[mid]){
                return(mid);
            }else if(data[mid] >cari) {
                return Search(cari, mid + 1, right);
            }else{
                return Search(cari, left, mid - 1);
            }
        }
        return -1;
    }

    int nilaiTerbesar(){
        for(int i =0;i<data.length;i++){
            if (data[i]>max){
                max=data[i];
            }
        }
        System.out.println("Nilai terbesarnya adalah : " +max);
        return max;
    }

    void tampilPosisi(int pos){
        for(int i=0;i<data.length;i++){
            if(data[i] == max){
                jumlah++;
            }
        }
        System.out.print("dengan jumlah " +jumlah);
        System.out.println();
        posisi=max;
        for(int i=0;i<data.length;i++){
            if(posisi==data[i]){
                pos=i;
                System.out.println("Data ditemukan pada indeks ke-" +pos);
            }
        }
    }
}
