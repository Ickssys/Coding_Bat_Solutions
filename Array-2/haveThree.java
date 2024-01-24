public static boolean haveThree(int[] nums){
    int countThrees = 0;
    boolean flag = false;
    for(int i = 0; i < nums.length - 1; i++){
       if(nums[i] == 3 && nums[i + 1] == nums[i]){
          flag = true;
       }else if(nums[i] == 3){
          countThrees++;  
       }
    }
    if(nums[nums.length - 1] == 3){
       countThrees++;
    }
    return !flag && countThrees == 3;
 }