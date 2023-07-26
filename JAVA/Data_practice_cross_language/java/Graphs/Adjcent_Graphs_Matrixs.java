

class Graph{
    public int value;
    public int matrixs[][];

    public Graph(int vertixs){
        this.value = vertixs;
        matrixs = new int[vertixs][vertixs];
    }

    //adding edges
    public void addEdges(int vol,int node){
        matrixs[vol][node] = 1;
        //undirected edges
        matrixs[node][vol] = 1;
    }

    //print graph
    public void printGraph(){
        System.out.println("GRAPH : -> ");

        for(int i=0;i<value;i++){
            for(int j=0;j<value;j++){
                System.out.print(" "+matrixs[i][j]);
            }     
            System.out.println("");
        }

        //connections
        for(int i=0;i<value;i++){
            System.out.println("Node "+i+" is connected -> ");
            for(int j=0;j<value;j++){
                if(matrixs[i][j] == 1){
                    System.out.print(" "+j);
                }
            }     
            System.out.println("");
        }
    }
}



public class Adjcent_Graphs_Matrixs {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdges(0, 1);
        graph.addEdges(0, 4);
        graph.addEdges(1, 2);
        graph.addEdges(1, 3);
        graph.addEdges(1, 4);
        graph.addEdges(2, 3);
        graph.addEdges(3, 4);

        graph.printGraph();
    }
}
