import java.util.*;

public class WeightOfTheSystemOfNestedSegments {
    

    static class Point {
        int weight, position, id;
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Point[] points = new Point[m];

        for (int i = 0; i < m; i++) {
            points[i] = new Point();
            points[i].position = sc.nextInt();
            points[i].weight = sc.nextInt();
            points[i].id = i + 1;
        }

        Arrays.sort(points, Comparator.comparingInt((Point a) -> a.weight));

        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (i < 2 * n) {
                sum += points[i].weight;
            } else {
                points = Arrays.copyOfRange(points, 0, i);
                break;
            }
        }

        Arrays.sort(points, Comparator.comparingInt((Point a) -> a.position));

        System.out.println(sum);
        for (int i = 0; i < n; i++) {
            System.out.println(points[i].id + " " + points[2 * n - i - 1].id);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }
}
