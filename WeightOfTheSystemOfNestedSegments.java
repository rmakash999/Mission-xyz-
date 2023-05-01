import java.util.*;

public class WeightOfTheSystemOfNestedSegments {
    static class Point{
        int weight, position, id;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Point[] points = new Point[m];
            for (int i = 0; i< m; i++){
                points[i] = new Point();
                points[i].position = sc.nextInt();
                points[i].weight = sc.nextInt();
                points[i].id = i+1;
            }
            for (Point p :points){
                System.out.println("Weight: " + p.weight + " Position: " + p.position + " Index: " + p.id );
                
            }
        }
    }

}
