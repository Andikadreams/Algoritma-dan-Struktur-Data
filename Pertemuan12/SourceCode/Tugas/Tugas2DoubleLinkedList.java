package SourceCode.Tugas;

public class Tugas2DoubleLinkedList {
    Tugas2Node head;
    int size;

    public Tugas2DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String id, String judulFilm, Double rating) {
        if (isEmpty()) {
            head = new Tugas2Node(null, id, judulFilm, rating, null);
        } else {
            Tugas2Node newNode = new Tugas2Node(null, id, judulFilm, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String id, String judulFilm, Double rating) {
        if (isEmpty()) {
            addFirst(id, judulFilm, rating);
        } else {
            Tugas2Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Tugas2Node newNode = new Tugas2Node(current, id, judulFilm, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String id, String judulFilm, Double rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judulFilm, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Tugas2Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Tugas2Node newNode = new Tugas2Node(null, id, judulFilm, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Tugas2Node newNode = new Tugas2Node(current.prev, id, judulFilm, rating, current);
                newNode.prev = newNode;
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
            Tugas2Node tmp = head;
            System.out.println("ID Film\t\t Judul Film \t\t\t Rating");
            while (tmp != null) {
                System.out.print(tmp.id + "\t\t ");
                System.out.print(tmp.judulFilm + "\t\t ");
                System.out.print(tmp.rating + "  \t\t");
                System.out.println("");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
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
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Tugas2Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Tugas2Node current = head;
            int i = 0;
            while (i < index) {
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

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return (head.id + head.judulFilm + head.rating);
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Tugas2Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return (tmp.id + tmp.judulFilm + tmp.rating);
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Tugas2Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return (tmp.id + tmp.judulFilm + tmp.rating);
    }

    public void search(String search) {
        int i = 0;
        boolean cek = false;
        Tugas2Node current = head;
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
        while (current != null) {
            if (search.equals(current.id)) {
                cek = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (cek) {
            System.out.println("Data " + search + " ditemukan pada index ke : " + i);
        } else {
            System.out.println("Index tidak ditemukan");
        }
    }

    public void sort(){
        Tugas2Node current = null, index = null;
        Double temp;
        String tmpn,tnmp;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.rating < index.rating) {
                        temp = current.rating;
                        current.rating = index.rating;
                        index.rating = temp;
                        tmpn = current.id;
                        current.id = index.id;
                        index.id = tmpn;
                        tnmp = current.judulFilm;
                        current.judulFilm = index.judulFilm;
                        index.judulFilm = tnmp;
                    }
                }
            }
            print();
        }
    }
}
