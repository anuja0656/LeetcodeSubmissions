class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;
        for(int i=n-1;i>=2;i--){
            int low=0,high=i-1;
            while(low<high){
                if(nums[low]+nums[high]>nums[i]){
                    ans+=(high-low);
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return ans;
    }
}