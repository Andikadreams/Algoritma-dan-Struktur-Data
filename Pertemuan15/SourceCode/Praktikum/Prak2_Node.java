package SourceCode.Praktikum;

public class Prak2_Node {
    int data;
    Node prev, next;
 
    Prak2_Node(Node prev, int data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
