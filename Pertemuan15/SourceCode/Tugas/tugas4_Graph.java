package SourceCode.Tugas;

public class tugas4_Graph {
    int vertex;
    tugas4_LinkedList list[];
 
    public tugas4_Graph(int vertex) {
        this.vertex = vertex;
        list = new tugas4_LinkedList[vertex];
        for (int i = 0;  i< vertex; i++) {
            list[i] = new tugas4_LinkedList();
        }
    }
 
    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }
 
    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size());
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i< vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source)
                    ++totalIn;
            }
                //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }
 
    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i< vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }
 
    public void removeAllEdges() {
        for (int i = 0; i< vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasildikosongkan");
    }

    //No 4
    public void printGraph() throws Exception {
        String namaKota = "";
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                if (i == 0) {
                    namaKota = "Surabaya";
                } else if (i == 1) {
                    namaKota = "Bandung";
                } else if (i == 2) {
                    namaKota = "Gresik";
                } else if (i == 3) {
                    namaKota = "jogja";
                } else if (i == 4) {
                    namaKota = "Malang";
                } else {
                    namaKota = "Jakarta";
                }
                System.out.print("Vertex " + namaKota + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void main (String[] args) throws Exception {
        tugas4_Graph graph = new tugas4_Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2); 
        graph.removeEdge(1, 2);
        graph.printGraph();
    }
}
