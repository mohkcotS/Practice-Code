import java.util.Scanner;

public class Cf_2010B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1; i<= 3; i++){
            if(i != m && i != n){
                System.out.println(i);
            }
        }
    }
}
