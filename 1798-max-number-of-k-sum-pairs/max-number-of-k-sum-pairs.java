class Solution {
    public int maxOperations(int[] a, int k) {
        Arrays.sort(a);
        int i=0,j=a.length-1;
        int count=0;
        while(i<j){
            if(a[i]+a[j]==k){
                count++;
                i++;j--;
            }
            else if(a[i]+a[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return count;
    }
}