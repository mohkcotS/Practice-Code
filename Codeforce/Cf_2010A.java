import java.util.Scanner;

public class Cf_2010A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ;i < n;i++){
            int sum = 0;
            int m = sc.nextInt();
            for (int j = 0; j< m;j++){
                if(j%2 == 0){
                    sum += sc.nextInt();
                }
                else{
                    sum -= sc.nextInt();
                }
            }
            System.out.println(sum);
        }
    }
}
