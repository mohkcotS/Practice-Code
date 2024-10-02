import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Cf_2009B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ;i < n;i++){
            ArrayList <Integer> l = new ArrayList<>();
            int m  = sc.nextInt();
            sc.nextLine();
            for(int j = 0; j < m; j++){
                String s = sc.nextLine();
                int x = s.indexOf("#");
                l.add(x+1);
            }
            for (int k = l.size()-1;k>=0;k--){
                System.out.print(l.get(k) + " ");
            }
            System.out.println();
            l.clear();
        }
    }
}
