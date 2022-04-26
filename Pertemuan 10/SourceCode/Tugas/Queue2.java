package SourceCode.Tugas;

public class Queue2{
    Mahasiswa[] Q;
    int front,rear,size,max;
    Queue2(int n){
        max =n;
        Q =new Mahasiswa[max];
        size=0;
        front=rear=-1;
    }
    void Create(){
        Q =new Mahasiswa[max];
        size =0;
        front =rear= -1;
    }
    boolean IsEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    boolean IsFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }
    void peek(){
        if(!IsEmpty()){
            System.out.println("Antrian Terdepan = " + Q[front].nama + " " + Q[front].nim + " " + Q[front].absen + " " + Q[front].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    void peekPosition(String ceknim){
        if(!IsEmpty()){
            int i=front;
            int cek=0;
            while(i !=rear){
                if (Q[i].nama.equals(ceknim)){
                    System.out.println("Mahasiswa dengan NIM " + ceknim + " berada di posisi index " + i);
                    cek++;
                }
                i=(i + 1) % max;
            }
            if(Q[i].nama.equals(ceknim)){
                System.out.println(Q[i].nama + " " + Q[i].nim + " " + Q[i].absen + " " + Q[i].ipk);
                cek++;
            }
            if(cek==0){
                System.out.println("Mahasiswa dengan NIM " + ceknim + " tidak ditemukan");
            }

        }else{
            System.out.println("Queue masih kosong");
        }
    }
    void peekRear(){
        if(!IsEmpty()){
            System.out.println("Antrian Terbelakang = " + Q[rear].nama + " " + Q[rear].nim + " " + Q[rear].absen + " " + Q[rear].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    void printMahasiswa(int cariindex){
        if(!IsEmpty()){
            if (Q[cariindex]==null){
                System.out.println("Index / Antrian ke-" + cariindex + " Masih Kosong");
            }else{
                System.out.println("Mahasiswa dengan Index / Antrian ke-" + cariindex + " adalah " + Q[cariindex].nama);
            }
        }
    }
    void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i=front;
            while(i !=rear){
                System.out.println(Q[i].nama + " " + Q[i].nim + " " + Q[i].absen + " " + Q[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(Q[i].nama + " " + Q[i].nim + " " + Q[i].absen + " " + Q[i].ipk);
            System.out.println("Jumlah Elemen = " + size);
        }
    }
    void clear(){
        if(!IsEmpty()){
            front =rear= -1;
            size =0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    void Enqueue(Mahasiswa data){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
            System.exit(0);
        }else{
            if(IsEmpty()){
                front =rear= 0;
            }else{
                if(rear==max - 1){
                    rear =0;
                }else{
                    rear++;
                }
            }
            Q[rear]=data;
            size++;
        }
    }
    Mahasiswa Dequeue(){
        Mahasiswa data =new Mahasiswa("", "", 0, 0);
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
            System.exit(0);
        }else{
            data =Q[front];
            size--;
            if(IsEmpty()){
                front =rear = -1;
            }else{
                if(front==max - 1){
                    front =0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
}
