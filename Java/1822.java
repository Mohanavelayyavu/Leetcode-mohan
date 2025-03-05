class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for(int n : nums){
            if (n<0)  neg++;
            if(n==0) return 0;
            }
        
        return neg %2==0 ? 1 : -1;
    }
}
