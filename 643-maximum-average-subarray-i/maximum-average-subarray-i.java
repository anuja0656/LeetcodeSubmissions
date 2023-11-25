class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        double sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
                System.out.println(sum);

        // sum/=k;
        System.out.println(sum);
        ans=sum;
        for(int i=k;i<n;i++){
            sum=sum+nums[i]-nums[i-k];
                    System.out.println(sum);

            // sum/=k;
                    System.out.println(sum);

            ans=Math.max(ans,sum);
        }
        return ans/k;
    }
}