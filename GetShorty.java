import java.util.*;
import java.io.*;

public class GetShorty {
    private static final double EPS = 0.000001;
    public static Map<Integer, LinkedList<DIPair>> adjList;

    public static double dijkstra(int start, int end, int n) {
        // Distance [size] at node i.
        double[] dist = new double[n]; Arrays.fill(dist, 0.0);

        // Override the compare function to sort in descending order.
        PriorityQueue<DIPair> pq = new PriorityQueue<>(1, new Comparator<DIPair>() {
            public int compare(DIPair i, DIPair j) {
                return j.second - i.second;
            }
        });
        pq.add(new DIPair(1.0, start));
        dist[start] = 1.0;

        // Continue until the priority queue is empty.
        while (!pq.isEmpty()) {
            DIPair pt = pq.poll();

            // Skip the node if it has been visited.
            if (Math.abs(pt.first - dist[pt.second]) > EPS) continue;

            // Only add the adjacent node if the size after
            // reaching that node is greater than the last size to
            // get to that specific node.
            for (DIPair ps : adjList.get(pt.second)) {
                if (pt.first * ps.first > dist[ps.second]) {
                    dist[ps.second] = pt.first * ps.first;
                    pq.add(new DIPair(dist[ps.second], ps.second));
                }
            }
        }

        return dist[end];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n, m, x, y;
        double f;

        n = sc.nextInt(); m = sc.nextInt();
        while (n > 0 && m > 0){
            adjList = new HashMap<>();

            // Create the adjacency list.
            for (int i = 0; i < m; i++) {
                x = sc.nextInt(); y = sc.nextInt(); f = sc.nextDouble();
                if (adjList.get(x) == null) {
                    adjList.put(x, new LinkedList<DIPair>());
                }
                if (adjList.get(y) == null) {
                    adjList.put(y, new LinkedList<DIPair>());
                }
                adjList.get(x).add(new DIPair(f, y));
                adjList.get(y).add(new DIPair(f, x));
            }

            pw.printf("%.4f\n", dijkstra(0, n - 1, n));

            n = sc.nextInt(); m = sc.nextInt();
        }
        pw.flush();
    }

    public static class DIPair implements Comparable<DIPair> {
        public Double first;
        public Integer second;

        public DIPair(double i, int j) {
            first = i;
            second = j;
        }
        
        public int compareTo(DIPair o) {
            return this.second - o.second;
        }
    }
}