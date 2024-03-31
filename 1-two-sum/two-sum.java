class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ans=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(ans.containsKey(a)){
                return new int[]{ans.get(a),i};
            }
            else{
                ans.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}