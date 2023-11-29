class Solution {
    public int largestAltitude(int[] gain) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            System.out.println(sum);
            maxSum=Math.max(maxSum,sum);

        }
        if(maxSum<0){
            return 0;
        }
        return maxSum;
    }
}