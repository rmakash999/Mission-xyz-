import java.util.Scanner;

public class Main {
    static class game{
        String name;
        int users;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0){
            game[] games = new game[10];
            games[0] = new game();
            games[0].name = "Akash";
            games[0].users = 2000;
            System.out.println(games[0].name);
            


        }
    }
    
}
