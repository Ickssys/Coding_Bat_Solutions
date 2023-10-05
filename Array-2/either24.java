public static boolean either24(int[] nums){
       boolean seen22 = false, seen44 = false; 
       for(int i = 0; i < nums.length - 1; i++){
        if(nums[i] == 2 && nums[i+1] == nums[i]){
            seen22 = true;
        }
        if(nums[i] == 4 && nums[i+1] == nums[i]){
            seen44 = true;
        }
       }
       return seen22 != seen44;
    }