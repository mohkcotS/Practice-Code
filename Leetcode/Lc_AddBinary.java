public class Lc_AddBinary {
    public String addBinary(String a, String b) {
        String result = "";
        int size = Math.max(a.length(),b.length()) ;
        int x = a.length()-1;
        int y = b.length()-1;
        int plus = 0;
        int sum = 0;
        for (int i = 0; i < size ;i++){
            if(x >= 0){
                sum += Integer.parseInt(a.charAt(x)+"");
            }
            if(y >= 0){
                sum += Integer.parseInt(b.charAt(y)+"");
            }
            sum += plus;
            System.out.println(sum);
            if(sum >= 2){
                plus = 1;
                result += String.valueOf(sum%2);
            }
            else {
                plus = 0;
                result += String.valueOf(sum);
            }
            sum = 0;
            x--;
            y--;
        }
        if(plus == 1){
            result  += String.valueOf(plus);
        }
        String s = "";
        for(int i = result.length()-1; i>=0;i--){
            s += result.charAt(i);
        }
        return s;
    }
}
