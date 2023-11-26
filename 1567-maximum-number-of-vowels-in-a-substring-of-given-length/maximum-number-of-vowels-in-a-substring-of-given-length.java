import java.util.*;
class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
                System.out.println(n);


        int sum=0;
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        System.out.println(set);
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                sum++;
            }
        }
                System.out.println(sum);
        
        int ans=0;
        ans=sum;
        for(int i=k;i<n;i++){
            if(set.contains(s.charAt(i-k))){
                sum--;
            }
            if(set.contains(s.charAt(i))){
                sum++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}