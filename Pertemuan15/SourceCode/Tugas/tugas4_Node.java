package SourceCode.Tugas;

public class tugas4_Node {
    int data;
    tugas4_Node prev;
    tugas4_Node next;

    tugas4_Node(tugas4_Node prev, int data, tugas4_Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
