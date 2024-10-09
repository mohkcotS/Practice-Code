public class Lc_IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        int n = num;
        while (n > 0){
            if(n >= 1000){
                s.append("M");
                n-=1000;
            }
            else if(n >= 900){
                s.append("CM");
                n-=900;
            }
            else if(n >= 500){
                s.append("D");
                n-=500;
            }
            else if(n >= 400){
                s.append("CM");
                n-=400;
            }
            else if(n >= 100){
                s.append("C");
                n-=100;
            }
            else if(n >= 90){
                s.append("XC");
                n-=90;
            }
            else if(n >= 50){
                s.append("L");
                n-=50;
            }
            else if(n >= 40){
                s.append("XL");
                n-=40;
            }
            else if(n >= 10){
                s.append("X");
                n-=10;
            }
            else if(n == 9){
                s.append("IX");
                n-=9;
            }
            else if(n >= 5){
                s.append("V");
                n-=5;
            }
            else if(n == 4){
                s.append("IV");
                n-=4;
            }
            else {
                s.append("I");
                n-=1;
            }

        }

        return s.toString();
    }

}
