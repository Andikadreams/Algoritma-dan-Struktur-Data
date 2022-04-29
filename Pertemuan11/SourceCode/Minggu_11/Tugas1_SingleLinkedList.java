package SourceCode.Minggu_11;

public class Tugas1_SingleLinkedList {
    Tugas1_Node head;//posisi awal linked list
    Tugas1_Node tail;//posisi akhir linked list
    //

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if (!isEmpty()){
            Tugas1_Node tmp = head;
            System.out.print("Isi Linked List :\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input){
        Tugas1_Node ndInput = new Tugas1_Node(input, null);
        if(isEmpty()) {//jika linked list kosong
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input){
        Tugas1_Node ndInput = new Tugas1_Node(input, null);
        if (isEmpty()){
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input){
        Tugas1_Node ndInput = new Tugas1_Node(input, null);
        Tugas1_Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp =temp.next;
        }while(temp != null);
    }

    public void insertBefore(int key, int input){
        Tugas1_Node ndInput =new Tugas1_Node(input, null);
        Tugas1_Node temp =head;
        while(temp != null){
            if((temp.data == key) && (temp == head)){
                this.addFirst(input);
                System.out.println("Berhasil Menambahkan Data");
                //jika insert pada awal linked list maka memanggil method addFirst          
                break;
            }else if (temp.next.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                System.out.println("Berhasil Menambahkan Data.");
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("Indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else{
            Tugas1_Node temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Tugas1_Node(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

    public int getData(int index){
        Tugas1_Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(int key){
        Tugas1_Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return -1;
        }else{
            return index;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            Tugas1_Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        }else{
            Tugas1_Node temp = head;
            while(temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                }else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index == 0) {
            removeFirst();
        } else {
            Tugas1_Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}