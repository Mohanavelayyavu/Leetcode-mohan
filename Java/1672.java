class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for(int[] customers : accounts){
            int wealth=0;
            for(int bank : customers){
                wealth+=bank;
                maxWealth = Math.max(maxWealth,wealth);
                }
            }
        return maxWealth;
    }
}
