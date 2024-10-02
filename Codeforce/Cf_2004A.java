import java.util.ArrayList;
import java.util.Scanner;

public class Cf_2004A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
                int m = sc.nextInt();
                ArrayList<Integer> l = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    l.add(sc.nextInt());
                }
                if(m % 2 == 1 || m > 2){
                    System.out.println("NO");
                }
                else if (l.get(1) -l.get(0) > 1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
        }
    }
}
