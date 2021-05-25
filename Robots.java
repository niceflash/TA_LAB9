import java.util.PriorityQueue;
import java.util.Scanner;

public class Robots {


    private class Pair {
        int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

    }

    public void Do() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int na = scanner.nextInt();
        int[] A = new int[na];
        int[] times = new int[n];
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b)->a.a-b.a);
        for(int i=0; i<na; i++) {
            A[i] = scanner.nextInt();
            q.add(new Pair(A[i], A[i]));
        }
        for(int i=0; i<n; i++) {
            Pair pair=q.poll();
            times[i]=pair.a;
            q.add(new Pair(pair.a+pair.b, pair.b));
        }
        q.clear();
        int nb = scanner.nextInt();
        int[] B = new int[nb];
        int max_time=0;
        for(int i=0; i<nb; i++) {
            B[i] = scanner.nextInt();
            q.add(new Pair(B[i], B[i]));
        }
        for(int i=n-1; i>=0; i--) {
            Pair pair=q.poll();
            times[i]+=pair.a;
            q.add(new Pair(pair.a+pair.b, pair.b));
            if(times[i]>max_time)
                max_time=times[i];
        }
        System.out.println(max_time);
    }


}




