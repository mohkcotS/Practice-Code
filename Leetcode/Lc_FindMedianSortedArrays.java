class Lc_FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int count = length/2;

        int []a = new int[length];
        int s1 = 0, s2=0;
        for(int i = 0; i <= count;i++){
            if(s1 == nums1.length){
                a[i] = nums2[s2];
                s2++;
            }
            else if(s2 == nums2.length){
                a[i] = nums1[s1];
                s1++;
            }
            else if(nums1[s1] < nums2[s2]){
                a[i] = nums1[s1];
                s1++;
            }
            else {
                a[i] = nums2[s2];
                s2++;
            }
        }
        if(length % 2 == 0){
            return (double) (a[count] + a[count-1])/2;
        }
        else {
            return (a[count]);
        }

    }
}