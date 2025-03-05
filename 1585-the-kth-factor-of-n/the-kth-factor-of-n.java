class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        for (int i : ans) {
            System.out.print(" "+i);
        }
        if(ans.size()<k){
            return -1;
        }
        else {
            int a=ans.get(k-1);
            return a;
        }
    }
}