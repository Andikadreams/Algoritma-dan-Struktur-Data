package SourceCode.Minggu_11;

public class Tugas2_SLLMain {
    public static void main(String[] args) {
        Tugas2_SingleLinkedList SLL = new Tugas2_SingleLinkedList();
        SLL.addFirst('a');
        SLL.print();
        SLL.addLast('e');
        SLL.print();
        SLL.insertAfter('a', 'c');
        SLL.print();
        SLL.insertBefore('e', 'd');
        SLL.print();
        SLL.insertAt(1, 'b');
        SLL.print();
    }
}
