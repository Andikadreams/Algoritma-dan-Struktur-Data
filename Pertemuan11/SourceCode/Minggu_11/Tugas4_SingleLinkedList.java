package SourceCode.Minggu_11;

public class Tugas4_SingleLinkedList {
    Tugas4_Node head;
    Tugas4_Node tail;
    boolean IsEmpty(){
        return head==null;
    }
    void tambahData(String nim, String nama, int absen, double ipk){
        Tugas4_Node ndInput = new Tugas4_Node(nim,nama,absen,ipk, null);
        if(IsEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    void print(){
        if (!IsEmpty()){
            Tugas4_Node tmp = head;
            int antrian = 0;
            System.out.println("Antrian : ");
            while (tmp != null) {
                System.out.println("Mahasiswa ke-" + (antrian+1) + " = " + tmp.nim + " " + tmp.nama + " " + tmp.absen+ " " + tmp.ipk);
                tmp = tmp.next;
                antrian++;
            }
            System.out.println("");
        }else{
            System.out.println("Antrian masih Kosong");
        }
    }
    void AntrianTerdepan(){
        if(!IsEmpty()){
            Tugas4_Node tmp = head;
            System.out.println("Antrian Terdepan = " + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    void AntrianBelakang(){
        if(!IsEmpty()){
            Tugas4_Node tmp = head;
            while(tmp != null){
                if(tmp == tail){
                    System.out.println("Antrian paling belakang : \n" + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
                }
                tmp = tmp.next;
            }
        }else{
            System.out.println("Antrian Masih Kosong");
        }
    }
    void cariDataNim(String key){
        Tugas4_Node tmp = head;
        int index = 0;
        while(tmp != null && (!(tmp.nim.equals(key)))){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            System.out.println("Antrian Kosong");
        }else{
            System.out.println("Data " + key + " berada pada index ke " + index);
        }
        System.out.println("Data Mahasiswa : \n" + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
    }
    void cariDataIndex(int index) {
        if (IsEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            Tugas4_Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada Index ke-" + index + " adalah " + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        }
    }
    void remove(){
        if (IsEmpty()){
            System.out.println("Antrian Masih Kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            Tugas4_Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }    
}
