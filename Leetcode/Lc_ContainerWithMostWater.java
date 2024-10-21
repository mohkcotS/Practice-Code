public class Lc_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r){
            int in;
            if(height[l] < height[r]){
                in = height[l] * (r-l);
                l++;
            }
            else {
                in = height[r] * (r-l);
                r--;
            }

            if(max < in){
                max = in;
            }

        }

        return max;
    }

}
