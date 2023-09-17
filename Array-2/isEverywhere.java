public boolean isEverywhere(int[] nums, int val){
    for(int i = 0; i < nums.length - 1; i++){
        //check to see if each adjacent pair does not equal val;
        if(nums[i] != val && nums[i+1] != val){
            return false;
        }
    }
    return true;
}