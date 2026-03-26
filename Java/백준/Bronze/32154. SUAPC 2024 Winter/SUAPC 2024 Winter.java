import java.io.*;
import java.util.*;
public class Main {
    static String[][] board = {{"11", "A B C D E F G H J L M"},
            {"9", "A C E F G H I L M"},
            {"9", "A C E F G H I L M"},
            {"9", "A B C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A B C F G H L M"}};
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        n--;
        System.out.println(board[n][0]);
        System.out.println(board[n][1]);
    }
}

