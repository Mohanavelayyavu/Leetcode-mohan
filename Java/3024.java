class Solution {
    public String triangleType(int[] nums) {
        if(nums.length!=3){
            return "Invalid Input";
            }
        Arrays.sort(nums);
        
        if(nums[0]+nums[1]<=nums[2]){
            return "none";
            }
        if(nums[0]==nums[1]&&nums[1]==nums[2]){
            return "equilateral";
            }
        if(nums[0]==nums[1]||nums[1]==nums[2]){
            return "isosceles";
            }
        return "scalene";
            
    }
}
