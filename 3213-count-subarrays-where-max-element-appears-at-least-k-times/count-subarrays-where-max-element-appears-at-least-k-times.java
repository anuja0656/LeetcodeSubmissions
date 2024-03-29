class Solution {
    public long countSubarrays(int[] nums, int k) {
        long result=0;
        int countMax=0;
        int n=nums.length;
        int i=0;
        int j=0;
        int maxE=0;
        for( int m=0;m<n;m++){
            if(nums[m]>maxE){
                maxE=nums[m];
            }
        }
         
        while(j<n){
            if(nums[j]==maxE){
                countMax++;
            }
            while(countMax>=k){
                result+=n-j;
                if(nums[i]==maxE){
                    
                    countMax--;
                }
                i++;
            }
            j++;
        }
        return result;
    }
}