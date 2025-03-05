class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum = 0, digitsum = 0;
       for(int num:nums){
           elementsum+=num;
           
        
        int temp= num;
        while(temp>0){
            digitsum+=temp%10;
            
        temp/=10;
            }
           }
        return Math.abs(elementsum-digitsum);
        
    }
}
