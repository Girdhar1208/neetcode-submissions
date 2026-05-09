class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // if(nums.length==1){
        //     return false;
        // }
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]==nums[i]){
        //         return true;
        //     }
        // }
        // return false;
        Map<Integer,Integer> mpp= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(int c : mpp.values()){
            if(c>1){
                return true;
            }
        }
        return false;
    }
}