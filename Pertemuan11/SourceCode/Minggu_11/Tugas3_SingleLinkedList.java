package SourceCode.Minggu_11;

public class Tugas3_SingleLinkedList {
    Tugas3_Node head;
    Tugas3_Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Tugas3_Node tmp = head;
            System.out.println("");
            while (tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek(){
        if(!isEmpty()){
            Tugas3_Node tmp = head;

            System.out.println("Isi Stack Teratas = " + tmp.data);

        }else{
            System.out.println("Stack Masih Kosong");
        }
    }

    public void pushFirst(String input){
        Tugas3_Node ndInput = new Tugas3_Node(input, null);
        if(isEmpty()){//jika linked list kosong
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
}
