public class Lc_RomanToInteger {
    public int romanToInt(String s) {
        int sum=0;
        for(int i = 0; i<s.length();i++){
            int current = 0;
            int next = 0;
            int value = 0;
            switch (s.charAt(i)) {
                case 'I' -> {
                    value = 1;
                    current = 1;
                }
                case 'V' ->{
                    value = 5;
                    current  = 2;
                }
                case 'X' ->{
                    value = 10;
                    current  = 3;
                }
                case 'L' ->{
                    value = 50;
                    current  = 4;
                }
                case 'C' ->{
                    value = 100;
                    current  = 5;
                }
                case 'D' ->{
                    value = 500;
                    current  = 6;
                }
                case 'M' ->{
                    value = 1000;
                    current  = 7;
                }
            }
            if(i != s.length()-1) {
                switch (s.charAt(i + 1)) {
                    case 'I' -> next = 1;

                    case 'V' -> next = 2;

                    case 'X' -> next = 3;

                    case 'L' -> next = 4;

                    case 'C' -> next = 5;

                    case 'D' -> next = 6;

                    case 'M' -> next = 7;

                }
            }
            else {
                return sum + value;
            }
            
            if(current < next){
                sum -= value;
            }
            else {
                sum += value;
            }
            

        }

        return sum;
    }
}
