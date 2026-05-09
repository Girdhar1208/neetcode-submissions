class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target - nums[i];
            if(mpp.containsKey(diff) && mpp.get(diff)!=i ){
                return new int[]{i,mpp.get(diff)};
            }
        }
        // it will cover the duplicate scenerio also because in hashmap key is always unique so while passing the values into hashmap when the duplicate value comes up in array then for the key the value will be overridden, and now when we are checking if it contains the target then it will cover for the value which was overridden
        return new int[0];

    }
}
