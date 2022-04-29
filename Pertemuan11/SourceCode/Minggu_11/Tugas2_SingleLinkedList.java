package SourceCode.Minggu_11;

public class Tugas2_SingleLinkedList {
    Tugas2_Node head;//posisi awal linked list
    Tugas2_Node tail;//posisi akhir linked list

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Tugas2_Node tmp = head;
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

    public void addFirst(char input){
        Tugas2_Node ndInput = new Tugas2_Node(input,null);
        if(isEmpty()){//jika linked list kosong
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(char input){
        Tugas2_Node ndInput = new Tugas2_Node(input,null);
        if(isEmpty()){
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(char key, char input){
        Tugas2_Node ndInput = new Tugas2_Node(input,null);
        Tugas2_Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, char input){
        if(index < 0){
            System.out.println("Indeks salah");
        }else if(index == 0){
            addFirst(input);
        }else{
            Tugas2_Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Tugas2_Node(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

    public void insertBefore(char key, char input){
        Tugas2_Node ndInput = new Tugas2_Node(input,null);
        Tugas2_Node temp = head;
        while(temp != null){
            if((temp.data == key) && (temp == head)){
                this.addFirst(input);
                break;
            }else if(temp.next.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        }
    }
}
