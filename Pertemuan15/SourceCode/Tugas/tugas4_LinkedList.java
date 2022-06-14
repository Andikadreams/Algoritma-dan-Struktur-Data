package SourceCode.Tugas;

public class tugas4_LinkedList {
    tugas4_Node head;
    int size;
 
    public tugas4_LinkedList(){
        head = null;
        size = 0;
    }
 
    public boolean isEmpty(){
        return head == null;
    }
 
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new tugas4_Node(null, item, null);
        } else {
            tugas4_Node newNode = new tugas4_Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
 
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            tugas4_Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            tugas4_Node newNode = new tugas4_Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
 
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            tugas4_Node current = head;
            int i = 0;
            while (i< index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                tugas4_Node newNode = new tugas4_Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                tugas4_Node newNode = new tugas4_Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
 
    public int size() {
        return size;
    }
 
    public void clear() {
        head = null;
        size = 0;
    }
 
    public void print() {
        if (!isEmpty()) {
            tugas4_Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
 
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masing kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
 
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        tugas4_Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
 
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            tugas4_Node current = head;
            int i = 0;
            while (i< index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
 
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
 
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        tugas4_Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
 
    public int get(int index) throws Exception {
        if (isEmpty() ||  index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        tugas4_Node tmp = head;
        for (int i = 0; i< index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
